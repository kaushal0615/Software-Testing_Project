package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MinChangesTest {

    MinChanges solution = new MinChanges();

    @Test
    void testExample1() {
        String s = "1001";
        assertEquals(2, solution.minChanges(s));
    }

    @Test
    void testExample2() {
        String s = "10";
        assertEquals(1, solution.minChanges(s));
    }

    @Test
    void testExample3() {
        String s = "0000";
        assertEquals(0, solution.minChanges(s));
    }

    @Test
    void testAlternatingCharacters() {
        String s = "101010";
        assertEquals(3, solution.minChanges(s)); // Each pair needs one change
    }

    @Test
    void testAllOnes() {
        String s = "111111";
        assertEquals(0, solution.minChanges(s)); // Already beautiful
    }

    @Test
    void testAllZeros() {
        String s = "000000";
        assertEquals(0, solution.minChanges(s)); // Already beautiful
    }

    @Test
    void testMixedCharacters() {
        String s = "101011000001";
        assertEquals(3, solution.minChanges(s)); // Mixed characters needing changes
    }

    @Test
    void testLongInput() {
        String s = "10010100000111001101011000000010110011";
        assertEquals(8, solution.minChanges(s)); // Long string with alternating needs
    }

    @Test
    void testEdgeCaseTwoCharacters() {
        String s = "01";
        assertEquals(1, solution.minChanges(s)); // Minimum input length
    }

    @Test
    void testLongBeautifulString() {
        String s = "000011000000";
        assertEquals(0, solution.minChanges(s)); // Already beautiful
    }

    @Test
    void testComplexCase() {
        String s = "111101101110";
        assertEquals(3, solution.minChanges(s)); // Requires changes for several pairs
    }

    @Test
    void testLargeAlternatingString() {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < 100000; i++) {
            s.append(i % 2 == 0 ? '1' : '0');
        }
        assertEquals(50000, solution.minChanges(s.toString())); // Large alternating input
    }
}
