package leet_code.no49_Group_Anagrams;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

/**
 * 49. Group Anagrams https://leetcode.com/problems/
 */
public class SolutionTest {

    private static Solution solution = new Solution();

    @Test
    void example1Test() {
        // given
        final String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        // when
        final List<List<String>> actual = solution.groupAnagrams(strs);
        // then
        final List<List<String>> expected = Arrays.asList(
            Arrays.asList("eat","tea","ate"),
            Arrays.asList("bat"),
            Arrays.asList("tan","nat")
        );
        assertEquals(expected, actual);
    }
}