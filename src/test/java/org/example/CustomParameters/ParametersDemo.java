package org.example.CustomParameters;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersDemo {
        @BeforeClass
        @Parameters({"browser", "OS"})
        public void setUp(String browser, String OS) {
            System.out.println("TestNG_Parameters -> Setup");
            System.out.println("1. Parameter value from xml file: " + browser);
            System.out.println("2. Parameter value from xml file: " + OS);
        }

        @Test
        @Parameters({"Models"})
        public void testMethod1(String response) throws InterruptedException {
            String[] stringArray = response.split(",");
            System.out.println("TestNG_Parameters -> testMethod1");
            System.out.println("Models from xml file: " + response);
            System.out.println("stringArray[0] from xml file: " + stringArray[0]);
            System.out.println("stringArray[1] from xml file: " + stringArray[1]);
        }
}
