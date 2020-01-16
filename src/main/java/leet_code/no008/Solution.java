package leet_code.no008;

import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.regex.Pattern;

/**
 * 8. String to Integer (atoi) https://leetcode.com/problems/
 */
public class Solution {

   private static final int ZERO = 0;

   public int myAtoi(String str) {
      return Optional.ofNullable(str)
         .map(removeWhiteSpace)
         .filter(isFirstCharactorNumericalValue)
         .map(removeNotNumericalDigits)
         .map(limitIntMinMaxValue)
         .map(Integer::valueOf)
         .orElse(ZERO);
   }

   private Function<String, String> removeWhiteSpace = String::trim;
   private Predicate<String> isFirstCharactorNumericalValue = s -> {
      final String numericalValueOrSign = "^[-+0-9]";
      return Pattern.compile(numericalValueOrSign)
         .matcher(s)
         .find();
   };
   private Predicate<String> isMinusValue = s -> {
      if(s.isEmpty()) {
         return false;
      }
      final int firstDigitIndex = 0;
      final char MINUS = '-';
      return s.charAt(firstDigitIndex) == MINUS ? true : false;
   };
   private Function<String, String> removeNotNumericalDigits = s -> {
      final String EMPTY = "";
      final String MINUS = "-";
      final String notNumericalValue = "[^0-9]";
      final String removedValue = s.replaceAll(notNumericalValue, EMPTY);
      return isMinusValue.test(s) ? MINUS + removedValue : removedValue;
   };
   private Predicate<String> isInIntegerRange = s -> {
      try {
         Integer.parseInt(s);
         return true;
      } catch (NumberFormatException e) {
         return false;
      }
   };
   private Function<String, String> limitIntMinMaxValue = s -> {
      if(isInIntegerRange.test(s)) {
         return s;
      } else {
         final int value = isMinusValue.test(s) ? Integer.MIN_VALUE : Integer.MAX_VALUE;
         return String.valueOf(value);
      } 
   }; 

}
