package leet_code.no006;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
    * https://leetcode.com/problems/
    */
   public class SolutionTest {

      private static Solution solution = new Solution();

      @Test
      void example1Test() {
         // given
         final String s = "PAYPALISHIRING";
         final int numRows = 3;

         // when
         String actual = solution.convert(s, numRows);

         // then
         final String expected = "PAHNAPLSIIGYIR";
         assertEquals(expected, actual);
      }

      @Test
      void example2Test() {
         // given
         final String s = "PAYPALISHIRING";
         final int numRows = 4;

         // when
         String actual = solution.convert(s, numRows);

         // then
         final String expected = "PINALSIGYAHRPI";
         assertEquals(expected, actual);
      }

      @Test
      void example3Test() {
         // given
         final String s = "AB";
         final int numRows = 1;

                  // when
                  String actual = solution.convert(s, numRows);

                  // then
                  final String expected = "AB";
                  assertEquals(expected, actual);

      }
   }
