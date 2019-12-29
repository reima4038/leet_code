package leet_code.no004;

import java.util.function.Predicate;
import java.util.stream.IntStream;

/**
 * No.4 Median of Two Sorted Arrays
 * https://leetcode.com/problems/median-of-two-sorted-arrays/
 */
public class Solution {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        double median = 0;
        int[] compositionArray = arrayComposition(nums1, nums2);
        if(arrayLengthIsOdd.test(compositionArray)){
            // 真ん中のインデックスの値が中央値
            final int medianIndex = (int) Math.floor(compositionArray.length / 2);
            median = compositionArray[medianIndex];
        } else {
            // 真ん中２つのインデックスが持つ値の平均が中央値
            final int medianIndex = (int) Math.floor(compositionArray.length / 2) - 1;
            final int medianIndex2 = medianIndex + 1;
            median = (compositionArray[medianIndex] + compositionArray[medianIndex2]) / 2.0;
        };

        return median;
    }

    private int[] arrayComposition(int[] nums1, int[] nums2) {
        return IntStream.concat(IntStream.of(nums1), IntStream.of(nums2))
            .sorted()
            .toArray();
    }
    private Predicate<int[]> arrayLengthIsOdd = nums -> nums.length % 2 == 0 ? false : true;
}