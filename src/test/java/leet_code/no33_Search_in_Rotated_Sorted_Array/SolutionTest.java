package leet_code.no33_Search_in_Rotated_Sorted_Array;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 * https://leetcode.com/problems/
 */
public class SolutionTest {

    private static Solution solution = new Solution();

    @Test
    void example1Test() {
        // given
        final int[] nums = {4,5,6,7,0,1,2};
        final int target = 0;
        // when
        final int actual = solution.search(nums, target);
        // then
        final int expected = 4;
        assertEquals(expected, actual);
    }

    @Test
    void example2Test() {
        // given
        final int[] nums = {4,5,6,7,0,1,2};
        final int target = 3;
        // when
        final int actual = solution.search(nums, target);
        // then
        final int expected = -1;
        assertEquals(expected, actual);
    }
}