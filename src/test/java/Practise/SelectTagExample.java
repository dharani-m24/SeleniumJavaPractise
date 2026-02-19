package Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class SelectTagExample {

    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://testautomationpractice.blogspot.com/");

        WebElement dropdown=driver.findElement(By.id("country"));

        Select select=new Select(dropdown);

       // select.selectByVisibleText("Japan");
        //select.selectByValue("india");
        select.selectByIndex(5);

        //number of options in dropdown

        List<WebElement> dropdwonlist=select.getOptions();

        System.out.println("Size:"+dropdwonlist.size());

        //print the dopdown list
        for(WebElement list:dropdwonlist){

            System.out.println(list.getText());
        }

    }
}
