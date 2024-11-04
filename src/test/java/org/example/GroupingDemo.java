package org.example;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class GroupingDemo {
    @BeforeClass(alwaysRun=true)
    public void beforeClass() {
        System.out.println("Before Class");
    }

    @Test(groups = {"Regression", "smoke"})
    public void testIOS16() {
        System.out.println("Running Test - IOS 16");
    }

    @Test(groups = {"Regression", "Sanity"})
    public void testIOS13() {
        System.out.println("Running Test - IOS 13 ");
    }

    @Test(groups = { "Android" })
    public void testAndroid14() {
        System.out.println("Running Test - Android 14");
    }

    @Test(groups = { "Android" })
    public void testHawaii() {
        System.out.println("Running Test - Hawaii");
    }

    @AfterClass(alwaysRun=true)
    public void afterClass() {
        System.out.println("After Class");
    }
}
