package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MinLengthTest {

    MinLength minLength = new MinLength();

    @Test
    void testExample1() {
        assertEquals(2, minLength.minLength("ABFCACDB"));
    }

    @Test
    void testExample2() {
        assertEquals(5, minLength.minLength("ACBBD"));
    }

    @Test
    void testNoReduction() {
        assertEquals(0, minLength.minLength("ABCD"));
    }

    @Test
    void testAllPairs() {
        assertEquals(0, minLength.minLength("ABCDABCD"));
    }

    @Test
    void testInterleavedPairs() {
        assertEquals(2, minLength.minLength("ABCDABDC"));
    }

    @Test
    void testEmptyString() {
        assertEquals(0, minLength.minLength(""));
    }

    @Test
    void testSingleCharacter() {
        assertEquals(1, minLength.minLength("A"));
    }

    @Test
    void testRepeatedLetters() {
        assertEquals(7, minLength.minLength("AAAAAAABBBBBBBCCCCCCC"));
    }

    @Test
    void testComplexCase1() {
        assertEquals(0, minLength.minLength("ABABCDCD"));
    }

    @Test
    void testComplexCase2() {
        assertEquals(62, minLength.minLength("CCADDADDDBBCDDBABACADABAABADCABDCCBDACBDBAADDABCABBCABBDDAABCBCBBCCCDBCDDDADAACBCACDDBBA"));
    }

    @Test
    void testLargeInput() {
        String input = "AB".repeat(50) + "CD".repeat(50);
        assertEquals(0, minLength.minLength(input));
    }
}
