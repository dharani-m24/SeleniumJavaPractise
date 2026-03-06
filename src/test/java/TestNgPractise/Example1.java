package TestNgPractise;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

/*
* openurl
* login
* logout
* */

public class Example1 {


    @Test(priority = 0)
    void openUrl(){
        System.out.println("Opened successfully");
    }

    @Test(priority = 1, groups = {"sanity"})
    void login(){
        System.out.println("Login successfully");
        //Assert.assertEquals(1,2);
    }

    @Test(priority = 4)
    void logout(){
        System.out.println("logout successfully");
    }



}
