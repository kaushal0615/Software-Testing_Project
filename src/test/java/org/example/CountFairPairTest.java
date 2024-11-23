package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountFairPairsIntegrationTest {

    // Helper method to create CountFairPairs with RangeHelper
    private CountFairPairs createCountFairPairs() {
        RangeHelper helper = new RangeHelper();
        return new CountFairPairs(helper);
    }

    @Test
    void testExample1() {
        CountFairPairs solution = createCountFairPairs();
        int[] nums = {0, 1, 7, 4, 4, 5};
        int lower = 3, upper = 6;
        assertEquals(6, solution.countFairPairs(nums, lower, upper));
    }

    @Test
    void testExample2() {
        CountFairPairs solution = createCountFairPairs();
        int[] nums = {1, 7, 9, 2, 5};
        int lower = 11, upper = 11;
        assertEquals(1, solution.countFairPairs(nums, lower, upper));
    }

    @Test
    void testAllZeroes() {
        CountFairPairs solution = createCountFairPairs();
        int[] nums = {0, 0, 0, 0, 0, 0, 0};
        int lower = 0, upper = 0;
        assertEquals(21, solution.countFairPairs(nums, lower, upper));
    }

    @Test
    void testNegativeNumbers() {
        CountFairPairs solution = createCountFairPairs();
        int[] nums = {-5, -7, -7, -5, -5};
        int lower = -12, upper = -12;
        assertEquals(6, solution.countFairPairs(nums, lower, upper));
    }

    @Test
    void testSingleElement() {
        CountFairPairs solution = createCountFairPairs();
        int[] nums = {-8};
        int lower = -8, upper = -7;
        assertEquals(0, solution.countFairPairs(nums, lower, upper));
    }

    @Test
    void testMixedNumbers() {
        CountFairPairs solution = createCountFairPairs();
        int[] nums = {7, 5, 6, 9, 4, 2, 10, 3};
        int lower = 10, upper = 13;
        assertEquals(11, solution.countFairPairs(nums, lower, upper));
    }

    @Test
    void testSmallArray() {
        CountFairPairs solution = createCountFairPairs();
        int[] nums = {-1, 0};
        int lower = 1, upper = 1;
        assertEquals(0, solution.countFairPairs(nums, lower, upper));
    }

    @Test
    void testLargeArrayAllFairPairs() {
        CountFairPairs solution = createCountFairPairs();
        int[] nums = {1, 2, 3, 4, 5};
        int lower = 3, upper = 8;
        assertEquals(9, solution.countFairPairs(nums, lower, upper));
    }

    @Test
    void testEdgeCaseZeroRange() {
        CountFairPairs solution = createCountFairPairs();
        int[] nums = {1, 7, 5, 9, 2, 11};
        int lower = 12, upper = 12;
        assertEquals(2, solution.countFairPairs(nums, lower, upper));
    }

    @Test
    void testPerformanceCase() {
        CountFairPairs solution = createCountFairPairs();
        int[] nums = new int[100000];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = i;
        }
        int lower = 50000, upper = 100000;
        assertTrue(solution.countFairPairs(nums, lower, upper) > 0);
    }
}
