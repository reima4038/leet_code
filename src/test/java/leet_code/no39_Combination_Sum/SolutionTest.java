package leet_code.no39_Combination_Sum;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

/**
 * 39. Combination Sum
 * https://leetcode.com/problems/
 */
public class SolutionTest {

    private static Solution solution = new Solution();

    @Test
    void example1Test() {
        // given
        final int[] candidates = {2,3,6,7};
        final int target = 7;
        // when
        final List<List<Integer>> actual = solution.combinationSum(candidates, target);
        // then
        final List<List<Integer>> expected = Arrays.asList(
            Arrays.asList(2,2,3),
            Arrays.asList(7)
        );
        assertIterableEquals(expected, actual);
    }


    @Test
    void example2Test() {
        // given
        final int[] candidates = {2,3,5};
        final int target = 8;
        // when
        final List<List<Integer>> actual = solution.combinationSum(candidates, target);
        // then
        final List<List<Integer>> expected = Arrays.asList(
            Arrays.asList(2,2,2,2),
            Arrays.asList(2,3,3),
            Arrays.asList(3,5)
        );
        assertIterableEquals(expected, actual);
    }

}