package Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

public class uploadFilesExample {

    public static void main(String[] args) throws AWTException, InterruptedException {

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.foundit.in/upload");

        JavascriptExecutor js= (JavascriptExecutor) driver;

        //using send keys

        driver.findElement(By.xpath("//div[contains(text(), 'Upload Resume')]")).click();

       /* driver.findElement(By.xpath("//input[@id='file-upload']"))
                .sendKeys("C:\\Users\\dhara\\OneDrive\\Documents\\Test1.txt");*/

        //using robot class

        WebElement uploadBtn=driver.findElement(By.xpath("//input[@id='file-upload']"));

        js.executeScript("arguments[0].click()",uploadBtn);

        //1)copy the file path into clipboard
        StringSelection file=new StringSelection("C:\\Users\\dhara\\OneDrive\\Documents\\Test1.txt");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(file,null);

        Thread.sleep(3000);

        //2) past the filepath

        Robot rb=new Robot();

        rb.keyPress(KeyEvent.VK_CONTROL);
        rb.keyPress(KeyEvent.VK_V);
        rb.keyRelease(KeyEvent.VK_V);
        rb.keyRelease(KeyEvent.VK_CONTROL);

        Thread.sleep(3000);

        //3)click on enter

        rb.keyPress(KeyEvent.VK_ENTER);
        rb.keyRelease(KeyEvent.VK_ENTER);

    }
}
