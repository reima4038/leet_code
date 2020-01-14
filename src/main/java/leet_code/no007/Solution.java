package leet_code.no007;

   /**
    * 7. Reverse Integer
    * https://leetcode.com/problems/
    */
public class Solution {
   private static final String MINUS = "-";
   private static final String EMPTY = "";
   public int reverse(int x) {
      final String reversed = new StringBuffer(String.valueOf(x))
         .reverse()
         .toString();
      if(reversed.contains(MINUS)) {
         return -1 * convert(reversed.replace(MINUS, EMPTY));
      } else {
         return convert(reversed);
      }
   }

   private int convert(String x) {
      try {
         return Integer.valueOf(x);
      } catch (NumberFormatException e) {
         return 0;
      }
   }
}
