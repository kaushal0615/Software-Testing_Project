package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class MinimumSubarrayLengthTest {
    MinimumSubarrayLength minimumSubarrayLengthObj = new MinimumSubarrayLength();

    @Test
    void testExampleCases() {
        // Example 1
        assertEquals(1, minimumSubarrayLengthObj.minimumSubarrayLength(new int[]{1, 2, 3}, 2));
        // Example 2
        assertEquals(3, minimumSubarrayLengthObj.minimumSubarrayLength(new int[]{2, 1, 8}, 10));
        // Example 3
        assertEquals(1, minimumSubarrayLengthObj.minimumSubarrayLength(new int[]{1, 2}, 0));
    }

    @Test
    void testSingleElement() {
        // Single element array
        assertEquals(1, minimumSubarrayLengthObj.minimumSubarrayLength(new int[]{10}, 10));
        assertEquals(-1, minimumSubarrayLengthObj.minimumSubarrayLength(new int[]{5}, 10));
    }

    @Test
    void testAllElementsRequired() {
        // All elements needed to reach OR >= k
        assertEquals(1, minimumSubarrayLengthObj.minimumSubarrayLength(new int[]{1, 1, 1, 1, 31}, 31));
        assertEquals(4, minimumSubarrayLengthObj.minimumSubarrayLength(new int[]{2, 4, 8, 16}, 30));
    }

    @Test
    void testSubarrayWithinArray() {
        // Subarray lies within the array
        assertEquals(2, minimumSubarrayLengthObj.minimumSubarrayLength(new int[]{1, 3, 2, 5}, 7));
        assertEquals(1, minimumSubarrayLengthObj.minimumSubarrayLength(new int[]{1, 2, 4, 8, 16}, 14));
    }

    @Test
    void testNoValidSubarray() {
        // No subarray satisfies the condition
        assertEquals(-1, minimumSubarrayLengthObj.minimumSubarrayLength(new int[]{1, 2, 4}, 16));
        assertEquals(-1, minimumSubarrayLengthObj.minimumSubarrayLength(new int[]{0, 0, 0}, 1));
    }

    @Test
    void testZeroK() {
        // k = 0, any non-empty subarray is valid
        assertEquals(1, minimumSubarrayLengthObj.minimumSubarrayLength(new int[]{1, 2, 3}, 0));
        assertEquals(1, minimumSubarrayLengthObj.minimumSubarrayLength(new int[]{0, 0, 1}, 0));
    }

    @Test
    void testLargeInputs() {
        // Large input to test performance
        int[] nums = new int[200000];
        for (int i = 0; i < 200000; i++) {
            nums[i] = 1;
        }
        assertEquals(-1, minimumSubarrayLengthObj.minimumSubarrayLength(nums, 131072)); // 2^17 = 131072
    }

    @Test
    void testEdgeCases() {
        // Edge cases
        assertEquals(1, minimumSubarrayLengthObj.minimumSubarrayLength(new int[]{1}, 0));
        assertEquals(-1, minimumSubarrayLengthObj.minimumSubarrayLength(new int[]{0}, 1));
        assertEquals(1, minimumSubarrayLengthObj.minimumSubarrayLength(new int[]{Integer.MAX_VALUE}, Integer.MAX_VALUE));
    }

    @Test
    void testHighValueK() {
        // High value of k with small array
        assertEquals(-1, minimumSubarrayLengthObj.minimumSubarrayLength(new int[]{1, 2, 3}, 1000));
        assertEquals(3, minimumSubarrayLengthObj.minimumSubarrayLength(new int[]{2, 4, 8}, 14));
    }
}
