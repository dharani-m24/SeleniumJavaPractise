package TestNgPractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.time.Duration;

public class ParamaterTestDemo {

    WebDriver driver;
    @BeforeClass
    @Parameters({"browser"})
    void setup(String br){

        switch (br.toLowerCase()){
            case "chrome": driver =new ChromeDriver();break;
            case "edge": driver=new EdgeDriver();break;
            case "firefox": driver=new FirefoxDriver(); break;
            default: System.out.println("invalid browser"); return;
        }

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test
    void testLogo(){

        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
        WebElement logo=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@alt='company-branding']")));
        Assert.assertEquals(logo.isDisplayed(),true);

    }

    @Test
    void testTitle(){

        Assert.assertEquals(driver.getTitle(),"OrangeHRM");
    }

    @Test
    void testUrl(){

        Assert.assertEquals(driver.getCurrentUrl(),"https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

    }

    @AfterClass
    void tearDown(){
        driver.quit();
    }


}
