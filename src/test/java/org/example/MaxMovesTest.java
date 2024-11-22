package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MaxMovesTest {

    MaxMoves solution = new MaxMoves();

    @Test
    void testExample1() {
        int[][] grid = {
                {2, 4, 3, 5},
                {5, 4, 9, 3},
                {3, 4, 2, 11},
                {10, 9, 13, 15}
        };
        assertEquals(3, solution.maxMoves(grid));
    }

    @Test
    void testExample2() {
        int[][] grid = {
                {3, 2, 4},
                {2, 1, 9},
                {1, 1, 7}
        };
        assertEquals(0, solution.maxMoves(grid));
    }

    @Test
    void testLargeValues() {
        int[][] grid = {
                {2, 625152, 3, 5},
                {625151, 625152, 9, 3}
        };
        assertEquals(1, solution.maxMoves(grid));
    }

    @Test
    void testComplexCase1() {
        int[][] grid = {
                {207, 141, 103, 12},
                {148, 187, 211, 88},
                {116, 16, 67, 157},
                {210, 93, 137, 120},
                {52, 116, 241, 86},
                {58, 213, 3, 292}
        };
        assertEquals(3, solution.maxMoves(grid));
    }

    @Test
    void testComplexCase2() {
        int[][] grid = {
                {19, 13, 5, 10, 30, 19, 28},
                {17, 9, 2, 26, 9, 24, 3},
                {1, 12, 13, 21, 18, 12, 8},
                {17, 10, 13, 15, 19, 30, 6},
                {14, 5, 24, 24, 17, 22, 6}
        };
        assertEquals(6, solution.maxMoves(grid));
    }

    @Test
    void testComplexCase3() {
        int[][] grid = {
                {27, 134, 137, 68},
                {265, 270, 273, 72},
                {217, 41, 165, 61},
                {40, 269, 19, 75},
                {143, 152, 15, 260},
                {149, 173, 38, 63},
                {184, 151, 26, 258},
                {171, 278, 112, 37},
                {142, 191, 269, 244}
        };
        assertEquals(2, solution.maxMoves(grid));
    }

    @Test
    void testSingleRow() {
        int[][] grid = {
                {1, 2, 3, 4, 5}
        };
        assertEquals(4, solution.maxMoves(grid));
    }

    @Test
    void testSingleColumn() {
        int[][] grid = {
                {1},
                {2},
                {3},
                {4},
                {5}
        };
        assertEquals(0, solution.maxMoves(grid));
    }

    @Test
    void testNoMovesPossible() {
        int[][] grid = {
                {5, 4, 3, 2, 1},
                {5, 4, 3, 2, 1}
        };
        assertEquals(0, solution.maxMoves(grid));
    }

    @Test
    void testMaxMovesPossible() {
        int[][] grid = {
                {1, 2, 3, 4, 5},
                {2, 3, 4, 5, 6},
                {3, 4, 5, 6, 7},
                {4, 5, 6, 7, 8},
                {5, 6, 7, 8, 9}
        };
        assertEquals(4, solution.maxMoves(grid));
    }
}
