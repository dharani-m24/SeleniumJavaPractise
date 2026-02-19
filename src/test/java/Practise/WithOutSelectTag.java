package Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class WithOutSelectTag {

    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        driver.findElement(By.name("username")).sendKeys("Admin");
        driver.findElement(By.name("password")).sendKeys("admin123");

        driver.findElement(By.xpath("//button[text()=' Login ']")).click();

        driver.findElement(By.xpath("//*[text()='PIM']")).click();

        //non-select tag- div only

        driver.findElement(By.xpath("//label[text()='Sub Unit']/following::div[@class='oxd-select-wrapper']")).click();

        //single option

        //driver.findElement(By.xpath("//span[contains(text(),'Engineering')]")).click();

        //number of element present in dropdown

        List<WebElement> dropdownlist=driver.findElements(By.xpath("//div[@role='listbox']//span"));

        System.out.println("Size"+dropdownlist.size());

        for(WebElement dropdown:dropdownlist){

            if(dropdown.getText().equals("Sales")){

                dropdown.click();
                break;
            }
        }


    }
}
