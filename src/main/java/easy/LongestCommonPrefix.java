package main.java.easy;

import java.util.Arrays;

/*
https://leetcode.com/problems/longest-common-prefix
 */
public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        int size = strs.length;

        if (size == 0) {
            return "";
        }
        if (size == 1) {
            return strs[0];
        }

        Arrays.sort(strs);
        int i = 0;

        while (i < strs[0].length() && strs[0].charAt(i) == strs[size-1].charAt(i)) {
            i++;
        }

        return strs[0].substring(0, i);
    }
}
