package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LargestCombinationTest {

    LargestCombination solution = new LargestCombination();

    @Test
    void testExample1() {
        int[] candidates = {16, 17, 71, 62, 12, 24, 14};
        assertEquals(4, solution.largestCombination(candidates));
    }

    @Test
    void testExample2() {
        int[] candidates = {8, 8};
        assertEquals(2, solution.largestCombination(candidates));
    }

    @Test
    void testSingleElement() {
        int[] candidates = {1};
        assertEquals(1, solution.largestCombination(candidates)); // Only one element
    }

    @Test
    void testPowerOfTwo() {
        int[] candidates = {1, 2, 4, 8, 16};
        assertEquals(1, solution.largestCombination(candidates)); // No overlap in bits
    }

    @Test
    void testAllBitsSet() {
        int[] candidates = {7, 7, 7};
        assertEquals(3, solution.largestCombination(candidates)); // All bits overlap
    }

    @Test
    void testLargeNumbers() {
        int[] candidates = {10000000, 6777215};
        assertEquals(1, solution.largestCombination(candidates)); // Sparse bit overlaps
    }

    @Test
    void testDiverseBits() {
        int[] candidates = {1024, 1, 512, 2097152, 8, 32, 256, 4096};
        assertEquals(1, solution.largestCombination(candidates)); // Each number has distinct bits
    }

    @Test
    void testMultipleOverlaps() {
        int[] candidates = {16, 16, 16, 16};
        assertEquals(4, solution.largestCombination(candidates)); // Same number multiple times
    }

    @Test
    void testRandomNumbers() {
        int[] candidates = {2902691, 5795304, 6498538, 1107154, 3738293, 98410};
        assertEquals(5, solution.largestCombination(candidates)); // Partial bit overlap
    }

    @Test
    void testLargeArray() {
        int[] candidates = new int[100000];
        for (int i = 0; i < candidates.length; i++) {
            candidates[i] = 1; // All bits overlap
        }
        assertEquals(100000, solution.largestCombination(candidates));
    }

    @Test
    void testEmptyArray() {
        int[] candidates = {};
        assertEquals(0, solution.largestCombination(candidates)); // No elements in the array
    }

    @Test
    void testMixedValues() {
        int[] candidates = {9452577, 5000319, 8976514, 8629397};
        assertEquals(4, solution.largestCombination(candidates)); // Partial overlap in bits
    }

    @Test
    void testHighBitNumbers() {
        int[] candidates = {1048576, 2097152, 4194304};
        assertEquals(1, solution.largestCombination(candidates)); // Large powers of 2
    }
}
