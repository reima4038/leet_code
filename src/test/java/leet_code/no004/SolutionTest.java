package leet_code.no004;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SolutionTest {

    private Solution solution = new Solution();

    @Test
    void example1Test() {
        // given
        int[] nums1 = {1, 3};
        int[] nums2 = {2};

        // when
        double actual = solution.findMedianSortedArrays(nums1, nums2);

        // then
        double expected = 2.0;
        assertEquals(expected, actual);
    }

    @Test
    void example2Test() {
        // given
        int[] nums1 = {1, 2};
        int[] nums2 = {3, 4};

        // when
        double actual = solution.findMedianSortedArrays(nums1, nums2);

        // then
        double expected = 2.5;
        assertEquals(expected, actual);
    }
}