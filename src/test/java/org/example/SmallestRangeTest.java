package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SmallestRangeTest {

    SmallestRange solution = new SmallestRange();

    @Test
    void testExample1() {
        List<List<Integer>> nums = new ArrayList<>();
        nums.add(Arrays.asList(4, 10, 15, 24, 26));
        nums.add(Arrays.asList(0, 9, 12, 20));
        nums.add(Arrays.asList(5, 18, 22, 30));
        assertArrayEquals(new int[]{20, 24}, solution.smallestRange(nums));
    }

    @Test
    void testExample2() {
        List<List<Integer>> nums = new ArrayList<>();
        nums.add(Arrays.asList(1, 2, 3));
        nums.add(Arrays.asList(1, 2, 3));
        nums.add(Arrays.asList(1, 2, 3));
        assertArrayEquals(new int[]{1, 1}, solution.smallestRange(nums));
    }

    @Test
    void testSmallCase() {
        List<List<Integer>> nums = new ArrayList<>();
        nums.add(Arrays.asList(10));
        nums.add(Arrays.asList(11));
        assertArrayEquals(new int[]{10, 11}, solution.smallestRange(nums));
    }

    @Test
    void testComplexCase1() {
        List<List<Integer>> nums = new ArrayList<>();
        nums.add(Arrays.asList(-1, 1));
        nums.add(Arrays.asList(-2, 2));
        nums.add(Arrays.asList(-3, 3));
        nums.add(Arrays.asList(-4, 4));
        nums.add(Arrays.asList(-5, 5));
        assertArrayEquals(new int[]{-5, -1}, solution.smallestRange(nums));
    }

    @Test
    void testComplexCase2() {
        List<List<Integer>> nums = new ArrayList<>();
        nums.add(Arrays.asList(35, 77, 78, 78, 79));
        nums.add(Arrays.asList(34, 49, 77));
        nums.add(Arrays.asList(-11, -2, 9, 14, 30, 31, 40, 53, 57, 60, 61, 63, 65));
        nums.add(Arrays.asList(22, 30));
        assertArrayEquals(new int[]{30, 35}, solution.smallestRange(nums));
    }

    @Test
    void testLargeCase() {
        List<List<Integer>> nums = new ArrayList<>();
        nums.add(Arrays.asList(-38, 15, 17, 18));
        nums.add(Arrays.asList(-34, 46, 58, 59, 61));
        nums.add(Arrays.asList(-55, -31, -13, 64, 82, 82, 83, 84, 85));
        nums.add(Arrays.asList(-3, 63, 70, 90));
        nums.add(Arrays.asList(2, 6, 10, 28, 28, 32, 32, 32, 33));
        assertArrayEquals(new int[]{-38, 2}, solution.smallestRange(nums));
    }

    @Test
    void testEdgeCase() {
        List<List<Integer>> nums = new ArrayList<>();
        nums.add(Arrays.asList(1, 2, 3));
        nums.add(Arrays.asList(4, 5, 6));
        nums.add(Arrays.asList(7, 8, 9));
        assertArrayEquals(new int[]{3, 7}, solution.smallestRange(nums));
    }
}
