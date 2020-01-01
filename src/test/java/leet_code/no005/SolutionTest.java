package leet_code.no005;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Objects;

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
        String expected1 = "bab";
        String expected2 = "aba";
        assertTrue(Objects.equals(actual, expected1) ||
            Objects.equals(actual, expected2) );
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

    /**
     * Input: "a"
     * Output: "a"
     */
    @Test
    void submit1Test() {
        // given
        final String input = "a";

        // when
        String actual = solution.longestPalindrome(input);

        // then
        String expected = "a";
        assertEquals(expected, actual);
    }

    /**
     * Input: "bb"
     * Output: "bb"
     */
    @Test
    void submit2Test() {
        // given
        final String input = "bb";

        // when
        String actual = solution.longestPalindrome(input);

        // then
        String expected = "bb";
        assertEquals(expected, actual);
    }

    /**
     * Input: longtext
     * Output: "ranynar"
     */
    @Test
    void submit3Test() {
        // given
        final String input = "civilwartestingwhetherthatnaptionoranynartionsoconceivedandsodedicatedcanlongendureWeareqmetonagreatbattlefiemldoftzhatwarWehavecometodedicpateaportionofthatfieldasafinalrestingplaceforthosewhoheregavetheirlivesthatthatnationmightliveItisaltogetherfangandproperthatweshoulddothisButinalargersensewecannotdedicatewecannotconsecratewecannothallowthisgroundThebravelmenlivinganddeadwhostruggledherehaveconsecrateditfaraboveourpoorponwertoaddordetractTgheworldadswfilllittlenotlenorlongrememberwhatwesayherebutitcanneverforgetwhattheydidhereItisforusthelivingrathertobededicatedheretotheulnfinishedworkwhichtheywhofoughtherehavethusfarsonoblyadvancedItisratherforustobeherededicatedtothegreattdafskremainingbeforeusthatfromthesehonoreddeadwetakeincreaseddevotiontothatcauseforwhichtheygavethelastpfullmeasureofdevotionthatweherehighlyresolvethatthesedeadshallnothavediedinvainthatthisnationunsderGodshallhaveanewbirthoffreedomandthatgovernmentofthepeoplebythepeopleforthepeopleshallnotperishfromtheearth";

        // when
        String actual = solution.longestPalindrome(input);

        // then
        String expected = "ranynar";
        assertEquals(expected, actual);
    }
}