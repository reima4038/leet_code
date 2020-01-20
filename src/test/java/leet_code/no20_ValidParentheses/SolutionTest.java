package leet_code.no20_ValidParentheses;

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
        final String s = "()"; 
        // when
        final boolean actual = solution.isValid(s);
        // then
        final boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    void example2Test() {
        // given
        final String s = "()[]{}"; 
        // when
        final boolean actual = solution.isValid(s);
        // then
        final boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    void example3Test() {
        // given
        final String s = "(]"; 
        // when
        final boolean actual = solution.isValid(s);
        // then
        final boolean expected = false;
        assertEquals(expected, actual);
    }

    @Test
    void example4Test() {
        // given
        final String s = "([)]"; 
        // when
        final boolean actual = solution.isValid(s);
        // then
        final boolean expected = false;
        assertEquals(expected, actual);
    }

    @Test
    void example5Test() {
        // given"
        final String s = "{[]}"; 
        // when
        final boolean actual = solution.isValid(s);
        // then
        final boolean expected = true;
        assertEquals(expected, actual);
    }
}