package TestNgPractise;

import org.testng.annotations.*;

public class TC1 {

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
    void test1(){
        System.out.println("This is a test1");
    }

    @Test
    void test2(){
        System.out.println("This is a test2");
    }

    @BeforeTest
    void beforeTest(){
        System.out.println("This is before test");
    }

    @AfterTest
    void afterTest(){
        System.out.println("This is after test");
    }
}
