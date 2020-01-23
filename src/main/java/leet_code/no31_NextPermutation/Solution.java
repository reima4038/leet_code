package leet_code.no31_NextPermutation;

import java.util.function.Consumer;

/**
 * 31. Next Permutation
 * https://leetcode.com/problems/
 * https://www.madopro.net/entry/2016/07/12/205714
 */
public class Solution {
   public void nextPermutation(int[] nums) {
      // step1: nums[k] < nums[k+1] となる最大のkを求める。存在しない場合は配列を反転する。
      final int initialValue = -1;
      int k = initialValue;
      for(int i = nums.length - 2; i >= 0 ; i--) {
         if(nums[i] < nums[i+1]) {
            k = i;
            break;
         }
      }

      if(k == initialValue) {
         reverseIntArray.accept(nums);
         return;
      }

      // step2: nums[l] > nums[k], l >= k+1 となる最小のlをもとめる。nums[k]とnums[l]を入れ替える。
      int l = k + 1;
      // step1の結果、step2に進んだ時点で後半の方が小さい値になっている。
      // 最小のlを探すために逆順から走査して最初に見つけた値をlとする。
      for(int i = nums.length - 1; i > k + 1; i--) {
         if(nums[i] > nums[k]) {
            l = i;
            break;
         }
      }

      int temp = nums[l];
      nums[l] = nums[k];
      nums[k] = temp;

      // step3: nums[k+1]...nums[n-1] を反転する。 (n = nums.length)
      final int[] copyArray = nums.clone();
      for(int i = k+1; i < nums.length; i++) {
         nums[i] = copyArray[(k+1)+(nums.length-1)-i];
      }
   }

   private Consumer<int[]> reverseIntArray = arrays -> {
      final int[] copyArray = arrays.clone();
      for(int i = 0; i < arrays.length; i++) {
         arrays[i] = copyArray[arrays.length - 1 - i];
      }
   };

}
