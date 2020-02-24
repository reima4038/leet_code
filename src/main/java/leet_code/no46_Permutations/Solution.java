package leet_code.no46_Permutations;

import java.util.ArrayList;
import java.util.List;

/**
 * 46. Permutations https://leetcode.com/problems/
 * Reference: Backtrack
 * https://leetcode.com/problems/permutations/discuss/18239/A-general-approach-to-backtracking-questions-in-Java-(Subsets-Permutations-Combination-Sum-Palindrome-Partioning)
 */
public class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        backtrack(list, new ArrayList<>(), nums);
        return list;
    }

    private void backtrack(List<List<Integer>> list, List<Integer> temp, int[] nums) {
        if(temp.size() == nums.length) {
            list.add(new ArrayList<>(temp));
        } else {
            for(int i = 0; i < nums.length; i++) {
                if (temp.contains(nums[i])) {
                    continue;
                }
                temp.add(nums[i]);
                backtrack(list, temp, nums);
                temp.remove(temp.size() - 1);
            }
        }
    }
}
