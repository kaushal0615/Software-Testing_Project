package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MinimumTotalDistanceTest {

    MinimumTotalDistance solution = new MinimumTotalDistance();

    @Test
    void testExample1() {
        List<Integer> robot = Arrays.asList(0, 4, 6);
        int[][] factory = {{2, 2}, {6, 2}};
        assertEquals(4, solution.minimumTotalDistance(robot, factory));
    }

    @Test
    void testExample2() {
        List<Integer> robot = Arrays.asList(1, -1);
        int[][] factory = {{-2, 1}, {2, 1}};
        assertEquals(2, solution.minimumTotalDistance(robot, factory));
    }

    @Test
    void testSingleRobotAndFactory() {
        List<Integer> robot = Arrays.asList(7);
        int[][] factory = {{0, 1}};
        assertEquals(7, solution.minimumTotalDistance(robot, factory));
    }

    @Test
    void testComplexCase1() {
        List<Integer> robot = Arrays.asList(-40, -14, -8, 1, 3, 5, 39);
        int[][] factory = {{-34, 5}, {28, 2}, {-12, 3}};
        assertEquals(92, solution.minimumTotalDistance(robot, factory));
    }

    @Test
    void testComplexCase2() {
        List<Integer> robot = Arrays.asList(9, 11, 99, 101);
        int[][] factory = {
                {10, 1},
                {7, 1},
                {14, 1},
                {100, 1},
                {96, 1},
                {103, 1}
        };
        assertEquals(6, solution.minimumTotalDistance(robot, factory));
    }

    @Test
    void testLargeCase1() {
        List<Integer> robot = Arrays.asList(-551, -510, -344, -264, -242, -50, 202, 185, 700, 947);
        int[][] factory = {{-79, 5}, {-534, 5}};
        assertEquals(3172, solution.minimumTotalDistance(robot, factory));
    }

    @Test
    void testLargeCase2() {
        List<Integer> robot = Arrays.asList(403625544, 670355988, 886437985, 224430896, 126139936, -477101480, -868159607, -293937930);
        int[][] factory = {
                {333473422, 7},
                {912209329, 7},
                {468372740, 7},
                {-765827269, 4},
                {155827122, 4},
                {635462096, 2},
                {-300275936, 2},
                {-115627659, 0}
        };
        assertEquals(509199280, solution.minimumTotalDistance(robot, factory));
    }

    @Test
    void testEdgeCaseNoMovement() {
        List<Integer> robot = Arrays.asList(0, 0, 0);
        int[][] factory = {{0, 3}};
        assertEquals(0, solution.minimumTotalDistance(robot, factory));
    }

    @Test
    void testEdgeCaseAllSamePosition() {
        List<Integer> robot = Arrays.asList(5, 5, 5);
        int[][] factory = {{5, 3}};
        assertEquals(0, solution.minimumTotalDistance(robot, factory));
    }
}
