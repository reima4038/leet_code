package leet_code.no20_ValidParentheses;

/**
 * 20. Valid Parentheses https://leetcode.com/problems/
 */
   public class SampleSolution {
      public boolean isValid(String s) {
         Stack<Character> stack = new Stack<Character>();
         for(Caharcter c : s.toCharArray()) {
            if(c == '(') {
               stack.push(')');
            } else if (c == '{') {
               stack.push('}');
            } else if (c == '[') {
               stack.push(']');
            } else if (stack.isEmpty() || stack.pop() != c) {
               return false;
            }
         }
         return stack.isEmpty();
      }
   }
