package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TakeCharactersTest {

    TakeCharacters takeCharacters = new TakeCharacters();

    @Test
    void testExampleCases() {
        // Example 1
        assertEquals(8, takeCharacters.takeCharacters("aabaaaacaabc", 2));
        // Example 2
        assertEquals(-1, takeCharacters.takeCharacters("a", 1));
    }

    @Test
    void testZeroK() {
        // k = 0, no need to take any characters
        assertEquals(0, takeCharacters.takeCharacters("abc", 0));
        assertEquals(0, takeCharacters.takeCharacters("aaaaabbbb", 0));
    }

    @Test
    void testImpossibleCases() {
        // Not enough 'b' or 'c'
        assertEquals(-1, takeCharacters.takeCharacters("aaaaa", 1));
        // Not enough 'a'
        assertEquals(-1, takeCharacters.takeCharacters("bbbbcccc", 1));
        // Not enough 'c'
        assertEquals(-1, takeCharacters.takeCharacters("abababab", 1));
    }

    @Test
    void testExactK() {
        // Only enough characters for exactly k
        assertEquals(-1, takeCharacters.takeCharacters("aacbca", 2));
        assertEquals(6, takeCharacters.takeCharacters("abcabc", 2));
    }

    @Test
    void testLargeInput() {
        // Large input, ensure no time limit exceeded
        String largeInput = "a".repeat(50000) + "b".repeat(30000) + "c".repeat(20000);
        assertEquals(60000, takeCharacters.takeCharacters(largeInput, 20000));
    }

    @Test
    void testMinimumInput() {
        // Edge case: smallest input
        assertEquals(-1, takeCharacters.takeCharacters("a", 1));
        assertEquals(0, takeCharacters.takeCharacters("a", 0));
    }

    @Test
    void testSingleCharacterRepeated() {
        // Single character repeated
        assertEquals(-1, takeCharacters.takeCharacters("aaaa", 1));
        assertEquals(-1, takeCharacters.takeCharacters("aaaaa", 4));
    }
    @Test
    void testMixedCharacters() {
        // Mixed scenarios
        assertEquals(4, takeCharacters.takeCharacters("cacbcc", 1));
        assertEquals(3, takeCharacters.takeCharacters("aabac", 1));
        assertEquals(6, takeCharacters.takeCharacters("abcabcabc", 2));
        assertEquals(4, takeCharacters.takeCharacters("aaaaaaabccbaa", 1));
    }

    @Test
    void testOnlyEnoughForK() {
        // Input has exactly k occurrences for all characters
        assertEquals(6, takeCharacters.takeCharacters("aabbccc", 2));
        assertEquals(6, takeCharacters.takeCharacters("aabbcc", 2));
    }
}
