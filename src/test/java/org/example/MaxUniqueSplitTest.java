package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxUniqueSplitTest {

    MaxUniqueSplit solution = new MaxUniqueSplit();

    @Test
    void testExample1() {
        String s = "ababccc";
        assertEquals(5, solution.maxUniqueSplit(s));
    }

    @Test
    void testExample2() {
        String s = "aba";
        assertEquals(2, solution.maxUniqueSplit(s));
    }

    @Test
    void testExample3() {
        String s = "aa";
        assertEquals(1, solution.maxUniqueSplit(s));
    }

    @Test
    void testEdgeCaseSingleCharacter() {
        String s = "a";
        assertEquals(1, solution.maxUniqueSplit(s));
    }

    @Test
    void testLongStringAllSameCharacters() {
        String s = "aaaaaaaaaaaaaaaa";
        assertEquals(5, solution.maxUniqueSplit(s));
    }

    @Test
    void testComplexString1() {
        String s = "dbbpaaaab";
        assertEquals(6, solution.maxUniqueSplit(s));
    }

    @Test
    void testComplexString2() {
        String s = "aacaccckaaaaaa";
        assertEquals(7, solution.maxUniqueSplit(s));
    }

    @Test
    void testComplexString3() {
        String s = "jnafaeffbehaif";
        assertEquals(11, solution.maxUniqueSplit(s));
    }

    @Test
    void testEdgeCaseLongestString() {
        String s = "igppsagzepaaaaba";
        assertEquals(11, solution.maxUniqueSplit(s));
    }

    @Test
    void testStringWithRepeatingPatterns() {
        String s = "abcabcabc";
        assertEquals(6, solution.maxUniqueSplit(s)); // ['a', 'b', 'c', 'ab', 'ca', 'bc']
    }
}
