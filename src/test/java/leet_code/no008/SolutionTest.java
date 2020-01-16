package leet_code.no008;

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
        final String str = "42";
        
        // when
        final int actual = solution.myAtoi(str);
        // then
        final int expected = 42;
        assertEquals(expected, actual);
    }

    @Test
    void example2Test() {
        // given
        final String str = "   -42";
        
        // when
        final int actual = solution.myAtoi(str);
        // then
        final int expected = -42;
        assertEquals(expected, actual);
    }

    @Test
    void example3Test() {
        // given
        final String str = "4193 with words";
        
        // when
        final int actual = solution.myAtoi(str);
        // then
        final int expected = 4193;
        assertEquals(expected, actual);
    }

    @Test
    void example4Test() {
        // given
        final String str = "words and 987";
        
        // when
        final int actual = solution.myAtoi(str);
        // then
        final int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    void example5Test() {
        // given
        final String str = "-91283472332";
        
        // when
        final int actual = solution.myAtoi(str);
        // then
        final int expected = -2147483648;
        assertEquals(expected, actual);
    }

    @Test
    void submit1Test() {
        // given
        final String str = "3.14159";
        
        // when
        final int actual = solution.myAtoi(str);
        // then
        final int expected = 3;
        assertEquals(expected, actual);
    }

    @Test
    void submit2Test() {
        // given
        final String str = "+";
                
        // when
        final int actual = solution.myAtoi(str);
        // then
        final int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    void submit3Test() {
        // given
        final String str = "+-2";
        
        // when
        final int actual = solution.myAtoi(str);
        // then
        final int expected = 0;
        assertEquals(expected, actual);
    }
    
}