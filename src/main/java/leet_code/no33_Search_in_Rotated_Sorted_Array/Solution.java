package leet_code.no33_Search_in_Rotated_Sorted_Array;

/**
 * 33. Search in Rotated Sorted Array
 * https://leetcode.com/problems/
 * Ref: https://leetcode.com/problems/search-in-rotated-sorted-array/discuss/14472/Java-AC-Solution-using-once-binary-search
 */
public class Solution {
   public int search(int[] nums, int target) {
      int start = 0;
      int end = nums.length - 1;
      while (start <= end) {
         int mid = (start + end) / 2;
         if (nums[mid] == target) {
            return mid;
         }

         if (nums[start] <= nums[mid]) {
            if (target < nums[mid] && target >= nums[start]) {
               end = mid - 1;
            } else {
               start = mid + 1;
            }
         } else { 
            //the case is "nums[mid] <= nums[end]"
            if (target > nums[mid] && target <= nums[end]) {
               start = mid + 1;
            } else {
               end = mid - 1;
            }
         }
      }
      return -1;
   }

}
