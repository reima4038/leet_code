package leet_code.no20_ValidParentheses;

import java.util.ArrayList;
import java.util.List;

/**
 * 20. Valid Parentheses https://leetcode.com/problems/
 */
   public class Solution {
      public boolean isValid(String s) {
         List<Character> chars = new ArrayList<>();
         for(int i = 0; i < s.length(); i++) {
            if(i == 0 && Bracket.isEndBracket(s.charAt(i))) {
               return false;
            }
            
            if(Bracket.isEndBracket(s.charAt(i)) && chars.size() > 0){
               if(chars.size() == 0) {
                  return false;
               }
               final int charsLastIndex = chars.size() - 1;
               final char lastStackCharactors = chars.get(charsLastIndex);
               final char nextCompareTarget = s.charAt(i);
               if(Bracket.isValidBracketSet(lastStackCharactors, nextCompareTarget)) {
                  chars.remove(charsLastIndex);
               } else {
                  return false;
               }
            } else {
               chars.add(s.charAt(i));
            }
         }
         return chars.size() > 0 ? false : true;
      }

      private enum Bracket {
         BRACKET_1('(', ')'),
         BRACKET_2('[', ']'),
         BRACKET_3('{', '}');

         private char start;
         private char end;

         private Bracket(char start, char end) {
            this.start = start;
            this.end = end;
         }

         public static boolean isEndBracket(char end) {
            for(Bracket b : Bracket.values()) {
               if(b.end == end) {
                  return true;
               }
            }
            return false;
         } 

         public static boolean isValidBracketSet(char start, char end) {
            for(Bracket b : Bracket.values()) {
               if(b.start == start && b.end == end) {
                  return true;
               }
            }
            return false;
         }
      }
   }
