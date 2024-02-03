package main.java.medium;

import java.util.ArrayList;

import java.util.List;

/*
https://leetcode.com/problems/subsets/
*/
public class Subsets {
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>());

        recursionCombination(0, nums, new ArrayList<>(), result);

        return result;
    }

    public static void recursionCombination(int count, int[] array, List<Integer> list, List<List<Integer>> result) {
        if(count < array.length) {
            for (int i = count; i < array.length; i++) {
                List<Integer> copy = new ArrayList<>(list);
                copy.add(array[i]);
                recursionCombination(i + 1, array, copy, result);
                result.add(copy);
            }
        }
    }
}
