package Practise;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.time.Duration;

public class CaptureScreenshot {

    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://demo.nopcommerce.com/");

        //full screenshot

        /*TakesScreenshot ts= (TakesScreenshot) driver;
        File sourceFile=ts.getScreenshotAs(OutputType.FILE);//
        File targetFile=new File(System.getProperty("user.dir")+"\\screenshot\\fullPage.png");
        sourceFile.renameTo(targetFile);*/

        //specific portion takescreenshot

       /* WebElement featuredproduct=driver.findElement(By.xpath("//*[@class='product-grid home-page-product-grid']"));
        File sourcefile=featuredproduct.getScreenshotAs(OutputType.FILE);
        File targetFile=new File(System.getProperty("user.dir")+"\\screenshot\\featureProduct.png");
        sourcefile.renameTo(targetFile);*/

        //capture screenshot for particular webelement
        WebElement logo=driver.findElement(By.xpath("//*[@alt='nopCommerce demo store']"));
        File sourcefile=logo.getScreenshotAs(OutputType.FILE);
        File targetFile=new File(System.getProperty("user.dir")+"\\screenshot\\logo.png");
        sourcefile.renameTo(targetFile);

    }
}
