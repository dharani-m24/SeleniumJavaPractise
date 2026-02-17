package Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExplicitWaitDemo {

    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();

        //Declaration

        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        driver.manage().window().maximize();

        //driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");

       WebElement username= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='username']")));

       username.sendKeys("Admin");
    }
}
