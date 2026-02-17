package Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathExample {

    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();

        driver.get("https://automationexercise.com/login");

        driver.manage().window().maximize();

        //xpath with single Attribute

        //driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("test@gamil.com");

        //xpath with multipe attribute using and/ or operator

        //driver.findElement(By.xpath("//input[@placeholder='Name' and @name='name']")).sendKeys("md@test");

        //driver.findElement(By.xpath("//input[@placeholder='Name' or @name='nam']")).sendKeys("eyu");

        //Xpath with innertext

        driver.findElement(By.xpath("//*[text()=' Home']")).click();

        // xpath with contains

        driver.findElement(By.xpath("//button[contains(text(),'Log')]")).click();

        driver.findElement(By.xpath("//button[contains(@class,'default')]")).click();

        //xpath starts with



    }
}
