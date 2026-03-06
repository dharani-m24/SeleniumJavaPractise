package TestNgPractise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionDemo {


    void testTitle(){

        WebDriver driver=new ChromeDriver();

        driver.get("https://practicetestautomation.com/practice-test-login/");

        String actualTitle=driver.getTitle();

        /*if(actualTitle.equalsIgnoreCase("Test Lofin | Practice Test Automation")){
            System.out.println("passed");
        }else{
            System.out.println("failed");
        }*/

        Assert.assertEquals(actualTitle,"Test Login | Practice Test Automation");

    }


    void hardAssertion(){

        System.out.println("testing......");
        System.out.println("testing......");

        Assert.assertEquals(1,2);

        System.out.println("testing...");
        System.out.println("testing...");
    }

    @Test
    void softAssertion(){

        SoftAssert sa=new SoftAssert();

        System.out.println("testing......");
        sa.assertEquals(1,2);
        System.out.println("testing......");

        sa.assertEquals(1,2);

        System.out.println("testing...");
        sa.assertEquals(1,2);
        System.out.println("testing...");

        sa.assertAll(); //mandatory
    }
}
