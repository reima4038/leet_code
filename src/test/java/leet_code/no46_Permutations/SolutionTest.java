package leet_code.no46_Permutations;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

/**
 * 46. Permutations
 * https://leetcode.com/problems/
 */
public class SolutionTest {

    private static Solution solution = new Solution();

    @Test
    void example1Test() {
        // given
        final int[] nums = {1,2,3};
        // when
        final List<List<Integer>> actual = solution.permute(nums);
        // then
        final List<List<Integer>> expected = Arrays.asList(
            Arrays.asList(1, 2, 3),
            Arrays.asList(1, 3, 2),
            Arrays.asList(2, 1, 3),
            Arrays.asList(2, 3, 1),
            Arrays.asList(3, 1, 2),
            Arrays.asList(3, 2, 1)
        );
        assertEquals(expected, actual);
    }
}