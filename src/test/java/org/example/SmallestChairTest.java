package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SmallestChairTest {

    SmallestChair solution = new SmallestChair();

    @Test
    void testExample1() {
        int[][] times = { {1, 4}, {2, 3}, {4, 6} };
        int targetFriend = 1;
        assertEquals(1, solution.smallestChair(times, targetFriend));
    }

    @Test
    void testExample2() {
        int[][] times = { {3, 10}, {1, 5}, {2, 6} };
        int targetFriend = 0;
        assertEquals(2, solution.smallestChair(times, targetFriend));
    }

    @Test
    void testLargeCase() {
        int[][] times = {
                {1, 2}, {2, 10}, {3, 10}, {4, 10}, {5, 10},
                {6, 10}, {7, 10}, {8, 10}, {9, 10}, {10, 11}
        };
        int targetFriend = 8;
        assertEquals(7, solution.smallestChair(times, targetFriend));
    }

    @Test
    void testSmallCase() {
        int[][] times = { {1, 2}, {2, 3} };
        int targetFriend = 1;
        assertEquals(0, solution.smallestChair(times, targetFriend));
    }

    @Test
    void testComplexCase() {
        int[][] times = {
                {33, 35}, {26, 29}, {9, 28}, {4, 31}, {8, 10}, {32, 34},
                {15, 24}, {27, 39}, {14, 36}, {1, 14}, {25, 39}, {5, 27},
                {6, 15}, {2, 38}, {19, 36}, {24, 34}, {3, 26}
        };
        int targetFriend = 0;
        assertEquals(3, solution.smallestChair(times, targetFriend));
    }

    @Test
    void testOverlappingTimes() {
        int[][] times = { {7, 10}, {6, 7}, {1, 3}, {2, 7}, {4, 5} };
        int targetFriend = 0;
        assertEquals(0, solution.smallestChair(times, targetFriend));
    }

    @Test
    void testEdgeCase() {
        int[][] times = { {2, 4}, {4, 9}, {3, 4}, {6, 8}, {5, 10} };
        int targetFriend = 4;
        assertEquals(1, solution.smallestChair(times, targetFriend));
    }
}
