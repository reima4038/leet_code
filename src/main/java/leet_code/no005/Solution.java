package leet_code.no005;

/**
 * 5. Longest Palindromic Substring
 * https://leetcode.com/problems/longest-palindromic-substring/
 */
public class Solution {

    private static final String EMPTY = "";

    public String longestPalindrome(String s) {
        if(s == null || s.length() < 1) return EMPTY;
        int start = 0;
        int end = 0;
        for(int i = 0; i < s.length(); i++) {
            int len1 = expandAroundCenter(s, i, i);
            int len2 = expandAroundCenter(s, i, i + 1);
            int len = Math.max(len1, len2);
            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        return s.substring(start, end + 1);
    }

    private int expandAroundCenter(String s, int left, int right) {
        int tempL = left;
        int tempR = right;
        while (tempL >= 0 && tempR < s.length() && s.charAt(tempL) == s.charAt(tempR)) {
            tempL--;
            tempR++;
        }
        return tempR - tempL - 1;
    }

}