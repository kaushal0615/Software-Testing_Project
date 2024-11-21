package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CountUnguardedCellsTest {

    CountUnguardedCells solution = new CountUnguardedCells();

    @Test
    void testExample1() {
        int m = 4, n = 6;
        int[][] guards = {{0, 0}, {1, 1}, {2, 3}};
        int[][] walls = {{0, 1}, {2, 2}, {1, 4}};
        assertEquals(7, solution.countUnguarded(m, n, guards, walls));
    }

    @Test
    void testExample2() {
        int m = 3, n = 3;
        int[][] guards = {{1, 1}};
        int[][] walls = {{0, 1}, {1, 0}, {2, 1}, {1, 2}};
        assertEquals(4, solution.countUnguarded(m, n, guards, walls));
    }

    @Test
    void testSingleGuardNoWalls() {
        int m = 3, n = 3;
        int[][] guards = {{1, 1}};
        int[][] walls = {};
        assertEquals(4, solution.countUnguarded(m, n, guards, walls));
    }

    @Test
    void testSingleWallNoGuards() {
        int m = 3, n = 3;
        int[][] guards = {};
        int[][] walls = {{1, 1}};
        assertEquals(8, solution.countUnguarded(m, n, guards, walls));
    }

    @Test
    void testGuardsBlockingEachOther() {
        int m = 5, n = 5;
        int[][] guards = {{1, 1}, {1, 3}};
        int[][] walls = {};
        assertEquals(12, solution.countUnguarded(m, n, guards, walls));
    }

    @Test
    void testLargeGridWithFewGuardsAndWalls() {
        int m = 10, n = 8;
        int[][] guards = {{6, 4}, {4, 5}, {0, 3}, {8, 2}, {6, 3}};
        int[][] walls = {{7, 2}};
        assertEquals(28, solution.countUnguarded(m, n, guards, walls));
    }

    @Test
    void testFullCoverageByGuards() {
        int m = 4, n = 4;
        int[][] guards = {{0, 0}, {1, 1}, {2, 2}, {3, 3}};
        int[][] walls = {};
        assertEquals(0, solution.countUnguarded(m, n, guards, walls));
    }

    @Test
    void testEmptyGrid() {
        int m = 0, n = 0;
        int[][] guards = {};
        int[][] walls = {};
        assertEquals(0, solution.countUnguarded(m, n, guards, walls));
    }

    @Test
    void testEdgeCaseSmallGrid() {
        int m = 1, n = 1;
        int[][] guards = {{0, 0}};
        int[][] walls = {};
        assertEquals(0, solution.countUnguarded(m, n, guards, walls));
    }

    @Test
    void testLargeGridWithManyGuardsAndWalls() {
        int m = 82, n = 98;
        int[][] guards = {{70, 26}, {8, 75}, {57, 59}, {1, 45}, {27, 47}, {9, 4}, {1, 17}, {62, 93}, {17, 62}, {7, 1}, {58, 92}, {42, 43}, {7, 49}};
        int[][] walls = {{62, 66}, {68, 16}, {54, 14}, {4, 8}, {3, 25}, {31, 73}, {42, 28}, {9, 20}, {42, 82}, {11, 80}, {3, 3}, {5, 28}, {31, 91}, {47, 2}, {36, 3}, {50, 17}, {28, 31}, {59, 33}, {58, 43}, {66, 87}, {74, 38}, {68, 85}, {44, 57}, {38, 25}, {56, 54}};
        assertEquals(6266, solution.countUnguarded(m, n, guards, walls));
    }

    @Test
    void testMultipleRowsAndColumnsWithObstructions() {
        int m = 7, n = 1;
        int[][] guards = {{0, 0}, {4, 0}, {1, 0}};
        int[][] walls = {{6, 0}, {5, 0}, {3, 0}};
        assertEquals(0, solution.countUnguarded(m, n, guards, walls));
    }
}
