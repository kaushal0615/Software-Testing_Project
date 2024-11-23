package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MinimumSubarrayLengthIntegrationTest {

    private MinimumSubarrayLength createSolution() {
        BitManipulationHelper helper = new BitManipulationHelper();
        return new MinimumSubarrayLength(helper);
    }

    @Test
    void testExampleCases() {
        MinimumSubarrayLength solution = createSolution();
        assertEquals(1, solution.minimumSubarrayLength(new int[]{1, 2, 3}, 2));
        assertEquals(3, solution.minimumSubarrayLength(new int[]{2, 1, 8}, 10));
        assertEquals(1, solution.minimumSubarrayLength(new int[]{1, 2}, 0));
    }

    @Test
    void testSingleElement() {
        MinimumSubarrayLength solution = createSolution();
        assertEquals(1, solution.minimumSubarrayLength(new int[]{10}, 10));
        assertEquals(-1, solution.minimumSubarrayLength(new int[]{5}, 10));
    }

    @Test
    void testAllElementsRequired() {
        MinimumSubarrayLength solution = createSolution();
        assertEquals(1, solution.minimumSubarrayLength(new int[]{1, 1, 1, 1, 31}, 31));
        assertEquals(4, solution.minimumSubarrayLength(new int[]{2, 4, 8, 16}, 30));
    }

    @Test
    void testSubarrayWithinArray() {
        MinimumSubarrayLength solution = createSolution();
        assertEquals(2, solution.minimumSubarrayLength(new int[]{1, 3, 2, 5}, 7));
        assertEquals(1, solution.minimumSubarrayLength(new int[]{1, 2, 4, 8, 16}, 14));
    }

    @Test
    void testNoValidSubarray() {
        MinimumSubarrayLength solution = createSolution();
        assertEquals(-1, solution.minimumSubarrayLength(new int[]{1, 2, 4}, 16));
        assertEquals(-1, solution.minimumSubarrayLength(new int[]{0, 0, 0}, 1));
    }

    @Test
    void testZeroK() {
        MinimumSubarrayLength solution = createSolution();
        assertEquals(1, solution.minimumSubarrayLength(new int[]{1, 2, 3}, 0));
        assertEquals(1, solution.minimumSubarrayLength(new int[]{0, 0, 1}, 0));
    }

    @Test
    void testLargeInputs() {
        MinimumSubarrayLength solution = createSolution();
        int[] nums = new int[200000];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = 1;
        }
        assertEquals(-1, solution.minimumSubarrayLength(nums, 131072)); // 2^17 = 131072
    }

    @Test
    void testEdgeCases() {
        MinimumSubarrayLength solution = createSolution();
        assertEquals(1, solution.minimumSubarrayLength(new int[]{1}, 0));
        assertEquals(-1, solution.minimumSubarrayLength(new int[]{0}, 1));
        assertEquals(1, solution.minimumSubarrayLength(new int[]{Integer.MAX_VALUE}, Integer.MAX_VALUE));
    }

    @Test
    void testHighValueK() {
        MinimumSubarrayLength solution = createSolution();
        assertEquals(-1, solution.minimumSubarrayLength(new int[]{1, 2, 3}, 1000));
        assertEquals(3, solution.minimumSubarrayLength(new int[]{2, 4, 8}, 14));
    }
}
