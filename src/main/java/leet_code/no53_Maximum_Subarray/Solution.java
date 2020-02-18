package leet_code.no53_Maximum_Subarray;

/**
 * 53. Maximum Subarray
 * https://leetcode.com/problems/
 * Reference: https://leetcode.com/problems/maximum-subarray/discuss/20211/Accepted-O(n)-solution-in-java
 */
public class Solution {

    public int maxSubArray(int[] nums) {
        final int initialValue = nums[0];
        int maxOfEndingHere = initialValue;
        int maxOfSoFar = initialValue;

        for (int i = 1; i < nums.length; i++) {
            maxOfEndingHere = Math.max(maxOfEndingHere + nums[i], nums[i]);
            maxOfSoFar = Math.max(maxOfEndingHere, maxOfSoFar);
        }

        return maxOfSoFar;
    }

}
