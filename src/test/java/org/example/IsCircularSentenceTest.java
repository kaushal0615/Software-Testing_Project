package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class IsCircularSentenceTest {
    IsCircularSentence isCircularSentenceObj = new IsCircularSentence();

    @Test
    void testExampleCases() {
        // Example 1
        assertTrue(isCircularSentenceObj.isCircularSentence("leetcode exercises sound delightful"));
        // Example 2
        assertTrue(isCircularSentenceObj.isCircularSentence("eetcode"));
        // Example 3
        assertFalse(isCircularSentenceObj.isCircularSentence("Leetcode is cool"));
    }

    @Test
    void testSingleWord() {
        // Single word cases
        assertTrue(isCircularSentenceObj.isCircularSentence("L"));
        assertTrue(isCircularSentenceObj.isCircularSentence("sus"));
        assertFalse(isCircularSentenceObj.isCircularSentence("Leetcode"));
    }

    @Test
    void testMultipleWords() {
        // Multiple word cases
        assertFalse(isCircularSentenceObj.isCircularSentence("a b c d e a"));
        assertFalse(isCircularSentenceObj.isCircularSentence("leetcode Exercises sound delightful"));
        assertFalse(isCircularSentenceObj.isCircularSentence("Leetcode exercises sound delightful"));
    }

    @Test
    void testEdgeCases() {
        // Edge cases
        assertTrue(isCircularSentenceObj.isCircularSentence("a a a a a"));
        assertFalse(isCircularSentenceObj.isCircularSentence("a b c a"));
        assertFalse(isCircularSentenceObj.isCircularSentence("a aa aaa aaaa b"));
    }

    @Test
    void testCaseSensitivity() {
        // Case sensitivity
        assertFalse(isCircularSentenceObj.isCircularSentence("a A"));
        assertFalse(isCircularSentenceObj.isCircularSentence("Aa aa A"));
    }

    @Test
    void testComplexSentences() {
        // Complex sentences with multiple words and varied characters
        assertFalse(isCircularSentenceObj.isCircularSentence("MuFoevIXCZzrpXeRmTssj lYSW U jM"));
        assertFalse(isCircularSentenceObj.isCircularSentence("abc cde efg gab"));
        assertFalse(isCircularSentenceObj.isCircularSentence("abc def ghi abc"));
    }

    @Test
    void testPerformance() {
        // Performance test for maximum input size
        StringBuilder circularSentence = new StringBuilder();
        for (int i = 0; i < 100; i++) {
            circularSentence.append("ab ");
        }
        circularSentence.append("ba");
        assertFalse(isCircularSentenceObj.isCircularSentence(circularSentence.toString()));

        StringBuilder nonCircularSentence = new StringBuilder();
        for (int i = 0; i < 100; i++) {
            nonCircularSentence.append("ab ");
        }
        nonCircularSentence.append("bb");
        assertFalse(isCircularSentenceObj.isCircularSentence(nonCircularSentence.toString()));
    }
}
