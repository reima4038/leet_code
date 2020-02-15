package leet_code.no35_Search_Insert_Position;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 * 35. Search Insert Position
 * https://leetcode.com/problems/
 */
public class SolutionTest {

    private static Solution solution = new Solution();

    @Test
    void example1Test() {
        // given
        final int[] nums = {1,3,5,6};
        final int target = 5;
        // when
        final int actual = solution.searchInsert(nums, target);
        // then
        final int expected = 2;
        assertEquals(expected, actual);
    }

    @Test
    void example2Test() {
        // given
        final int[] nums = {1,3,5,6};
        final int target = 2;
        // when
        final int actual = solution.searchInsert(nums, target);
        // then
        final int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    void example3Test() {
        // given
        final int[] nums = {1,3,5,6};
        final int target = 7;
        // when
        final int actual = solution.searchInsert(nums, target);
        // then
        final int expected = 4;
        assertEquals(expected, actual);
    }

    @Test
    void example4Test() {
        // given
        final int[] nums = {1,3,5,6};
        final int target = 0;
        // when
        final int actual = solution.searchInsert(nums, target);
        // then
        final int expected = 0;
        assertEquals(expected, actual);
    }

    
    @Test
    void submit1Test() {
        // given
        final int[] nums = {1};
        final int target = 1;
        // when
        final int actual = solution.searchInsert(nums, target);
        // then
        final int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    void submit2Test() {
        // given
        final int[] nums = {1, 3};
        final int target = 3;
        // when
        final int actual = solution.searchInsert(nums, target);
        // then
        final int expected = 1;
        assertEquals(expected, actual);
    }
}