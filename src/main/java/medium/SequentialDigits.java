package main.java.medium;

import java.util.ArrayList;
import java.util.List;

/*
https://leetcode.com/problems/sequential-digits/description
*/
public class SequentialDigits {
     public static List<Integer> sequentialDigits(int low, int high) {
        List<Integer> result = new ArrayList<>();
        int i = 12;
        int j = 11;
        int temp = i;

        while (i <= high) {
            while (i % 10 != 0) {
                if (i >= low) {
                    result.add(i);
                }
                i += j;
                if (i >= high) {
                    return result;
                }
            }
            i = temp;
            j = j * 10 + 1;
            i += j;
            temp = i;
        }

        return result;
    }
}
