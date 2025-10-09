package AnnotationInTestNG;

import org.testng.annotations.*;

public class AnnoatationExamples {
    @Test
    public void test() {
        System.out.println("I am a test");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("I am a Before method");
    }


    @AfterMethod
    public void afterMethod() {
        System.out.println("I am a After method");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("I am a Before class");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("I am a After class");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("I am a Before test");
    }


    @AfterTest
    public void afterTest() {
        System.out.println("I am a After test");
    }

    @Test
    public void test1() {
        System.out.println("I am a test1");
    }

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("I am a Before suite");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("I am a After suite");



    }
}
