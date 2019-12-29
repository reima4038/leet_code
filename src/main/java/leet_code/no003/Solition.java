package leet_code.no003;

import java.util.HashSet;
import java.util.Objects;

/**
 * https://leetcode.com/problems/longest-substring-without-repeating-characters/submissions/
 */
class Solution {
    /**
     * 文字列から繰り返しのないsubstringの長さを取得する
     * @param s
     * @return length of longest substring
     */
    public int lengthOfLongestSubstring(String s) {
        if (Objects.isNull(s)){
            return 0;
        }
        if (s.length() == 0) {
            return 0;
        }
        if (s.length() == 1){
            return 1;
        }

        HashSet<Character> set = new HashSet<>();
        int answer = 0;
        int i = 0;
        int j = 0;
        while(i < s.length() && j < s.length()) {
            if(!set.contains(s.charAt(j))) {
                set.add(s.charAt(j++));
                answer = Math.max(answer, j-i);
            } else {
                set.remove(s.charAt(i++));
            }
        }
        return answer;
    }

}