package Practise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class TabAndWindow {

    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://demoqa.com/browser-windows");

        //open new url in new tab

        //driver.switchTo().newWindow(WindowType.TAB); //opens a new tab

        driver.switchTo().newWindow(WindowType.WINDOW);//open a new window

        driver.get("https://demo.nopcommerce.com/");
    }
}
