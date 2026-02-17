package Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class RadioBtnElement {

    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");

       String selectgender="female";

       List<WebElement> radioBtn=driver.findElements(By.xpath("//input[@type='radio']"));
       for(WebElement btn: radioBtn){
           String gendertext= btn.getAttribute("value");

            if(gendertext.equalsIgnoreCase(selectgender)){
                btn.click();
                break;
            }


       }




    }
}
