package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PrimeSubOperationTest {

    PrimeSubOperation solution = new PrimeSubOperation();

    @Test
    void testExample1() {
        int[] nums = {4, 9, 6, 10};
        assertTrue(solution.primeSubOperation(nums));
    }

    @Test
    void testExample2() {
        int[] nums = {6, 8, 11, 12};
        assertTrue(solution.primeSubOperation(nums));
    }

    @Test
    void testExample3() {
        int[] nums = {5, 8, 3};
        assertFalse(solution.primeSubOperation(nums));
    }

    @Test
    void testAllSameElements() {
        int[] nums = {2, 2};
        assertFalse(solution.primeSubOperation(nums));
    }

    @Test
    void testMixedArray() {
        int[] nums = {3, 4, 10, 15, 6};
        assertTrue(solution.primeSubOperation(nums));
    }

    @Test
    void testLargeValues() {
        int[] nums = {471, 275, 336, 615, 491, 568, 396, 892, 215, 823, 161, 176, 903, 472, 826, 602, 216, 1000, 3, 751, 200, 842};
        assertFalse(solution.primeSubOperation(nums));
    }

    @Test
    void testPrimeSubtractionsOnly() {
        int[] nums = {11, 2, 10, 15, 19};
        assertFalse(solution.primeSubOperation(nums));
    }

    @Test
    void testArrayWithSmallValues() {
        int[] nums = {4, 2};
        assertTrue(solution.primeSubOperation(nums));
    }

    @Test
    void testDescendingArray() {
        int[] nums = {92, 9, 39, 11, 20, 13};
        assertFalse(solution.primeSubOperation(nums));
    }

    @Test
    void testAscendingArray() {
        int[] nums = {2, 3, 5, 7, 11, 13};
        assertTrue(solution.primeSubOperation(nums));
    }


    @Test
    void testArrayWithSingleElement() {
        int[] nums = {10};
        assertTrue(solution.primeSubOperation(nums));
    }

    @Test
    void testArrayWithRepeatingValues() {
        int[] nums = {48, 2, 88, 78, 18, 71, 86, 92};
        assertTrue(solution.primeSubOperation(nums));
    }
}
