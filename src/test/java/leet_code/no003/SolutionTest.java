/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package leet_code.no003;

import org.junit.jupiter.params.*;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;

class SolutionTest {

    @DisplayName("例題")
    @ParameterizedTest
    @CsvSource({
        "abcabcab, 3",
        "bbbbb, 1",
        "pwwkew, 3", 
    })
    void exampleTest(String inputValue, int expect) {
        assertEquals(new Solution().lengthOfLongestSubstring(inputValue), expect);
    }
}