package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinimumStepsTest {

    MinimumSteps solution = new MinimumSteps();

    @Test
    void testExample1() {
        String s = "101";
        assertEquals(1, solution.minimumSteps(s));
    }

    @Test
    void testExample2() {
        String s = "100";
        assertEquals(2, solution.minimumSteps(s));
    }

    @Test
    void testExample3() {
        String s = "0111";
        assertEquals(0, solution.minimumSteps(s));
    }

    @Test
    void testAllBlack() {
        String s = "1111111";
        assertEquals(0, solution.minimumSteps(s));
    }

    @Test
    void testAllWhite() {
        String s = "0000000";
        assertEquals(0, solution.minimumSteps(s));
    }

    @Test
    void testMixedCase1() {
        String s = "001";
        assertEquals(0, solution.minimumSteps(s));
    }

    @Test
    void testMixedCase2() {
        String s = "0011000010";
        assertEquals(11, solution.minimumSteps(s));
    }

    @Test
    void testLargeCase1() {
        String s = "001110001110001";
        assertEquals(27, solution.minimumSteps(s));
    }

    @Test
    void testLargeCase2() {
        String s = "111111111111111111111111111111111111111110011";
        assertEquals(82, solution.minimumSteps(s));
    }

    @Test
    void testLargeCase3() {
        String s = "1111110000000000000000000000000000000000001011";
        assertEquals(223, solution.minimumSteps(s));
    }

    @Test
    void testAlternating() {
        String s = "0101010101010101";
        assertEquals(28, solution.minimumSteps(s));
    }
}
