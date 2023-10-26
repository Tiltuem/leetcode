package main.java.easy;

/*
https://leetcode.com/problems/search-insert-position/
 */
public class SearchInsertPosition {
    public static int searchInsert(int[] nums, int target) {
        return searchElem(nums, target, 0, nums.length - 1);
    }

    public static int searchElem(int[] nums, int target, int start, int end) {
        if (start > end) {
            return start;
        }

        int mid = (start + end) / 2;

        if (target == nums[mid]) {
            return mid;
        }
        else if (target < nums[mid]) {
            return searchElem(nums, target, start, mid - 1);
        }
        else {
            return searchElem(nums, target, mid + 1, end);
        }
    }
}
