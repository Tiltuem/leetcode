package main.java.easy;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

/*
https://leetcode.com/problems/single-number/
*/
public class SingleNumber {
    public int singleNumber(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }

        int result = nums[0];

        for (int i = 1; i < nums.length; i++) {
            result ^= nums[i];
        }

        return result;
    }

    //solving with stream
   /* public static int singleNumber(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }

        int sum = Arrays.stream(nums).sum();

        HashSet<Integer> hashNums = (HashSet<Integer>) Arrays.stream(nums).boxed().collect(Collectors.toSet());

        int hashSum = hashNums.stream().mapToInt(Integer::intValue).sum();

        return hashSum - (sum - hashSum);
    }*/
}
