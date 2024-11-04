package org.example;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class PriorityDemo {

    @BeforeClass
    public void setUp() {
        System.out.println("before class");
    }

    @AfterClass
    public void cleanUp() {
        System.out.println("after class");
    }

    @Test(priority=1)
    public void testMethod1() {
        System.out.println("testMethod1");
    }

    @Test(priority=0)
    public void testMethod2() {
        System.out.println("testMethod2");
        //Assert.assertTrue(false);
    }

    @Test(priority=2, dependsOnMethods = {"testMethod2", "testMethod1"})
    public void testMethod3() {
        System.out.println("testMethod3");
    }

}
