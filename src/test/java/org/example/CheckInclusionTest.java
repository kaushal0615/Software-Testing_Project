package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CheckInclusionTest {

    CheckInclusion checkInclusion = new CheckInclusion();

    @Test
    void testExample1() {
        assertTrue(checkInclusion.checkInclusion("ab", "eidbaooo"));
    }

    @Test
    void testExample2() {
        assertFalse(checkInclusion.checkInclusion("ab", "eidboaoo"));
    }

    @Test
    void testPermutationAtStart() {
        assertTrue(checkInclusion.checkInclusion("adc", "dcda"));
    }

    @Test
    void testShortS2() {
        assertFalse(checkInclusion.checkInclusion("bc", "ad"));
    }

    @Test
    void testExactMatch() {
        assertTrue(checkInclusion.checkInclusion("abc", "defabc"));
    }

    @Test
    void testNoMatch() {
        assertFalse(checkInclusion.checkInclusion("hello", "ooolleoooleh"));
    }

    @Test
    void testMultiplePermutations() {
        assertTrue(checkInclusion.checkInclusion("abcd", "abcaabdbcdeafgbcdiabcbbcaabclcabcababccabd"));
    }

    @Test
    void testEmptyS1() {
        assertTrue(checkInclusion.checkInclusion("", "eidboaoo"));
    }

    @Test
    void testEmptyS2() {
        assertFalse(checkInclusion.checkInclusion("abc", ""));
    }

    @Test
    void testS1LongerThanS2() {
        assertFalse(checkInclusion.checkInclusion("abcdef", "abc"));
    }

    @Test
    void testSingleCharacterMatch() {
        assertTrue(checkInclusion.checkInclusion("a", "a"));
    }

    @Test
    void testSingleCharacterNoMatch() {
        assertFalse(checkInclusion.checkInclusion("a", "b"));
    }

    @Test
    void testLargeInputs() {
        String s1 = "abc";
        String s2 = "a".repeat(10000) + "bca" + "c".repeat(10000);
        assertTrue(checkInclusion.checkInclusion(s1, s2));
    }
}
