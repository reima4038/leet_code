package leet_code.no006;

import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
    * 6. ZigZag Conversion
    * https://leetcode.com/problems/
    */
   public class Solution {
      private static final String EMPTY_VALUE = "";
      public String convert(String s, int numRows) {
         if(numRows <= 0) {
            return EMPTY_VALUE;
         }

         StringBuilder[] strs = new StringBuilder[numRows];
         for(int i = 0; i < numRows; i++) {
            strs[i] = new StringBuilder();
         }

         boolean isForward = true;
         final int firstIndex = 0;
         final int lastDigitIndex = numRows - 1;
         for(int i = 0, j = 0; i < s.length(); i++) {
            strs[j].append(s.charAt(i));

            if(j == firstIndex) {
               isForward = true;
            } else if(j == lastDigitIndex) {
               isForward = false;
            }

            if(isForward){
               j++;
            } else {
               j--;
            }
         }

         return Stream.of(strs)
            .map(StringBuilder::toString)
            .collect(Collectors.joining());
      }


   }
