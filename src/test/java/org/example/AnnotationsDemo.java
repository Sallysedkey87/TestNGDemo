package org.example;

import org.testng.annotations.*;

import java.util.Scanner;

public class AnnotationsDemo {

//    @BeforeClass
//    public void setUp() {
//        System.out.println("\nAnnotationsDemo: This runs once before class");
//    }
//
//    @AfterClass
//    public void cleanUp() {
//        System.out.println("\nAnnotationsDemo: This runs once after class");
//    }
//
    @BeforeMethod
    public void beforeMethod() {
        System.out.println("\nAnnotationsDemo: This runs before every method");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("\nAnnotationsDemo: This runs after every method");
    }

    @BeforeTest
    public void beforeTestDemo() {
        System.out.println("\nAnnotationsDemo: Running Test -> Before Test");
    }

    @AfterTest
    public void afterTestDemo() {
        System.out.println("\nAnnotationsDemo: Running Test -> After Test");
    }

    @Test
    public void testMethod1() {
        System.out.println("\nAnnotationsDemo: Running Test -> testMethod1");
    }

    @Test
    public void testMethod2() {
        System.out.println("\nAnnotationsDemo: Running Test -> testMethod2");
    }

//    @BeforeSuite
//    public void beforeSuite() {
//        System.out.println("\nAnnotationsDemo:  before suite");
//    }
//
//    @AfterSuite
//    public void afterSuite() {
//        System.out.println("\nAnnotationsDemo:  after suite");
//    }

}
