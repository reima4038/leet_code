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
         .filter(isFirstCharactorNumericalValueOrSign)
         .filter(isNotOnlySign)
         .map(removeNotNumericalDigits)
         .map(limitIntMinMaxValue)
         .map(Integer::valueOf)
         .orElse(ZERO);
   }

   private Function<String, String> removeWhiteSpace = String::trim;
   private Predicate<String> isFirstCharactorNumericalValueOrSign = s -> {
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

   private Predicate<Character> isSign = ch -> {
      final char SIGN_MINUS = '-';
      final char SIGN_PLUS = '+';
      return ch == SIGN_MINUS || ch == SIGN_PLUS;
   };

   private Predicate<String> isNotOnlySign = s -> {
      if(s.isEmpty()) {
         return false;
      }
      return s.length() > 1  ? true : isSign.negate().test(s.charAt(0));
   };

   private Function<String, String> removeNotNumericalDigits = s -> {
      if(s.isEmpty()) {
         return s;
      }

      final Predicate<Character> isNotNumericalValue = ch -> !Character.isDigit(ch);
      final int initialValue = -1;
      int firstNotNumericalIndex = initialValue;
      for(int i = 0; i < s.length(); i++) {
         if(i == 0 && isSign.test(s.charAt(i))) {
            continue;
         }
         if(isNotNumericalValue.test(s.charAt(i))) {
            firstNotNumericalIndex = i;
            break;
         }
      }

      if(firstNotNumericalIndex == initialValue) {
         return s;
      } else {
         final int firstDigitIndex = 0;
         return s.substring(firstDigitIndex, firstNotNumericalIndex);
      }
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
