package leet_code.no53_Maximum_Subarray;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 * 53. Maximum Subarray
 * https://leetcode.com/problems/
 */
public class SolutionTest {

    private static Solution solution = new Solution();

    @Test
    void example1Test() {
        // given
        final int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        // when
        final int actual = solution.maxSubArray(nums);
        // then
        final int expected = 6;
        assertEquals(expected, actual);
    }

    @Test
    void additional1Test() {
        // given
        final int[] nums = {7, -5, 3, 9, 1, 0, 3, -10, 5};
        // when
        final int actual = solution.maxSubArray(nums);
        // then
        final int expected = 18;
        assertEquals(expected, actual);
    }

    @Test
    void additional2Test() {
        // given
        final int[] nums = {-1, -2, -3, -5, -1};
        // when
        final int actual = solution.maxSubArray(nums);
        // then
        final int expected = -1;
        assertEquals(expected, actual);
    }
}