package Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class DefaultLocators {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();

       //driver.get("https://practicetestautomation.com/practice-test-login/");

        //id
       // driver.findElement(By.id("username")).sendKeys("test@123");

        //name
        //driver.findElement(By.name("password")).sendKeys("1234");

        //LinkText

        driver.get("https://automationexercise.com/login");

        Thread.sleep(5000);

        driver.findElement(By.linkText("Home")).click();

        //partial link text

        //driver.findElement(By.partialLinkText("hom")).click();

        //tag

       List<WebElement> ahref= driver.findElements(By.tagName("a"));

        System.out.println(ahref.size());

        //classname

      List<WebElement> ck  =driver.findElements(By.className("menu-item"));

        System.out.println(ck.size());



    }
}
