package TestNgPractise;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Example2 {

    @Test(priority = 90)
    void openUrl(){
        System.out.println("Opened successfully");
    }

    @Test(priority = 100)
    void selectProduct(){
        System.out.println("selectProduct successfully");
    }

    @Test(priority = 110)
    void purchase(){
        System.out.println("purchase successfully");
        //Assert.assertEquals(1,2);
    }
}
