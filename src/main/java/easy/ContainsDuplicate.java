package main.java.easy;

import java.util.HashSet;

/*
https://leetcode.com/problems/contains-duplicate
 */
public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        if (nums.length <= 1) {
            return false;
        }

        HashSet<Integer> discArr = new HashSet<>();

        for (int i : nums) {
            if (discArr.contains(i)) {
                return true;
            }
            discArr.add(i);
        }

        return false;
    }
}
