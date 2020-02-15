package leet_code.no35_Search_Insert_Position;

/**
 * 35. Search Insert Position
 * https://leetcode.com/problems/
 */
public class Solution {
    public int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int center = start + (end - start) / 2;
        while (start < end) {
            if (nums[center] == target) {
                return center;
            }

            if (nums[center] < target) {
                start = center + 1;
            } else {
                end = center - 1;
            }

            center = start + (end - start) / 2;
        }

        return nums[center] >= target ? center : center + 1;
    }
}
