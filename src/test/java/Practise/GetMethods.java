package Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class GetMethods {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new ChromeDriver();

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        Thread.sleep(5000);

        driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();

       // String window=driver.getWindowHandle();

        //System.out.println(window); //8CD86DCB0344A82D873331728BDD9B31

        Set windows1=driver.getWindowHandles();

        System.out.println(windows1);

        Thread.sleep(5000);

        //driver.close();

        driver.quit();


    }
}
