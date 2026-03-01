package DataDriven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.time.Duration;

public class DataDrivenTestCase {

    public static void main(String[] args) throws IOException {

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        String file=System.getProperty("user.dir")+"\\testData\\LoginData.xlsx";

        int rowCount=ExcelUtilis.getRowCount(file,"Sheet1");

        //read the data

        for(int r=1;r<=rowCount;r++){

            String username=ExcelUtilis.getCellData(file,"Sheet1",r,0);
            String password=ExcelUtilis.getCellData(file,"Sheet1",r,1);

            System.out.println(username+"  "+password);


            //pass the values into the application
            driver.findElement(By.xpath("//*[@placeholder='Username']")).sendKeys(username);
            driver.findElement(By.xpath("//*[@placeholder='Password']")).sendKeys(password);
            driver.findElement(By.xpath("//*[text()=' Login ']")).click();

            boolean status=false;

            //validation
            try{
                status=driver.findElement(By.xpath("//div[@class='oxd-brand-banner']")).isDisplayed();
                driver.findElement(By.xpath("//*[@class='oxd-userdropdown-tab']")).click();
                driver.findElement(By.xpath("//a[text()='Logout']")).click();
            }catch (Exception e){

            }


            if(status){
                ExcelUtilis.setCellData(file,"Sheet1",r,2,"Passed");
                ExcelUtilis.fillGreenColor(file,"Sheet1",r,2);
            }else{
                ExcelUtilis.setCellData(file,"Sheet1",r,2,"Failed");
                ExcelUtilis.fillRedColor(file,"Sheet1",r,2);
            }
        }








    }
}
