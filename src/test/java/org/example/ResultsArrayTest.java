package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;

class ResultsArrayTest {

    ResultsArray resultsArrayObj = new ResultsArray();

    @Test
    void testExampleCases() {
        // Example 1
        assertArrayEquals(new int[]{3, 4, -1, -1, -1}, resultsArrayObj.resultsArray(new int[]{1, 2, 3, 4, 3, 2, 5}, 3));
        // Example 2
        assertArrayEquals(new int[]{-1, -1}, resultsArrayObj.resultsArray(new int[]{2, 2, 2, 2, 2}, 4));
        // Example 3
        assertArrayEquals(new int[]{-1, 3, -1, 3, -1}, resultsArrayObj.resultsArray(new int[]{3, 2, 3, 2, 3, 2}, 2));
    }

    @Test
    void testSingleElementArray() {
        // Single element array, k = 1
        assertArrayEquals(new int[]{1}, resultsArrayObj.resultsArray(new int[]{1}, 1));
        // Single element array, k > 1
        assertArrayEquals(new int[]{}, resultsArrayObj.resultsArray(new int[]{1}, 2));
    }

    @Test
    void testAllSameElements() {
        // Array with all identical elements
        assertArrayEquals(new int[]{-1, -1, -1}, resultsArrayObj.resultsArray(new int[]{1, 1, 1, 1}, 2));
    }

    @Test
    void testAllConsecutive() {
        // Fully consecutive array
        assertArrayEquals(new int[]{2, 3, 4}, resultsArrayObj.resultsArray(new int[]{1, 2, 3, 4}, 2));
        assertArrayEquals(new int[]{4}, resultsArrayObj.resultsArray(new int[]{1, 2, 3, 4}, 4));
    }

    @Test
    void testLargeK() {
        // k equals the length of the array
        assertArrayEquals(new int[]{4}, resultsArrayObj.resultsArray(new int[]{1, 2, 3, 4}, 4));
        // k larger than the length of the array
        assertArrayEquals(new int[]{}, resultsArrayObj.resultsArray(new int[]{1, 2, 3, 4}, 5));
    }

    @Test
    void testNonConsecutiveElements() {
        // Array with non-consecutive elements
        assertArrayEquals(new int[]{-1, -1, -1}, resultsArrayObj.resultsArray(new int[]{1, 3, 5, 7}, 2));
        assertArrayEquals(new int[]{-1}, resultsArrayObj.resultsArray(new int[]{1, 3, 5, 7}, 4));
    }

    @Test
    void testLargeInput() {
        // Large input to ensure efficiency
        int[] nums = new int[500];
        for (int i = 0; i < 500; i++) {
            nums[i] = i + 1;
        }
        int[] expected = new int[499];
        for (int i = 0; i < 499; i++) {
            expected[i] = i + 2;
        }
        assertArrayEquals(expected, resultsArrayObj.resultsArray(nums, 2));
    }
}

