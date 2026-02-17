package Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSSelectorExample {

    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://demo.nopcommerce.com/");

        // Tag Id

       // driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("laptop");

        //tag className

        //driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("t-shirt");

        //driver.get("https://demo.nopcommerce.com/login?returnUrl=%2F");

        //tag any attribute

        //driver.findElement(By.cssSelector("input[name='Email']")).sendKeys("test");

        //tag.className[attribute=’value’]

        driver.findElement(By.cssSelector("input.search-box-text[name='q']")).sendKeys("computer");


    }
}
