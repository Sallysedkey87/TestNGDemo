package org.example.DataProviderDemo;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderData {
    @DataProvider(name = "testData",parallel = true)
    public Object[][] getData() {
        return new Object[][] {
                    {"John", 25},
                    {"Jane", 30},
                    {"Alex", 22}
            };
        }
        @Test(dataProvider = "testData")
        public void testMethod1(String name, int age) {
            System.out.println("In testMethod1:");
            System.out.println("Name: " + name + ", Age: " + age);
        }

        @Test(dataProvider = "testData")
        public void testMethod2(String name, int age) {
            System.out.println("In testMethod2:");
            System.out.println("Name: " + name + ", Age: " + age);
        }
}
