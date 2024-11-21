package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RotateStringTest {

    RotateString solution = new RotateString();

    @Test
    void testExample1() {
        String s = "abcde";
        String goal = "cdeab";
        assertTrue(solution.rotateString(s, goal));
    }

    @Test
    void testExample2() {
        String s = "abcde";
        String goal = "abced";
        assertFalse(solution.rotateString(s, goal));
    }

    @Test
    void testSingleCharacterMatch() {
        String s = "a";
        String goal = "a";
        assertTrue(solution.rotateString(s, goal));
    }

    @Test
    void testSingleCharacterMismatch() {
        String s = "a";
        String goal = "b";
        assertFalse(solution.rotateString(s, goal));
    }

    @Test
    void testDifferentLengths() {
        String s = "abc";
        String goal = "abcd";
        assertFalse(solution.rotateString(s, goal));
    }

    @Test
    void testEmptyStrings() {
        String s = "";
        String goal = "";
        assertTrue(solution.rotateString(s, goal)); // Both are empty, considered equal
    }

    @Test
    void testLongerStringExactMatch() {
        String s = "abcdebcdefin";
        String goal = "abcdebcdefin";
        assertTrue(solution.rotateString(s, goal));
    }

    @Test
    void testRotationValid() {
        String s = "dvadererrerdvaddf";
        String goal = "rerdvaddfdvaderer";
        assertTrue(solution.rotateString(s, goal));
    }

    @Test
    void testRotationInvalid() {
        String s = "bcad";
        String goal = "abcd";
        assertFalse(solution.rotateString(s, goal));
    }

    @Test
    void testLargeInputValid() {
        String s = "bbbacddceeb";
        String goal = "ceebbbbacdd";
        assertTrue(solution.rotateString(s, goal));
    }

    @Test
    void testLargeInputInvalid() {
        String s = "abcde";
        String goal = "abce";
        assertFalse(solution.rotateString(s, goal)); // Different lengths
    }

    @Test
    void testEdgeCaseAllRotations() {
        String s = "abcd";
        String goal = "abcd";
        assertTrue(solution.rotateString(s, goal)); // Goal is same as input
    }
}
