package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class CanSortArrayTest {
    CanSortArray canSortArrayObj = new CanSortArray();

    @Test
    void testExampleCases() {
        // Example 1
        assertTrue(canSortArrayObj.canSortArray(new int[]{8, 4, 2, 30, 15}));
        // Example 2
        assertTrue(canSortArrayObj.canSortArray(new int[]{1, 2, 3, 4, 5}));
        // Example 3
        assertFalse(canSortArrayObj.canSortArray(new int[]{3, 16, 8, 4, 2}));
    }

    @Test
    void testAlreadySorted() {
        // The array is already sorted
        assertTrue(canSortArrayObj.canSortArray(new int[]{1, 2, 3, 4}));
        assertTrue(canSortArrayObj.canSortArray(new int[]{2, 4, 8, 16, 32}));
    }

    @Test
    void testSingleElement() {
        // Single element array
        assertTrue(canSortArrayObj.canSortArray(new int[]{1}));
        assertTrue(canSortArrayObj.canSortArray(new int[]{28}));
    }

    @Test
    void testSameSetBits() {
        // All elements have the same number of set bits
        assertFalse(canSortArrayObj.canSortArray(new int[]{7, 3, 15, 15}));
        assertTrue(canSortArrayObj.canSortArray(new int[]{5, 9, 5, 13}));
    }

    @Test
    void testMixedSetBits() {
        // Array with mixed set bits, not sortable
        assertFalse(canSortArrayObj.canSortArray(new int[]{5, 9, 7, 12, 3}));
        assertFalse(canSortArrayObj.canSortArray(new int[]{9, 15, 2, 18, 6}));
    }

    @Test
    void testLargeValues() {
        // Array with maximum values
        assertTrue(canSortArrayObj.canSortArray(new int[]{16, 8, 4, 2, 1}));
        assertFalse(canSortArrayObj.canSortArray(new int[]{28, 16, 15, 4, 2}));
    }

    @Test
    void testEdgeCases() {
        // Edge cases
        assertTrue(canSortArrayObj.canSortArray(new int[]{1}));
        assertTrue(canSortArrayObj.canSortArray(new int[]{1, 1, 1}));
        assertTrue(canSortArrayObj.canSortArray(new int[]{1, 28}));
    }

    @Test
    void testComplexCases() {
        // Complex cases with varied input
        assertFalse(canSortArrayObj.canSortArray(new int[]{75, 34, 30}));
        assertTrue(canSortArrayObj.canSortArray(new int[]{177, 29, 256}));
        assertTrue(canSortArrayObj.canSortArray(new int[]{33, 134, 56, 234}));
        assertFalse(canSortArrayObj.canSortArray(new int[]{20, 6, 7, 10, 20, 6, 20}));
        assertFalse(canSortArrayObj.canSortArray(new int[]{9, 9, 3, 15, 15, 18, 5}));
    }

    @Test
    void testPerformance() {
        // Performance with maximum constraints
        int[] nums = new int[100];
        for (int i = 0; i < 100; i++) {
            nums[i] = i + 1;
        }
        assertTrue(canSortArrayObj.canSortArray(nums)); // Already sorted
    }
}
