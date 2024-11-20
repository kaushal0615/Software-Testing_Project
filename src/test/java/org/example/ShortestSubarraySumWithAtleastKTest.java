package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ShortestSubarraySumWithAtleastKTest {

    ShortestSubarraySumWithAtleastK solution = new ShortestSubarraySumWithAtleastK();

    @Test
    void testExample1() {
        int[] nums = {1};
        int k = 1;
        assertEquals(1, solution.shortestSubarray(nums, k));
    }

    @Test
    void testExample2() {
        int[] nums = {1, 2};
        int k = 4;
        assertEquals(-1, solution.shortestSubarray(nums, k));
    }

    @Test
    void testExample3() {
        int[] nums = {2, -1, 2};
        int k = 3;
        assertEquals(3, solution.shortestSubarray(nums, k));
    }

    @Test
    void testPositiveAndNegative() {
        int[] nums = {-28, 81, -20, 28, -29};
        int k = 89;
        assertEquals(3, solution.shortestSubarray(nums, k));
    }

    @Test
    void testOnlyNegativeNumbers() {
        int[] nums = {-5, -5, -5};
        int k = 1;
        assertEquals(-1, solution.shortestSubarray(nums, k));
    }

    @Test
    void testLargeArray() {
        int[] nums = new int[100000];
        for (int i = 0; i < nums.length; i++) nums[i] = 1; // Array of 1's
        int k = 100000;
        assertEquals(100000, solution.shortestSubarray(nums, k));
    }

    @Test
    void testEdgeCase() {
        int[] nums = {44, -25, 75, -50, -38, -42, -32, -6, -40, -46, -47};
        int k = 19;
        assertEquals(1, solution.shortestSubarray(nums, k));
    }
}
