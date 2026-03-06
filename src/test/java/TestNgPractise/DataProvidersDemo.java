package TestNgPractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.time.Duration;

public class DataProvidersDemo{

    WebDriver driver;

    @BeforeClass
    void setup(){

         driver =new ChromeDriver();
        driver.get("https://practicetestautomation.com/practice-test-login/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }


    @Test(dataProvider = "login")
    void login(String uname,String pwd){

      WebElement username=driver.findElement(By.id("username"));
      username.sendKeys(uname);

      WebElement password=driver.findElement(By.id("password"));
      password.sendKeys(pwd);

      driver.findElement(By.id("submit")).click();

      boolean headingstatus=driver.findElement(By.cssSelector("h1.post-title")).isDisplayed();

      if(headingstatus){
          Assert.assertEquals(headingstatus,true);
          driver.findElement(By.xpath("//*[text()='Log out']")).click();

      }else {
          Assert.fail();
      }

    }

    @DataProvider(name="login", indices = {0,2})
    Object[][] loginData(){

        Object[][] data={
                {"student","Password123"},
                {"abc","sdnjjs"},
                {"bnxc","1234"}
        };
        return data;
    }

    @AfterClass
    void tearDown(){



    }
}
