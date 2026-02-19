package Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class FrameExample {

    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://demo.automationtesting.in/Frames.html");

        /*driver.switchTo().frame("singleframe");

        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("hello");
        driver.switchTo().defaultContent();
        driver.findElement(By.linkText("Home")).click();
*/
        //nexted frame

        driver.findElement(By.linkText("Iframe with in an Iframe")).click();

        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']")));

        driver.switchTo().frame(driver.findElement(By.xpath("//h5[text()='Nested iFrames']/following::iframe")));

        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("hello");

        /*driver.switchTo().defaultContent();
        driver.findElement(By.linkText("Home")).click();*/


    }
}
