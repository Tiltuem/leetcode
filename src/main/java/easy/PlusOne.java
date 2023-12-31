package main.java.easy;

import java.util.Arrays;

/*
https://leetcode.com/problems/plus-one
*/
public class PlusOne {
    public static int[] plusOne(int[] digits) {
        if (digits[digits.length - 1] == 9) {
            int j = digits.length - 1;
            while (digits[j] == 9 && j > 0) {
                j--;
            }

            if (j == 0 && digits[0] == 9) {
                int[] result = new int[digits.length + 1];
                Arrays.fill(result, 0);
                result[0]++;

                return result;
            }

            digits[j]++;
            for (int i = j + 1; i < digits.length; i++) {
                digits[i] = 0;
            }
        } else {
            digits[digits.length - 1]++;
        }

        return digits;
    }
}
