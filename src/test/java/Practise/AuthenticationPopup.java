package Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class AuthenticationPopup {

    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //driver.get("https://the-internet.herokuapp.com/basic_auth");

        //syntax
        https://username:password@the-internet.herokuapp.com/basic_auth

        driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
        WebElement heading=driver.findElement(By.xpath("//h3[text()='Basic Auth']"));
        System.out.println(heading.isDisplayed());



    }
}
