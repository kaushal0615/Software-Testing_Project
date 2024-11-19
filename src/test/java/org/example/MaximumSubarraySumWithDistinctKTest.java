package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MaximumSubarraySumWithDistinctKTest {

    MaximumSubarraySumWithDistinctK solution = new MaximumSubarraySumWithDistinctK();

    @Test
    void testExample1() {
        int[] nums = {1, 5, 4, 2, 9, 9, 9};
        int k = 3;
        assertEquals(15, solution.maximumSubarraySum(nums, k));
    }

    @Test
    void testExample2() {
        int[] nums = {4, 4, 4};
        int k = 3;
        assertEquals(0, solution.maximumSubarraySum(nums, k));
    }

    @Test
    void testSingleElement() {
        int[] nums = {5};
        int k = 1;
        assertEquals(5, solution.maximumSubarraySum(nums, k));
    }

    @Test
    void testAllElementsDistinct() {
        int[] nums = {1, 2, 3, 4, 5};
        int k = 3;
        assertEquals(12, solution.maximumSubarraySum(nums, k)); // Subarray [3, 4, 5]
    }

    @Test
    void testNoValidSubarray() {
        int[] nums = {1, 1, 1, 1};
        int k = 2;
        assertEquals(0, solution.maximumSubarraySum(nums, k));
    }

    @Test
    void testMaximumK() {
        int[] nums = {1, 2, 3, 4, 5};
        int k = 5;
        assertEquals(15, solution.maximumSubarraySum(nums, k)); // Entire array
    }

    @Test
    void testLargeInput() {
        int[] nums = new int[100000];
        for (int i = 0; i < nums.length; i++) nums[i] = i + 1; // [1, 2, ..., 100000]
        int k = 100000;
        assertEquals((long) k * (k + 1) / 2, solution.maximumSubarraySum(nums, k)); // Sum of 1 to 100000
    }

    @Test
    void testNegativeValues() {
        int[] nums = {-1, -2, -3, -4};
        int k = 2;
        assertEquals(0, solution.maximumSubarraySum(nums, k)); // Subarray [-1, -2]
    }
    @Test
    void testEdgeCaseForUpdatingAns() {
        int[] nums = {1, 2, 3, 1, 2, 3};
        int k = 3;// The sum of [1, 2, 3] and [2, 3, 1] is the same, but [3, 1, 2] has a higher sum.
        assertEquals(6, solution.maximumSubarraySum(nums, k));
    }
    @Test
    void testMpSizeBoundary() {
        int[] nums = {1, 2, 3, 4, 5};
        int k = 3;

        // Case: mp.size() < k
        assertEquals(0, solution.maximumSubarraySum(new int[]{1, 1, 1, 1, 1}, k));

        // Case: mp.size() == k
        assertEquals(12, solution.maximumSubarraySum(nums, k)); // Subarray [3, 4, 5]

        // Case: mp.size() > k (mutation wouldn't affect this, but testing helps prevent future bugs)
        assertEquals(9, solution.maximumSubarraySum(new int[]{1, 2, 2, 3, 4}, k));
    }
    @Test
    void testAnsEqualsSumBoundary() {
        int[] nums = {1, 2, 3, 4, 5};
        int k = 3;// Create multiple subarrays with the same sum to check if ans updates only for strictly greater sums
        assertEquals(12, solution.maximumSubarraySum(nums, k)); // Subarray [3, 4, 5]
    }
}
