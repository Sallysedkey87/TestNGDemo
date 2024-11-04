package org.example.ReporterDemo;

import org.testng.Assert;
import org.testng.annotations.*;

public class Reporter {

        @BeforeClass
        public void setUp() {
            org.testng.Reporter.log("TestNG_ReportsAndLogs -> This runs once before class", true);
        }

        @AfterClass
        public void cleanUp() {
            org.testng.Reporter.log("TestNG_ReportsAndLogs -> This runs once after class", true);
        }

        @BeforeMethod
        public void beforeMethod() {
            org.testng.Reporter.log("TestNG_ReportsAndLogs -> This runs before every method", true);
        }

        @AfterMethod
        public void afterMethod() {
            org.testng.Reporter.log("TestNG_ReportsAndLogs -> This runs after every method", true);
        }

        @Test
        public void testMethod1() {
            org.testng.Reporter.log("TestNG_ReportsAndLogs -> testMethod1", true);
        }

        @Test
        public void testMethod2() {
            org.testng.Reporter.log("TestNG_ReportsAndLogs -> testMethod2", true);
            Assert.assertTrue(false);
        }

        @Test(dependsOnMethods={ "testMethod2" })
        public void testMethod3() {
            org.testng.Reporter.log("TestNG_ReportsAndLogs -> testMethod3", true);
        }
}
