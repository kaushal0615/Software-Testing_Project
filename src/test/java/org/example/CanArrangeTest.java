package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CanArrangeTest {

    CanArrange solution = new CanArrange();

    @Test
    void testExample1() {
        int[] arr = {1, 2, 3, 4, 5, 10, 6, 7, 8, 9};
        int k = 5;
        assertTrue(solution.canArrange(arr, k));
    }

    @Test
    void testExample2() {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int k = 7;
        assertTrue(solution.canArrange(arr, k));
    }

    @Test
    void testExample3() {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int k = 10;
        assertFalse(solution.canArrange(arr, k));
    }

    @Test
    void testLargeNumbers() {
        int[] arr = {987654321, -987654321, 765432100, -765432100};
        int k = 99999;
        assertTrue(solution.canArrange(arr, k));
    }

    @Test
    void testNegativeNumbers() {
        int[] arr = {-1, 0, -2, 2, -3, 3};
        int k = 4;
        assertFalse(solution.canArrange(arr, k));
    }

    @Test
    void testMixedNumbers() {
        int[] arr = {9606, 4830, 4037, -1054, 3308, 6966, 6528, 3953, 473, -388};
        int k = 10;
        assertFalse(solution.canArrange(arr, k));
    }

    @Test
    void testZeroRemainders() {
        int[] arr = {0, 0, 0, 0};
        int k = 100000;
        assertTrue(solution.canArrange(arr, k)); // All zero pairs are valid
    }

    @Test
    void testUnmatchableRemainders() {
        int[] arr = {-2, -4, -9, -3, -1, -17};
        int k = 6;
        assertTrue(solution.canArrange(arr, k)); // Cannot form pairs
    }

    @Test
    void testSingleValidPair() {
        int[] arr = {5, 10};
        int k = 5;
        assertTrue(solution.canArrange(arr, k));
    }

    @Test
    void testEdgeCaseAllPairsValid() {
        int[] arr = {123456789, 987654321, -123456789, -987654321};
        int k = 11111;
        assertTrue(solution.canArrange(arr, k));
    }

    @Test
    void testEdgeCaseInvalid() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int k = 10;
        assertFalse(solution.canArrange(arr, k)); // Cannot pair all numbers
    }
}
