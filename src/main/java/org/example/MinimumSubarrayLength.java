package org.example;

public class MinimumSubarrayLength {

    private final BitManipulationHelper bitHelper;

    public MinimumSubarrayLength(BitManipulationHelper bitHelper) {
        this.bitHelper = bitHelper;
    }

    public int minimumSubarrayLength(int[] nums, int k) {
        if (k == 0) {
            return 1;
        }

        int minLen = Integer.MAX_VALUE;
        int n = nums.length;

        int[] bit32 = new int[32];
        bitHelper.updateBitArray(bit32, nums[0], '+');
        int num = nums[0];
        int i = 0, j = 0;

        // Sliding window approach
        while (i <= j && i < n && j < n) {
            if (num >= k) {
                minLen = Math.min(minLen, j - i + 1);
                bitHelper.updateBitArray(bit32, nums[i], '-'); // Remove i-th value
                num = bitHelper.bitArrayToDecimal(bit32);
                i++;
            } else {
                j++;
                if (j < n) {
                    num |= nums[j];
                    bitHelper.updateBitArray(bit32, nums[j], '+'); // Add j-th value
                }
            }
        }

        return minLen == Integer.MAX_VALUE ? -1 : minLen;
    }
}
