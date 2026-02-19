package Practise;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class AlertExample {

    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        //Normal alert

        /*driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();

        Alert alert=driver.switchTo().alert();
         String message=  alert.getText();
        System.out.println(message);
        alert.accept();*/

        //confirmation Alert

        driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
        Alert alert2= driver.switchTo().alert();
        //alert2.accept()
        alert2.dismiss();

        //prompt-alert

        driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();

       Alert alert3= driver.switchTo().alert();
       alert3.sendKeys("Hello");
       alert3.accept();


    }
}
