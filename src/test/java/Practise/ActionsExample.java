package Practise;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class ActionsExample {
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        /*driver.get("https://testautomationpractice.blogspot.com/");

        //hover
        WebElement pointbtn=driver.findElement(By.xpath("//*[text()='Point Me']"));
        WebElement mobiles=driver.findElement(By.xpath("//*[text()='Mobiles']"));

        Actions act=new Actions(driver);

        act.moveToElement(pointbtn).moveToElement(mobiles).click().perform();*/

        /*//right click

        driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
       WebElement rightEle= driver.findElement(By.xpath("//*[text()='right click me']"));

       Actions act=new Actions(driver);

       act.contextClick(rightEle).perform();

       driver.findElement(By.xpath("//*[text()='Copy']")).click();

      Alert alert=driver.switchTo().alert();
      alert.accept();*/

      //double click

        /*driver.get("https://testautomationpractice.blogspot.com/");

        WebElement textbox1=driver.findElement(By.id("field1"));
        WebElement textbox2=driver.findElement(By.id("field2"));

        WebElement copyBtn=driver.findElement(By.xpath("//*[text()='Copy Text']"));

        textbox1.clear();
        textbox1.sendKeys("Welcome");

        Actions act=new Actions(driver);

        act.doubleClick(copyBtn).perform();

        if(textbox2.getAttribute("value").equalsIgnoreCase("Welcome")){

            System.out.println("Matches");
        }else{
            System.out.println("Not matches");
        }
*/

        driver.get("https://testautomationpractice.blogspot.com/");

        WebElement source=driver.findElement(By.id("draggable"));

        WebElement targetElement=driver.findElement(By.id("droppable"));

        Actions act=new Actions(driver);

        act.dragAndDrop(source,targetElement).perform();




    }


}
