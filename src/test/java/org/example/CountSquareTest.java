package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CountSquareCombinedTest {

    // Helper method to create CountSquare with GridHelper
    private CountSquare createCountSquare() {
        GridHelper helper = new GridHelper();
        return new CountSquare(helper);
    }

    // Unit-level tests
    @Test
    void testExample1() {
        CountSquare solution = createCountSquare();
        int[][] matrix = {
                {0, 1, 1, 1},
                {1, 1, 1, 1},
                {0, 1, 1, 1}
        };
        assertEquals(15, solution.countSquares(matrix));
    }

    @Test
    void testExample2() {
        CountSquare solution = createCountSquare();
        int[][] matrix = {
                {1, 0, 1},
                {1, 1, 0},
                {1, 1, 0}
        };
        assertEquals(7, solution.countSquares(matrix));
    }

    @Test
    void testSmallGrid() {
        CountSquare solution = createCountSquare();
        int[][] matrix = {
                {1, 0, 0},
                {1, 1, 0}
        };
        assertEquals(3, solution.countSquares(matrix));
    }

    @Test
    void testMixedGrid() {
        CountSquare solution = createCountSquare();
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
        CountSquare solution = createCountSquare();
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
        CountSquare solution = createCountSquare();
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
        CountSquare solution = createCountSquare();
        int[][] matrix = {
                {1, 1, 0, 0, 1},
                {1, 0, 1, 1, 1},
                {1, 1, 1, 1, 1},
                {1, 0, 1, 0, 1},
                {0, 0, 1, 0, 1}
        };
        assertEquals(19, solution.countSquares(matrix));
    }

    // Integration-level tests
    @Test
    void testIntegrationSmallGrid() {
        CountSquare solution = createCountSquare();
        int[][] grid = {
                {1, 1},
                {1, 1}
        };
        assertEquals(5, solution.countSquares(grid)); // 4 squares of size 1 and 1 square of size 2
    }

    @Test
    void testIntegrationSingleCell() {
        CountSquare solution = createCountSquare();
        int[][] grid = {
                {1}
        };
        assertEquals(1, solution.countSquares(grid)); // Only 1 square of size 1
    }

    @Test
    void testIntegrationEmptyGrid() {
        CountSquare solution = createCountSquare();
        int[][] grid = {
                {0, 0},
                {0, 0}
        };
        assertEquals(0, solution.countSquares(grid)); // No squares
    }

    @Test
    void testIntegrationLargerGrid() {
        CountSquare solution = createCountSquare();
        int[][] grid = {
                {1, 1, 1},
                {1, 1, 1},
                {1, 1, 1}
        };
        assertEquals(14, solution.countSquares(grid)); // 9 squares of size 1, 4 squares of size 2, 1 square of size 3
    }
}
