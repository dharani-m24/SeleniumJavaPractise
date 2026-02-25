package Practise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadLessTesting {

    public  static void main(String[] args) {

        ChromeOptions options=new ChromeOptions();
       // options.addArguments("--headless=new");
        options.addArguments("incognito");

        WebDriver driver=new ChromeDriver(options);

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        String actualTitle=driver.getTitle();
        System.out.println(actualTitle);
        String expectedTitle="OrangeHRM";

        if(actualTitle.equals(expectedTitle)){

            System.out.println("passed");
        }
        else{
            System.out.println("failed");
        }





    }
}
