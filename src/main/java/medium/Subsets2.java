package main.java.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
https://leetcode.com/problems/subsets-ii/
*/
public class Subsets2 {
    public static List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        recursionCombination(0, nums, new ArrayList<>(), result);

        return result;
    }

    public static void recursionCombination(int count, int[] array, List<Integer> list, List<List<Integer>> result) {
        result.add(new ArrayList<>(list));
        if(count < array.length) {
            for (int i = count; i < array.length; i++) {
                if(i != count && array[i - 1] == array[i]) {
                    continue;
                }
                list.add(array[i]);
                recursionCombination(i + 1, array, list, result);
                list.remove(list.size() - 1);
            }
        }
    }
}
