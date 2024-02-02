package main.java.easy;

import java.util.Arrays;
import java.util.Comparator;

/*
https://leetcode.com/problems/richest-customer-wealth/submissions
*/
public class RichestCustomerWealth {
    public static void main(String[] args) {
        System.out.println(maximumWealth(new int[][] {{1,5},{7,3}, {3,5}}));
    }
    public static int maximumWealth(int[][] accounts) {
        //return Arrays.stream(accounts).map(a -> Arrays.stream(a).sum()).max(Comparator.naturalOrder()).get();
        int max = Integer.MIN_VALUE;
        int sum = 0;

        for (int[] account : accounts) {
            for (int j : account) {
                sum += j;
            }
            if (sum > max) {
                max = sum;
            }
            sum = 0;
        }

        return max;
    }
}
