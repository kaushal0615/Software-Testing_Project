package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class MinimumMountainRemovalsTest {
    MinimumMountainRemovals minimumMountainRemovalsObj = new MinimumMountainRemovals();

    @Test
    void testExampleCases() {
        // Example 1
        assertEquals(0, minimumMountainRemovalsObj.minimumMountainRemovals(new int[]{1, 3, 1}));
        // Example 2
        assertEquals(3, minimumMountainRemovalsObj.minimumMountainRemovals(new int[]{2, 1, 1, 5, 6, 2, 3, 1}));
    }

    @Test
    void testAlreadyMountain() {
        // Array already a mountain
        assertEquals(0, minimumMountainRemovalsObj.minimumMountainRemovals(new int[]{1, 5, 3}));
        assertEquals(0, minimumMountainRemovalsObj.minimumMountainRemovals(new int[]{1, 2, 3, 2, 1}));
    }

    @Test
    void testFlatSections() {
        // Array has flat sections that need to be removed
        assertEquals(1, minimumMountainRemovalsObj.minimumMountainRemovals(new int[]{1, 3, 3, 2, 1}));
        assertEquals(1, minimumMountainRemovalsObj.minimumMountainRemovals(new int[]{1, 2, 2, 3, 2, 1}));
    }

    @Test
    void testComplexCases() {
        // Complex cases
        assertEquals(8, minimumMountainRemovalsObj.minimumMountainRemovals(new int[]{10, 9, 8, 7, 6, 5, 4}));
        assertEquals(0, minimumMountainRemovalsObj.minimumMountainRemovals(new int[]{1, 3, 5, 4, 3, 2, 1}));
        assertEquals(0, minimumMountainRemovalsObj.minimumMountainRemovals(new int[]{1, 100, 50}));
    }

    @Test
    void testEdgeCases() {
        // Smallest possible mountain
        assertEquals(0, minimumMountainRemovalsObj.minimumMountainRemovals(new int[]{1, 2, 1}));
        // No removals needed
        assertEquals(0, minimumMountainRemovalsObj.minimumMountainRemovals(new int[]{3, 4, 5, 3}));
    }

    @Test
    void testPerformance() {
        // Maximum size input with increasing values
        int[] nums = new int[1000];
        for (int i = 0; i < 1000; i++) {
            nums[i] = i + 1;
        }
        assertEquals(1001, minimumMountainRemovalsObj.minimumMountainRemovals(nums));

        // Maximum size input with a single peak
        int[] numsWithPeak = new int[1000];
        for (int i = 0; i < 500; i++) {
            numsWithPeak[i] = i + 1;
        }
        for (int i = 500; i < 1000; i++) {
            numsWithPeak[i] = 1000 - i;
        }
        assertEquals(1, minimumMountainRemovalsObj.minimumMountainRemovals(numsWithPeak));
    }

    @Test
    void testMixedNumbers() {
        // Mixed increasing and decreasing values
        assertEquals(2, minimumMountainRemovalsObj.minimumMountainRemovals(new int[]{1, 5, 6, 2, 1, 2, 3}));
        assertEquals(8, minimumMountainRemovalsObj.minimumMountainRemovals(new int[]{100, 92, 89, 77, 74, 66, 64}));
    }
}
