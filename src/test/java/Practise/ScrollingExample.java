package Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ScrollingExample {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://demo.nopcommerce.com/");

        JavascriptExecutor js= (JavascriptExecutor) driver;

        //scroll down page by pixel number

        js.executeScript("window.scrollBy(0,1500)","");
        System.out.println(js.executeScript("return window.pageYOffset;"));

        //scroll the visibility of element

        WebElement ele=driver.findElement(By.xpath("//h2[text()='Community poll']"));

        js.executeScript("arguments[0].scrollIntoView()",ele);

        //scroll end of the page
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");

       Thread.sleep(5000);
        //scroll top of the page
        js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
    }
}
