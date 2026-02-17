package Practise;

/*
Test case
--------------
1)Launch Browser
2)open url
3)validate title
4)close browser

 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class FirstSeleniumDemo {

    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();

        driver.get("https://demo.nopcommerce.com/");

        String actualTitle=driver.getTitle();

        String expectedTitle="nopCommerce demo store. Home page title";

        if(actualTitle.equals(expectedTitle)){

            System.out.println("passed");
        }
        else{
            System.out.println("failed");
        }





    }
}
