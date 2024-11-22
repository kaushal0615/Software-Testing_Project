package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class CompressedStringTest {
    CompressedString compressedStringObj = new CompressedString();

    @Test
    void testExampleCases() {
        // Example 1
        assertEquals("1a1b1c1d1e", compressedStringObj.compressedString("abcde"));
        // Example 2
        assertEquals("9a5a2b", compressedStringObj.compressedString("aaaaaaaaaaaaaabb"));
    }

    @Test
    void testSingleCharacter() {
        // Single character input
        assertEquals("1o", compressedStringObj.compressedString("o"));
        assertEquals("1z", compressedStringObj.compressedString("z"));
    }

    @Test
    void testRepetitiveCharacters() {
        // Characters repeated less than 9 times
        assertEquals("3v", compressedStringObj.compressedString("vvv"));
        assertEquals("2x1l2a", compressedStringObj.compressedString("xxlaa"));
    }

    @Test
    void testExactlyNineRepetitions() {
        // Characters repeated exactly 9 times
        assertEquals("9x", compressedStringObj.compressedString("xxxxxxxxx"));
    }

    @Test
    void testMoreThanNineRepetitions() {
        // Characters repeated more than 9 times
        assertEquals("9a5a", compressedStringObj.compressedString("aaaaaaaaaaaaaa"));
        assertEquals("9y1y", compressedStringObj.compressedString("yyyyyyyyyy"));
    }

    @Test
    void testMixedCharacters() {
        // Mixed characters with varying repetitions
        assertEquals("1x4b2j", compressedStringObj.compressedString("xbbbbjj"));
        assertEquals("8y3f4c2q2w8f9r5a9y", compressedStringObj.compressedString("yyyyyyyyfffccccqqwwffffffffrrrrrrrrraaaaayyyyyyyyy"));
    }

    @Test
    void testEdgeCases() {
        // Edge cases
        assertEquals("1u", compressedStringObj.compressedString("u")); // Single character
        assertEquals("9u1u1x", compressedStringObj.compressedString("uuuuuuuuuux")); // Boundary condition
        assertEquals("9u1u6c7v8y1l3y9q1o1a4q", compressedStringObj.compressedString("uuuuuuuuuuccccccvvvvvvvyyyyyyyylyyyqqqqqqqqqoaqqqq"));
    }

    @Test
    void testLongInput() {
        // Long input to test performance
        StringBuilder input = new StringBuilder();
        StringBuilder expected = new StringBuilder();
        for (int i = 0; i < 100000; i++) {
            input.append("a");
        }
        for (int i = 0; i < 100000 / 9; i++) {
            expected.append("9a");
        }
        expected.append("1a");
        assertEquals(expected.toString(), compressedStringObj.compressedString(input.toString()));
    }

    @Test
    void testAlternatingCharacters() {
        // Alternating characters
        assertEquals("1a1b1a1b1a", compressedStringObj.compressedString("ababa"));
        assertEquals("1x1y1x1y1x1y", compressedStringObj.compressedString("xyxyxy"));
    }
}
