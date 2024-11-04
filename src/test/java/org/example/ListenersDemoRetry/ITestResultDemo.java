package org.example.ListenersDemoRetry;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;


public class ITestResultDemo {
    @Test(retryAnalyzer = CustomListenerRetry.class)
    public void testMethod1() {
        System.out.println("Running -> testMethod1");
        Assert.assertTrue(false);
    }

    @Ignore
    @Test(retryAnalyzer = CustomListenerRetry.class)
    public void testMethod2() {
        System.out.println("Running -> testMethod2");
        Assert.assertTrue(true);
    }


    @AfterMethod
    public void afterMethod(ITestResult testResult) {
        if (testResult.getStatus() == ITestResult.FAILURE) {
            System.out.println("Failed: " + testResult.getMethod().getMethodName());
        }
        if (testResult.getStatus() == ITestResult.SUCCESS) {
            System.out.println("Successful: " + testResult.getName());
        }
    }
}
