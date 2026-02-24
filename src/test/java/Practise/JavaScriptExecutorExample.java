package Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class JavaScriptExecutorExample {

    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://testautomationpractice.blogspot.com/");

       // driver.findElement(By.id("name")).sendKeys("john");

        //sending the text into inputfield-alternate of sendkeys
       WebElement inputbox= driver.findElement(By.id("name"));

        JavascriptExecutor js= (JavascriptExecutor) driver;
        js.executeScript("arguments[0].setAttribute('value','john')",inputbox);

        //clicking on webelement-alternate way of click

        WebElement radio= driver.findElement(By.id("male"));
        js.executeScript("arguments[0].click()",radio);
    }
}
