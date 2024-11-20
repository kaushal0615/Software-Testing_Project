package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FindLengthOfShortestSubarrayTest {

    FindLengthOfShortestSubarray solution = new FindLengthOfShortestSubarray();

    @Test
    void testAlreadySorted() {
        int[] arr = {1, 2, 3};
        assertEquals(0, solution.findLengthOfShortestSubarray(arr));
    }

    @Test
    void testStrictlyDecreasing() {
        int[] arr = {5, 4, 3, 2, 1};
        assertEquals(4, solution.findLengthOfShortestSubarray(arr));
    }

    @Test
    void testExample1() {
        int[] arr = {1, 2, 3, 10, 4, 2, 3, 5};
        assertEquals(3, solution.findLengthOfShortestSubarray(arr));
    }

    @Test
    void testExample2() {
        int[] arr = {5, 4, 3, 2, 1};
        assertEquals(4, solution.findLengthOfShortestSubarray(arr));
    }

    @Test
    void testExample3() {
        int[] arr = {1, 2, 3};
        assertEquals(0, solution.findLengthOfShortestSubarray(arr));
    }

    @Test
    void testWithDuplicates() {
        int[] arr = {2, 2, 2, 1, 1, 1};
        assertEquals(3, solution.findLengthOfShortestSubarray(arr));
    }

    @Test
    void testEdgeCaseSingleElement() {
        int[] arr = {1};
        assertEquals(0, solution.findLengthOfShortestSubarray(arr));
    }

    @Test
    void testEdgeCaseTwoElementsSorted() {
        int[] arr = {1, 2};
        assertEquals(0, solution.findLengthOfShortestSubarray(arr));
    }

    @Test
    void testEdgeCaseTwoElementsUnsorted() {
        int[] arr = {2, 1};
        assertEquals(1, solution.findLengthOfShortestSubarray(arr));
    }

    @Test
    void testComplexCase() {
        int[] arr = {1, 2, 3, 10, 0, 2, 7, 8, 9};
        assertEquals(3, solution.findLengthOfShortestSubarray(arr));
    }

    @Test
    void testLargeInputSorted() {
        int[] arr = new int[100000];
        for (int i = 0; i < arr.length; i++) arr[i] = i;
        assertEquals(0, solution.findLengthOfShortestSubarray(arr));
    }

    @Test
    void testLargeInputUnsorted() {
        int[] arr = new int[100000];
        for (int i = 0; i < arr.length; i++) arr[i] = arr.length - i;
        assertEquals(arr.length - 1, solution.findLengthOfShortestSubarray(arr));
    }

    @Test
    void testPartiallySorted() {
        int[] arr = {16, 10, 0, 3, 22, 1, 14, 7, 1, 12, 15};
        assertEquals(8, solution.findLengthOfShortestSubarray(arr));
    }

    @Test
    void testAnotherComplexCase() {
        int[] arr = {13, 0, 14, 7, 18, 18, 18, 16, 8, 15, 20};
        assertEquals(8, solution.findLengthOfShortestSubarray(arr));
    }
    @Test
    void testCriticalPrefixBoundary() {
        int[] arr = {1, 2, 3, 10, 9, 8, 7, 6};
        assertEquals(4, solution.findLengthOfShortestSubarray(arr));
    }

    @Test
    void testCriticalSuffixBoundary() {
        int[] arr = {10, 9, 8, 1, 2, 3, 4};
        assertEquals(3, solution.findLengthOfShortestSubarray(arr));
    }
    @Test
    void testMergePrefixAndSuffix() {
        int[] arr = {1, 2, 3, 10, 4, 2, 3, 5};
        assertEquals(3, solution.findLengthOfShortestSubarray(arr)); // Can merge prefix and suffix
    }
    @Test
    void testMinimalChange() {
        int[] arr = {1, 3, 2, 4};
        assertEquals(1, solution.findLengthOfShortestSubarray(arr)); // Removing [3] or [2] works
    }
    @Test
    void testMathMinEdgeCase() {
        int[] arr = {1, 2, 3, 10, 0, 2, 3};
        assertEquals(3, solution.findLengthOfShortestSubarray(arr)); // Test `n - left - 1` vs `right`
    }
    @Test
    void testPrefixBoundary() {
        int[] arr = {1, 2, 3, 5, 4};
        assertEquals(1, solution.findLengthOfShortestSubarray(arr)); // Remove [4]

        arr = new int[]{1, 2, 3, 4, 5};
        assertEquals(0, solution.findLengthOfShortestSubarray(arr)); // Already sorted
    }
    @Test
    void testSuffixBoundary() {
        int[] arr = {5, 6, 7, 8, 7};
        assertEquals(1, solution.findLengthOfShortestSubarray(arr)); // Remove [7]

        arr = new int[]{3, 2, 1, 4, 5};
        assertEquals(2, solution.findLengthOfShortestSubarray(arr)); // Remove [3, 2, 1]
    }
    @Test
    void testMergePrefixSuffix() {
        int[] arr = {1, 2, 3, 10, 0, 7, 8, 9};
        assertEquals(2, solution.findLengthOfShortestSubarray(arr)); // Remove [10, 0]

        arr = new int[]{1, 2, 3, 10, 0, 2, 7, 8, 9};
        assertEquals(3, solution.findLengthOfShortestSubarray(arr)); // Remove [10, 0]
    }
    @Test
    void testMergeLoopBoundary() {
        int[] arr = {10, 20, 30, 15, 25, 35};
        assertEquals(2, solution.findLengthOfShortestSubarray(arr)); // Remove [30, 15]

        arr = new int[]{5, 10, 15, 25, 0, 1};
        assertEquals(2, solution.findLengthOfShortestSubarray(arr)); // Remove [25, 0, 1]
    }


}
