package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MakeStringFancyTest {

    MakeStringFancy solution = new MakeStringFancy();

    @Test
    void testExample1() {
        String s = "leeetcode";
        String expected = "leetcode";
        assertEquals(expected, solution.makeFancyString(s));
    }

    @Test
    void testExample2() {
        String s = "aaabaaaa";
        String expected = "aabaa";
        assertEquals(expected, solution.makeFancyString(s));
    }

    @Test
    void testExample3() {
        String s = "aab";
        String expected = "aab";
        assertEquals(expected, solution.makeFancyString(s));
    }

    @Test
    void testSingleCharacter() {
        String s = "a";
        String expected = "a";
        assertEquals(expected, solution.makeFancyString(s));
    }

    @Test
    void testNoChangesNeeded() {
        String s = "abc";
        String expected = "abc";
        assertEquals(expected, solution.makeFancyString(s));
    }

    @Test
    void testAllSameCharacters() {
        String s = "aaaaaaa";
        String expected = "aa";
        assertEquals(expected, solution.makeFancyString(s));
    }

    @Test
    void testMixedCharacters() {
        String s = "aabbbaaaa";
        String expected = "aabbaa";
        assertEquals(expected, solution.makeFancyString(s));
    }

    @Test
    void testLongStringWithRepeats() {
        String s = "leeetcodeeeeeeeeeeeeeeeeeeeeeedddddddddddddddddddddd";
        String expected = "leetcodeedd";
        assertEquals(expected, solution.makeFancyString(s));
    }

    @Test
    void testLongStringWithNoRepeats() {
        String s = "abcdefghijklmnopqrstuvwxyz";
        String expected = "abcdefghijklmnopqrstuvwxyz";
        assertEquals(expected, solution.makeFancyString(s));
    }

    @Test
    void testLargeInput() {
        StringBuilder input = new StringBuilder();
        StringBuilder expected = new StringBuilder();
        for (int i = 0; i < 100000; i++) {
            input.append("a");
            if (i < 2) {
                expected.append("a");
            }
        }
        assertEquals(expected.toString(), solution.makeFancyString(input.toString()));
    }

    @Test
    void testComplexString() {
        String s = "bbbacddceeb";
        String expected = "bbacddceeb";
        assertEquals(expected, solution.makeFancyString(s));
    }

    @Test
    void testEdgeCaseTwoCharacters() {
        String s = "aa";
        String expected = "aa";
        assertEquals(expected, solution.makeFancyString(s));
    }
}
