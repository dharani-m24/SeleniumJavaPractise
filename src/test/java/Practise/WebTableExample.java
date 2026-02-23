package Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class WebTableExample {

    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://testautomationpractice.blogspot.com/");

        //number of rows
        int rowsize=driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
        System.out.println("number of rows"+rowsize);


        //number of column

        int columnSize=driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
        System.out.println("Number of column"+columnSize);

        //read specific row

       String bookName= driver.findElement(By.xpath("//table[@name='BookTable']//tr[5]//td[1]")).getText();

        System.out.println(bookName);

        //read all rows and column

        for(int r=2; r<=rowsize;r++){ //r=2  //tr[2]td[1]

            for(int c=1;c<=columnSize;c++){
                String tabledata=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText();
                System.out.print(tabledata+"\t");
            }
            System.out.println("");
        }

        //read book name who have author name is mukesh

        for(int r=2; r<=rowsize;r++){

            String authorname=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[2]")).getText();
            if(authorname.equalsIgnoreCase("Amit")){
                String bookName2=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[1]")).getText();

                System.out.println("fetch book name based on author name"+bookName2);
            }
        }

    }
}
