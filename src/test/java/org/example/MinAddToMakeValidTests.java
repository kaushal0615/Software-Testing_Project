package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MinAddToMakeValidTest {

    MinAddToMakeValid solution = new MinAddToMakeValid();

    @Test
    void testExample1() {
        assertEquals(1, solution.minAddToMakeValid("())"));
    }

    @Test
    void testExample2() {
        assertEquals(3, solution.minAddToMakeValid("((("));
    }

    @Test
    void testComplexCase1() {
        assertEquals(4, solution.minAddToMakeValid("()))(("));
    }

    @Test
    void testBalancedString() {
        assertEquals(0, solution.minAddToMakeValid("()()"));
    }

    @Test
    void testOnlyClosingBrackets() {
        assertEquals(5, solution.minAddToMakeValid(")))))"));
    }

    @Test
    void testOnlyOpeningBrackets() {
        assertEquals(4, solution.minAddToMakeValid("(((("));
    }

    @Test
    void testEmptyString() {
        assertEquals(0, solution.minAddToMakeValid(""));
    }

    @Test
    void testLargeInputBalanced() {
        String input = "()".repeat(500);
        assertEquals(0, solution.minAddToMakeValid(input));
    }

    @Test
    void testLargeInputUnbalanced() {
        String input = "(".repeat(1000);
        assertEquals(1000, solution.minAddToMakeValid(input));
    }

    @Test
    void testComplexCase2() {
        assertEquals(3, solution.minAddToMakeValid("(()))(()))("));
    }

    @Test
    void testInterleavedBrackets() {
        assertEquals(2, solution.minAddToMakeValid(")()()("));
    }
}
