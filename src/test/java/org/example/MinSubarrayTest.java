package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MinSubarrayTest {

    MinSubarray minSubarray = new MinSubarray();

    @Test
    void testExample1() {
        int[] nums = {3, 1, 4, 2};
        int p = 6;
        assertEquals(1, minSubarray.minSubarray(nums, p));
    }

    @Test
    void testExample2() {
        int[] nums = {6, 3, 5, 2};
        int p = 9;
        assertEquals(2, minSubarray.minSubarray(nums, p));
    }

    @Test
    void testExample3() {
        int[] nums = {1, 2, 3};
        int p = 3;
        assertEquals(0, minSubarray.minSubarray(nums, p));
    }

    @Test
    void testSingleElementDivisible() {
        int[] nums = {1};
        int p = 1;
        assertEquals(0, minSubarray.minSubarray(nums, p));
    }

    @Test
    void testSingleElementNotDivisible() {
        int[] nums = {1};
        int p = 2;
        assertEquals(-1, minSubarray.minSubarray(nums, p));
    }

    @Test
    void testLargeInputNoRemovalNeeded() {
        int[] nums = {26, 19, 11, 14, 18, 4, 7, 1, 30, 23, 19, 8, 10, 6, 26, 3};
        int p = 26;
        assertEquals(3, minSubarray.minSubarray(nums, p));
    }

    @Test
    void testLargeInputWithRemoval() {
        int[] nums = {3, 4, 79, 65, 11, 1, 44, 4, 12, 53, 21, 52, 52, 37, 86, 58, 37, 17, 5, 61, 74, 85, 18, 71, 79, 68, 25, 63, 73, 36, 69, 3, 84, 70, 86, 22, 4, 3, 58, 32, 44, 12, 17, 58, 32, 63};
        int p = 1352;
        assertEquals(11, minSubarray.minSubarray(nums, p));
    }

    @Test
    void testZeroModulo() {
        int[] nums = {5, 12, 2, 14, 11, 15, 10, 22, 20, 10, 20};
        int p = 81;
        assertEquals(-1, minSubarray.minSubarray(nums, p));
    }

    @Test
    void testLargeInputEdgeCase() {
        int[] nums = {45, 262, 270, 364, 232, 59, 206, 139, 266, 84, 309, 114, 309, 163, 379, 302, 93, 198, 345, 278, 317, 59, 289, 84, 265, 158, 376, 57, 289, 369, 243, 286, 380, 3, 44, 65, 152, 180, 91, 377, 366, 14, 199, 266, 133, 286, 192, 163, 84, 232, 7, 180, 107, 178, 30, 291, 221, 167, 153, 204, 189, 328, 134, 368, 287, 238, 383, 378, 84, 230, 303, 228, 279, 213, 308, 190, 353};
        int p = 1376;
        assertEquals(5, minSubarray.minSubarray(nums, p));
    }
}
