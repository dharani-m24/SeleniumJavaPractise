package Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAxes {

    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();

        driver.get("https://automationexercise.com/login");

        //locating a parent element

        driver.findElement(By.xpath("//input[@data-qa='login-email']/parent::*"));

        //locating a child element

        driver.findElement(By.xpath("(//ul[@class='nav navbar-nav']/child::li)[1]"));

        //locating a ancestor element

        driver.get("https://demo.nopcommerce.com/");

        driver.findElement(By.xpath("//input[@id='small-searchterms']/ancestor::div[1]"));

        //following sibling

        driver.findElement(By.xpath("//input[@data-qa='login-email']/following-sibling::input"));

        //preceding sibling

        driver.findElement(By.xpath("//input[@data-qa='login-password']/preceding-sibling::input[2]"));

        //following element

        driver.findElement(By.xpath("//input[@data-qa='login-password']/following::input"));

        //preceding element

        driver.findElement(By.xpath("//input[@data-qa='login-password']/preceding::input"));




    }
}
