package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindKthBitTest {

    FindKthBit solution = new FindKthBit();

    @Test
    void testExample1() {
        int n = 3, k = 1;
        assertEquals('0', solution.findKthBit(n, k));
    }

    @Test
    void testExample2() {
        int n = 4, k = 11;
        assertEquals('1', solution.findKthBit(n, k));
    }

    @Test
    void testEdgeCaseN20K243002() {
        int n = 20, k = 243002;
        assertEquals('1', solution.findKthBit(n, k)); // Expected based on the generated sequence
    }

    @Test
    void testEdgeCaseN20K189470() {
        int n = 20, k = 189470;
        assertEquals('0', solution.findKthBit(n, k)); // Expected based on the generated sequence
    }

    @Test
    void testEdgeCaseN20K426580() {
        int n = 20, k = 426580;
        assertEquals('1', solution.findKthBit(n, k)); // Expected based on the generated sequence
    }

    @Test
    void testEdgeCaseN20K1048575() {
        int n = 20, k = 1048575;
        assertEquals('1', solution.findKthBit(n, k)); // Expected based on the generated sequence
    }

    @Test
    void testEdgeCaseN20K32944() {
        int n = 20, k = 32944;
        assertEquals('0', solution.findKthBit(n, k)); // Expected based on the generated sequence
    }

    @Test
    void testSmallValues() {
        assertEquals('0', solution.findKthBit(1, 1));
        assertEquals('1', solution.findKthBit(2, 3));
        assertEquals('0', solution.findKthBit(3, 5));
    }

    @Test
    void testHighValues() {
        assertEquals('1', solution.findKthBit(20, 524287));
        assertEquals('0', solution.findKthBit(20, 1));
        assertEquals('1', solution.findKthBit(20, 2));
    }
}
