package org.example;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.Scanner;

public class PalindfromeTest {

    PalindromeVerify palindromeVerify;
    String toBeChecked="level";
    String toBeChecked2 = "Example";

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("\nThis runs before every method");
    }

    @Test
    public void testMethod1() {
        palindromeVerify = new PalindromeVerify();
        Assert.assertTrue(palindromeVerify.testPalindrome(toBeChecked));
        System.out.println("\nRunning Test -> testMethod1");
    }

    @Test
    public void testMethod2() {
        palindromeVerify = new PalindromeVerify();
        Assert.assertTrue(palindromeVerify.testPalindrome(toBeChecked2));
        System.out.println("\nRunning Test -> testMethod2");
    }

    @Test
    public void testMethod3() {
        palindromeVerify = new PalindromeVerify();
        SoftAssert verify = new SoftAssert();
        verify.assertTrue(palindromeVerify.testPalindrome(toBeChecked));
        verify.assertTrue(palindromeVerify.testPalindrome(toBeChecked2));
        System.out.println("\nRunning Test -> testMethod3");
        verify.assertAll();
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("\nThis runs after every method");
    }

}
