package leet_code.no22_GenerateParentheses;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import org.junit.jupiter.api.Test;

/**
 * https://leetcode.com/problems/
 */
public class SolutionTest {

    private static Solution solution = new Solution();

    @Test
    void example1Test() {
        // given
        final int n = 3;
        // when
        final List<String> actual = solution.generateParenthesis(n);
        // then
        final List<String> expected = Arrays.asList(
            "((()))",
            "(()())",
            "(())()",
            "()(())",
            "()()()"
            );
        actual.sort(Comparator.naturalOrder());
        expected.sort(Comparator.naturalOrder());
        assertEquals(expected, actual);
    }

    @Test
    void additional1Test() {
        // given
        final int n = 2;
        // when
        final List<String> actual = solution.generateParenthesis(n);
        // then
        final List<String> expected = Arrays.asList(
            "(())",
            "()()"
            );
        actual.sort(Comparator.naturalOrder());
        expected.sort(Comparator.naturalOrder());
        assertEquals(expected, actual);
    }

    @Test
    void additional2Test() {
        // given
        final int n = 1;
        // when
        final List<String> actual = solution.generateParenthesis(n);
        // then
        final List<String> expected = Arrays.asList(
            "()"
            );
        actual.sort(Comparator.naturalOrder());
        expected.sort(Comparator.naturalOrder());
        assertEquals(expected, actual);
    }

    @Test
    void additional3Test() {
        // given
        final int n = 4;
        // when
        final List<String> actual = solution.generateParenthesis(n);
        // then
        final List<String> expected = Arrays.asList(
            "(((())))",
            "((()()))",
            "((())())",
            "((()))()",
            "(()(()))",
            "(()()())",
            "(()())()",
            "(())(())",
            "(())()()",
            "()((()))",
            "()(()())",
            "()(())()",
            "()()(())",
            "()()()()"
            );
            
        actual.sort(Comparator.naturalOrder());
        expected.sort(Comparator.naturalOrder());
        assertEquals(expected, actual);
    }
}