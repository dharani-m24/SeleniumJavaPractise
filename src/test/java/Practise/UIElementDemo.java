package Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class UIElementDemo {

    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://practicetestautomation.com/practice-test-login/");

       WebElement username= driver.findElement(By.id("username"));
       username.sendKeys("student");

       WebElement password=driver.findElement(By.id("password"));
       password.sendKeys("Password123");

       WebElement submitBtn=driver.findElement(By.id("submit"));
       submitBtn.click();

       String message=driver.findElement(By.cssSelector("h1.post-title")).getText();

       if(message.equalsIgnoreCase("Logged In Successfully")){
           System.out.println("Passed");
       }else {
           System.out.println("failed");
       }


    }
}
