package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CountFairPairsTest {

    CountFairPairs solution = new CountFairPairs();

    @Test
    void testExample1() {
        int[] nums = {0, 1, 7, 4, 4, 5};
        int lower = 3, upper = 6;
        assertEquals(6, solution.countFairPairs(nums, lower, upper));
    }

    @Test
    void testExample2() {
        int[] nums = {1, 7, 9, 2, 5};
        int lower = 11, upper = 11;
        assertEquals(1, solution.countFairPairs(nums, lower, upper));
    }

    @Test
    void testAllZeroes() {
        int[] nums = {0, 0, 0, 0, 0, 0, 0};
        int lower = 0, upper = 0;
        assertEquals(21, solution.countFairPairs(nums, lower, upper)); // All pairs are fair
    }

    @Test
    void testNegativeNumbers() {
        int[] nums = {-5, -7, -7, -5, -5};
        int lower = -12, upper = -12;
        assertEquals(6, solution.countFairPairs(nums, lower, upper));
    }

    @Test
    void testSingleElement() {
        int[] nums = {-8};
        int lower = -8, upper = -7;
        assertEquals(0, solution.countFairPairs(nums, lower, upper)); // No pairs possible
    }

    @Test
    void testMixedNumbers() {
        int[] nums = {7, 5, 6, 9, 4, 2, 10, 3};
        int lower = 10, upper = 13;
        assertEquals(11, solution.countFairPairs(nums, lower, upper));
    }

    @Test
    void testSmallArray() {
        int[] nums = {-1, 0};
        int lower = 1, upper = 1;
        assertEquals(0, solution.countFairPairs(nums, lower, upper)); // No pairs satisfy condition
    }

    @Test
    void testLargeArrayAllFairPairs() {
        int[] nums = {1, 2, 3, 4, 5};
        int lower = 3, upper = 8;
        assertEquals(9, solution.countFairPairs(nums, lower, upper)); // All pairs are fair
    }

    @Test
    void testEdgeCaseZeroRange() {
        int[] nums = {1, 7, 5, 9, 2, 11};
        int lower = 12, upper = 12;
        assertEquals(2, solution.countFairPairs(nums, lower, upper)); // Only pairs (2,4) and (0,5)
    }

    @Test
    void testPerformanceCase() {
        int[] nums = new int[100000];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = i;
        }
        int lower = 50000, upper = 100000;
        assertTrue(solution.countFairPairs(nums, lower, upper) > 0); // Large case, valid pairs exist
    }
}
