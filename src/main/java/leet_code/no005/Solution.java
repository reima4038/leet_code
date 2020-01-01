package leet_code.no005;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * 5. Longest Palindromic Substring
 * https://leetcode.com/problems/longest-palindromic-substring/
 */
public class Solution {
    private static final String EMPTY_VALUE = "";
    private static final int MAX_LENGTH = 1000;

    public String longestPalindrome(String s) {
        return Optional.ofNullable(s)
            .map(action)
            .orElse(EMPTY_VALUE);
    }

    /**
     * 前から読んでも後ろから読んでも同じ場合Trueを返す
     */
    private Predicate<String> isPalindrome = s -> {
        StringBuilder reversalString = new StringBuilder();
        for(int i = s.length() - 1; i >= 0; i--) {
            reversalString.append(s.charAt(i));
        }
        return Objects.equals(s, reversalString.toString());
    };

    private Function<List<Character>, String> listToString = h -> {
        StringBuilder sb = new StringBuilder();
        for(Character c : h) {
            sb.append(c);
        }
        return sb.toString();
    };

    private Function<String, String> action = s -> {
        List<Character> list = new ArrayList<>();
        String answer = "";
        int i = 0;
        int j = 0;
        while(i < s.length()) {
            if(i == MAX_LENGTH) {
                break;
            } else if(j < s.length() || j == MAX_LENGTH) {
                list.add(s.charAt(j++));
                String string = listToString.apply(list);
                answer = isPalindrome.test(string) ? preferLongLengthValue(answer, string) : answer;
            } else {
                list.clear();
                i++;
                j = i;
            }
        }
        return answer;
    };

    /**
     * 与えられた２つの値のうち大きい文字列を返す
     * @param a 文字列A
     * @param b 文字列B
     * @return より長い文字列を返す(同じ長さの場合はaを返す)
     */
    private String preferLongLengthValue(String a, String b) {
        if(Objects.isNull(a) || Objects.isNull(b)) {
            throw new IllegalArgumentException("input value must not null!");
        }
        return a.length() > b.length() ? a : b; 
    } 
    

}