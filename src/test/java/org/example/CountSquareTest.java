package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CountSquareTest {

    @Test
    void testExample1() {
        CountSquare solution = new CountSquare();
        int[][] matrix = {
                {0, 1, 1, 1},
                {1, 1, 1, 1},
                {0, 1, 1, 1}
        };
        assertEquals(15, solution.countSquares(matrix));
    }

    @Test
    void testExample2() {
        CountSquare solution = new CountSquare();
        int[][] matrix = {
                {1, 0, 1},
                {1, 1, 0},
                {1, 1, 0}
        };
        assertEquals(7, solution.countSquares(matrix));
    }

    @Test
    void testSmallGrid() {
        CountSquare solution = new CountSquare();
        int[][] matrix = {
                {1, 0, 0},
                {1, 1, 0}
        };
        assertEquals(3, solution.countSquares(matrix));
    }

    @Test
    void testMixedGrid() {
        CountSquare solution = new CountSquare();
        int[][] matrix = {
                {1, 1, 1, 1},
                {1, 0, 0, 1},
                {1, 1, 0, 0},
                {1, 0, 0, 0}
        };
        assertEquals(9, solution.countSquares(matrix));
    }

    @Test
    void testComplexGrid() {
        CountSquare solution = new CountSquare();
        int[][] matrix = {
                {0, 1, 1, 1},
                {1, 1, 0, 1},
                {1, 1, 1, 1},
                {1, 0, 1, 0}
        };
        assertEquals(13, solution.countSquares(matrix));
    }

    @Test
    void testNonSquareMatrix() {
        CountSquare solution = new CountSquare();
        int[][] matrix = {
                {1, 0, 1, 0, 1},
                {1, 0, 0, 1, 1},
                {0, 1, 0, 1, 1},
                {1, 0, 0, 1, 1}
        };
        assertEquals(14, solution.countSquares(matrix));
    }

    @Test
    void testLargeGrid() {
        CountSquare solution = new CountSquare();
        int[][] matrix = {
                {1, 1, 0, 0, 1},
                {1, 0, 1, 1, 1},
                {1, 1, 1, 1, 1},
                {1, 0, 1, 0, 1},
                {0, 0, 1, 0, 1}
        };
        assertEquals(19, solution.countSquares(matrix));
    }
}
