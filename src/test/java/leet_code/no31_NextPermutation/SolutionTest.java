package leet_code.no31_NextPermutation;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

/**
 * https://leetcode.com/problems/
 */
public class SolutionTest {

    private static Solution solution = new Solution();

    @Test
    void example1Test() {
        // given
        int[] nums = {1,2,3};
        // when
        solution.nextPermutation(nums);
        // then
        final int[] expected = {1,3,2};
        assertArrayEquals(expected, nums);
    }

    @Test
    void example2Test() {
        // given
        int[] nums = {3,2,1};
        // when
        solution.nextPermutation(nums);
        // then
        final int[] expected = {1,2,3};
        assertArrayEquals(expected, nums);
    }

    @Test
    void additional1Test() {
        // given
        int[] nums = {4, 1, 3, 7, 6, 5, 2};
        // when
        solution.nextPermutation(nums);
        // then
        final int[] expected = {4, 1, 5, 2, 3, 6, 7};
        assertArrayEquals(expected, nums);
    }
}