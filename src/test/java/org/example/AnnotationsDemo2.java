package org.example;

import org.testng.annotations.*;

public class AnnotationsDemo2 {

//    @BeforeClass
//    public void setUp() {
//        System.out.println("\nAnnotationsDemo2: This runs once before class");
//    }
//
//    @AfterClass
//    public void cleanUp() {
//        System.out.println("\nAnnotationsDemo2: This runs once after class");
//    }
//
    @BeforeMethod
    public void beforeMethod() {
        System.out.println("\nAnnotationsDemo2: This runs before every method");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("\nAnnotationsDemo2: This runs after every method");
    }

    @Test
    public void testMethod1() {
        System.out.println("\nAnnotationsDemo2: Running Test -> testMethod1");
    }

    @Test
    public void testMethod2() {
        System.out.println("\nAnnotationsDemo2: Running Test -> testMethod2");
    }

//    @BeforeSuite
//    public void beforeSuite() {
//        System.out.println("\nAnnotationsDemo2:  before suite");
//    }
//
//    @AfterSuite
//    public void afterSuite() {
//        System.out.println("\nAnnotationsDemo2:  after suite");
//    }
}
