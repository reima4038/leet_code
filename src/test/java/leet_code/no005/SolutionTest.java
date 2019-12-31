package leet_code.no005;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SolutionTest {

    private Solution solution = new Solution();

    /**
     * Input: "babad"
     * Output: "bab"
     * Note: "aba" is also a valid answer.
     */
    @Test
    void example1Test() {
        // given
        final String input = "babad";

        // when
        String actual = solution.longestPalindrome(input);

        // then
        String expected = "bab";
        assertEquals(expected, actual);
    }

    /**
     * Input: "cbbd"
     * Output: "bb"
     */
    @Test
    void example2Test() {
        // given
        final String input = "cbbd";

        // when
        String actual = solution.longestPalindrome(input);

        // then
        String expected = "bb";
        assertEquals(expected, actual);
    }
}