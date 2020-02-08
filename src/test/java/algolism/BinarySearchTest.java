package algolism;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 * https://leetcode.com/problems/
 */
public class BinarySearchTest {

    @Test
    void example1Test() {
        // given
        final int[] nums = {0,1,2,3,4,5,6,7};
        final int target = 6;
        // when
        final int actual = BinarySearch.search(nums, target);
        // then
        final int expected = 6;
        assertEquals(expected, actual);
    }

    @Test
    void example2Test() {
        // given
        final int[] nums = {0,1,2,3};
        final int target = 4;
        // when
        final int actual = BinarySearch.search(nums, target);
        // then
        final int expected = -1;
        assertEquals(expected, actual);
    }
}