package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumSwapTest {

    MaximumSwap solution = new MaximumSwap();

    @Test
    void testExample1() {
        int num = 2736;
        assertEquals(7236, solution.maximumSwap(num));
    }

    @Test
    void testExample2() {
        int num = 9973;
        assertEquals(9973, solution.maximumSwap(num));
    }

    @Test
    void testSingleDigit() {
        int num = 3;
        assertEquals(3, solution.maximumSwap(num));
    }

    @Test
    void testSmallSwap() {
        int num = 1993;
        assertEquals(9913, solution.maximumSwap(num));
    }

    @Test
    void testMultipleDigits() {
        int num = 6687;
        assertEquals(8667, solution.maximumSwap(num));
    }

    @Test
    void testExampleWithLargeSwap() {
        int num = 98368;
        assertEquals(98863, solution.maximumSwap(num));
    }

    @Test
    void testLargeNumber() {
        int num = 56867898;
        assertEquals(96867858, solution.maximumSwap(num));
    }

    @Test
    void testAnotherLargeNumber() {
        int num = 98004365;
        assertEquals(98604305, solution.maximumSwap(num));
    }

    @Test
    void testAlreadyMaximum() {
        int num = 87654321;
        assertEquals(87654321, solution.maximumSwap(num));
    }

    @Test
    void testZero() {
        int num = 0;
        assertEquals(0, solution.maximumSwap(num));
    }

    @Test
    void testTwoDigitSwap() {
        int num = 10;
        assertEquals(10, solution.maximumSwap(num));
    }
}
