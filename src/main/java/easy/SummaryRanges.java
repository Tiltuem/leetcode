package main.java.easy;

import java.util.ArrayList;
import java.util.List;

/*
https://leetcode.com/problems/summary-ranges/
 */
public class SummaryRanges {
    public static List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();

        if (nums.length == 0) {
            return result;
        }

        if (nums.length == 1) {
            result.add(String.valueOf(nums[0]));
            return result;
        }

        int count = 1;

        for (int i = 0; i < nums.length; i++) {
            while (i + count < nums.length && nums[i] + count == nums[i + count]) {
                count++;
            }

            if (count == 1) {
                result.add(String.valueOf(nums[i]));
            } else {
                result.add(nums[i] + "->" + nums[i + count - 1]);
                i = i + count - 1;
                count = 1;
            }
        }

        return result;
    }
}
