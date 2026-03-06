package TestNgPractise;

import org.testng.annotations.*;

public class TC2 {

    @BeforeClass
    void beforeClass(){
        System.out.println("this is the before class");
    }

    @AfterClass
    void afterClass(){
        System.out.println("this is the after class");
    }

    @BeforeMethod
    void beforeMethod(){
        System.out.println("this is the before method");
    }

    @AfterMethod
    void afterMethod(){
        System.out.println("this is the after method");
    }

    @Test
    void test3(){
        System.out.println("This is a test3");
    }

    @Test
    void test4(){
        System.out.println("This is a test4");
    }
}
