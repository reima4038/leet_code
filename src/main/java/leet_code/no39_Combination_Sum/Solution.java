package leet_code.no39_Combination_Sum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 39. Combination Sum https://leetcode.com/problems/
 * Reference: https://leetcode.com/problems/combination-sum/discuss/16502/A-general-approach-to-backtracking-questions-in-Java-(Subsets-Permutations-Combination-Sum-Palindrome-Partitioning)
 */
public class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(candidates);
        final int initialIterator = 0;
        backtrack(list, new ArrayList<>(), candidates, target, initialIterator);
        return list;
    }

    private void backtrack(List<List<Integer>> list, List<Integer> temp, int[] nums, int remain, int start) {
        if(remain < 0) {
            return;
        } else if (remain == 0) {
            list.add(new ArrayList<>(temp));
        } else {
            for (int i = start; i < nums.length; i++) {
                temp.add(nums[i]);
                backtrack(list, temp, nums, remain - nums[i], i);
                temp.remove(temp.size() - 1);
            }
        }
    }
}
