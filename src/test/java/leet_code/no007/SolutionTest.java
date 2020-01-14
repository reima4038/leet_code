package leet_code.no007;

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
        final int x = 123;
        // when
        final int actual = solution.reverse(x);
        // then
        final int expected = 321;
        assertEquals(expected, actual);
    }

    @Test
    void example2Test() {
        // given
        final int x = -123;
        // when
        final int actual = solution.reverse(x);
        // then
        final int expected = -321;
        assertEquals(expected, actual);
    }

    @Test
    void example3Test() {
        // given
        final int x = 120;
        // when
        final int actual = solution.reverse(x);
        // then
        final int expected = 21;
        assertEquals(expected, actual);
    }
}