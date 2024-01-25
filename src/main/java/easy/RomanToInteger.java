package main.java.easy;

import java.util.HashMap;
import java.util.Map;

/*
https://leetcode.com/problems/roman-to-integer/
*/
public class RomanToInteger {
    private static final String[] ROMAN_NUMBERS = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
    private static final int[] ARABIC_NUMBERS = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

    public static int fromRoman(String romanNumeral) {
        String remainingValue = romanNumeral;
        int result = 0;

        for (int i = 0; i < ROMAN_NUMBERS.length; i++) {
            while (remainingValue.startsWith(ROMAN_NUMBERS[i])) {
                remainingValue = remainingValue.substring(ROMAN_NUMBERS[i].length());
                result += ARABIC_NUMBERS[i];
            }
        }

        return result;
    }
}
