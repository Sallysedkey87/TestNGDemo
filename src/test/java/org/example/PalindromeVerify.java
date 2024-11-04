package org.example;

import java.util.Scanner;

public class PalindromeVerify {

        public Boolean testPalindrome(String StringToBeChecked) {
            boolean isPalindrome = checkPalindrome(StringToBeChecked);

            if (isPalindrome) {
                System.out.println(StringToBeChecked + " is a palindrome.");
            } else {
                System.out.println(StringToBeChecked + " is not a palindrome.");
            }
            return isPalindrome;
        }

        public boolean checkPalindrome(String str) {
            int left = 0;
            int right = str.length() - 1;

            while (left < right) {
                if (str.charAt(left) != str.charAt(right)) {
                    return false;
                }
                left++;
                right--;
            }
            return true;
        }
}
