package algolism;

public class BinarySearch {

    /**
     * 二分探索アルゴリズム
     * https://ja.wikipedia.org/wiki/%E4%BA%8C%E5%88%86%E6%8E%A2%E7%B4%A2#%E4%BE%8B
     * @param nums 探索対象の配列（昇順にソートされている前提）
     * @param target 探索値
     * @return targetの値のインデックス
     */
    public static int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while(start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                return mid;
            }

            if (target < nums[mid] && target >= nums[start]) {
                end = mid + 1;
            } else {
                // the case is "target > nums[mid] && target <= nums[end]" or target is not include the array.
                start = mid +1;
            }
        }
        return -1;
    }
}