package leet_code.no22_GenerateParentheses;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 22. Generate Parentheses https://leetcode.com/problems/
 */
public class Solution {

   private Map<Integer, List<String>> memos = new HashMap<>(); 

   public List<String> generateParenthesis(int n) {
      if(memos.containsKey(n)) {
         return memos.get(n);
      }

      List<String> answer = new ArrayList<>();
      if(n == 0) {
         answer.add("");
      } else {
         for(int c = 0; c < n; c++) {
            for(String left : generateParenthesis(c)) {
               for(String right : generateParenthesis(n - 1 - c)) {
                  answer.add("(" + left + ")" + right);
                  memos.put(n, answer);
               }
            }
         }
      }
      return answer;
   }
}
