package Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CheckBoxDemo {

    public static void main(String[] args) {


        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");

        String selectWeek="Monday";

        List<WebElement> allWeekElement=driver.findElements(By.xpath("//input[@type='checkbox']"));

        for(WebElement week: allWeekElement){

           String weektext= week.getAttribute("value");

           if(weektext.equalsIgnoreCase(selectWeek)){
               week.click();
               System.out.println(week.isSelected());
               break;
           }
        }

    }
}
