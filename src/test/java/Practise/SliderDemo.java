package Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class SliderDemo {

    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");

        WebElement min_slider=driver.findElement(By.xpath("//*[@class='price-range-block']//span[1]"));
        System.out.println("location of the min"+min_slider.getLocation()); //(59, 247)
        Actions act=new Actions(driver);
        act.dragAndDropBy(min_slider,100,247).perform();
        System.out.println("location of the min after"+min_slider.getLocation());

        //maximum slider
        WebElement max_slider=driver.findElement(By.xpath("//*[@class='price-range-block']//span[2]"));
        System.out.println("location of maximum slider"+max_slider.getLocation()); //(510, 247)
        act.dragAndDropBy(max_slider,-100,247).perform();

        System.out.println("location of maximum slider after"+max_slider.getLocation());








    }
}
