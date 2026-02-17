package Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalMethod {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();


        driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");

        //Thread.sleep(5000);
/*
        WebElement logo=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));

        boolean status=logo.isDisplayed();

        System.out.println(status);*/

        /*WebElement firstNameText=driver.findElement(By.id("FirstName"));

        firstNameText.isEnabled();
        firstNameText.sendKeys("Fnt");

        System.out.println(firstNameText);*/

        WebElement radioMale=driver.findElement(By.id("gender-male"));

        radioMale.click();

        System.out.println(radioMale.isSelected());

        WebElement radioMFeale=driver.findElement(By.id("gender-female"));

        radioMFeale.click();

        System.out.println(radioMFeale.isSelected());




    }
}
