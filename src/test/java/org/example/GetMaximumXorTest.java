package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class GetMaximumXorTest {
    GetMaximumXor getMaximumXorObj = new GetMaximumXor();

    @Test
    void testExampleCases() {
        // Example 1
        assertArrayEquals(new int[]{0, 3, 2, 3}, getMaximumXorObj.getMaximumXor(new int[]{0, 1, 1, 3}, 2));
        // Example 2
        assertArrayEquals(new int[]{5, 2, 6, 5}, getMaximumXorObj.getMaximumXor(new int[]{2, 3, 4, 7}, 3));
        // Example 3
        assertArrayEquals(new int[]{4, 3, 6, 4, 6, 7}, getMaximumXorObj.getMaximumXor(new int[]{0, 1, 2, 2, 5, 7}, 3));
    }

    @Test
    void testSingleElement() {
        // Single element in nums
        assertArrayEquals(new int[]{1}, getMaximumXorObj.getMaximumXor(new int[]{0}, 1));
        assertArrayEquals(new int[]{3}, getMaximumXorObj.getMaximumXor(new int[]{0}, 2));
        assertArrayEquals(new int[]{7}, getMaximumXorObj.getMaximumXor(new int[]{0}, 3));
    }

    @Test
    void testAllZeros() {
        // nums contains only zeros
        assertArrayEquals(new int[]{7, 7, 7}, getMaximumXorObj.getMaximumXor(new int[]{0, 0, 0}, 3));
        assertArrayEquals(new int[]{15, 15}, getMaximumXorObj.getMaximumXor(new int[]{0, 0}, 4));
    }

    @Test
    void testAscendingOrder() {
        // nums in ascending order
        assertArrayEquals(new int[]{7, 4, 6}, getMaximumXorObj.getMaximumXor(new int[]{1, 2, 3}, 3));
        assertArrayEquals(new int[]{11, 12, 10}, getMaximumXorObj.getMaximumXor(new int[]{5, 6, 7}, 4));
    }

    @Test
    void testMaximumBit() {
        // Test for maximum bit sizes
        assertArrayEquals(new int[]{3, 0, 2, 3}, getMaximumXorObj.getMaximumXor(new int[]{0, 1, 2, 3}, 2));
        assertArrayEquals(new int[]{5, 10, 13, 14}, getMaximumXorObj.getMaximumXor(new int[]{1, 3, 7, 15}, 4));
    }

    @Test
    void testLargeInput() {
        // Large input size
        int[] nums = new int[100000];
        for (int i = 0; i < 100000; i++) {
            nums[i] = i % 1024; // Cyclic pattern
        }
        int[] result = getMaximumXorObj.getMaximumXor(nums, 10);
        assertNotNull(result); // Ensure result is generated
        assertEquals(100000, result.length); // Verify length
    }

    @Test
    void testEdgeCases() {
        // Edge cases
        assertArrayEquals(new int[]{1}, getMaximumXorObj.getMaximumXor(new int[]{0}, 1));
        assertArrayEquals(new int[]{0}, getMaximumXorObj.getMaximumXor(new int[]{1}, 1));
        assertArrayEquals(new int[]{0, 1}, getMaximumXorObj.getMaximumXor(new int[]{0, 1}, 1));
    }

    @Test
    void testMixedValues() {
        // Mixed values in nums
        assertArrayEquals(new int[]{2, 6, 5}, getMaximumXorObj.getMaximumXor(new int[]{2, 3, 4}, 3));
        assertArrayEquals(new int[]{5, 3, 6}, getMaximumXorObj.getMaximumXor(new int[]{1, 5, 6}, 3));
    }
}
