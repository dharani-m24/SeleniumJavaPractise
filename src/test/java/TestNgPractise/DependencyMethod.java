package TestNgPractise;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencyMethod {

    @Test
    void openApp(){
        System.out.println("url launched");
        Assert.fail();
    }

    @Test(dependsOnMethods = {"openApp"},alwaysRun = true)
    void login(){
        System.out.println("login successful");
    }

    @Test(dependsOnMethods = {"login"})
    void seachProduct(){
        System.out.println("product");
    }

    @Test(dependsOnMethods = {"seachProduct"})
    void logout(){
        System.out.println("logout");
    }
}
