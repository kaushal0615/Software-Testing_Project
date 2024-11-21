package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MinEndTest {

    MinEnd solution = new MinEnd();

    @Test
    void testExample1() {
        int n = 3, x = 4;
        assertEquals(6, solution.minEnd(n, x));
    }

    @Test
    void testExample2() {
        int n = 2, x = 7;
        assertEquals(15, solution.minEnd(n, x));
    }

    @Test
    void testSingleElement() {
        int n = 1, x = 1;
        assertEquals(1, solution.minEnd(n, x)); // Only one element in the array
    }

    @Test
    void testPowerOfTwoX() {
        int n = 4, x = 16;
        assertEquals(19, solution.minEnd(n, x)); // Tests a power of two for x
    }

    @Test
    void testLargeNAndX() {
        int n = 792, x = 283;
        assertEquals(25471, solution.minEnd(n, x)); // Large n and random x
    }

    @Test
    void testXEqualsN() {
        int n = 18, x = 18;
        assertEquals(83, solution.minEnd(n, x)); // When x equals n
    }

    @Test
    void testMaximumConstraints() {
        int n = 100000000, x = 100000000;
        assertTrue(solution.minEnd(n, x) > 0); // Tests maximum constraints, result should be valid
    }

    @Test
    void testSmallestInputs() {
        int n = 1, x = 1;
        assertEquals(1, solution.minEnd(n, x)); // Smallest inputs
    }

    @Test
    void testAllBitsSetX() {
        int n = 10, x = 1023; // All bits set for 10 bits
        assertEquals(10239, solution.minEnd(n, x)); // Ensures correct handling of all bits set
    }

    @Test
    void testNonPowerOfTwoX() {
        int n = 5, x = 21;
        assertEquals(53, solution.minEnd(n, x)); // Non-power-of-two x
    }
}
