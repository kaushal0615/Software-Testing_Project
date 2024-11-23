package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MinimizedMaximumIntegrationTest {

    private MinimizedMaximum createMinimizedMaximum() {
        DistributionHelper helper = new DistributionHelper();
        return new MinimizedMaximum(helper);
    }

    @Test
    void testExampleCases() {
        MinimizedMaximum solution = createMinimizedMaximum();
        assertEquals(3, solution.minimizedMaximum(6, new int[]{11, 6}));
        assertEquals(5, solution.minimizedMaximum(7, new int[]{15, 10, 10}));
        assertEquals(100000, solution.minimizedMaximum(1, new int[]{100000}));
    }

    @Test
    void testSingleProduct() {
        MinimizedMaximum solution = createMinimizedMaximum();
        assertEquals(1, solution.minimizedMaximum(10, new int[]{5}));
        assertEquals(1, solution.minimizedMaximum(10, new int[]{1}));
    }

    @Test
    void testSingleStore() {
        MinimizedMaximum solution = createMinimizedMaximum();
        assertEquals(0, solution.minimizedMaximum(1, new int[]{5, 5, 5}));
        assertEquals(0, solution.minimizedMaximum(1, new int[]{20, 30, 50}));
    }

    @Test
    void testEqualDistribution() {
        MinimizedMaximum solution = createMinimizedMaximum();
        assertEquals(2, solution.minimizedMaximum(5, new int[]{2, 2, 2, 2, 2}));
        assertEquals(10, solution.minimizedMaximum(2, new int[]{10, 10}));
    }

    @Test
    void testLargeInput() {
        MinimizedMaximum solution = createMinimizedMaximum();
        assertEquals(1, solution.minimizedMaximum(100000, new int[]{1, 1, 1, 1, 1}));
        assertEquals(100000, solution.minimizedMaximum(4, new int[]{100000, 100000, 100000, 100000}));
    }

    @Test
    void testEdgeCases() {
        MinimizedMaximum solution = createMinimizedMaximum();
        assertEquals(1, solution.minimizedMaximum(1, new int[]{1}));
        assertEquals(1, solution.minimizedMaximum(2, new int[]{1}));
        assertEquals(100000, solution.minimizedMaximum(1, new int[]{100000}));
        assertEquals(1, solution.minimizedMaximum(100000, new int[]{100000}));
    }

    @Test
    void testUnevenDistribution() {
        MinimizedMaximum solution = createMinimizedMaximum();
        assertEquals(20, solution.minimizedMaximum(5, new int[]{30, 40, 20}));
        assertEquals(7, solution.minimizedMaximum(6, new int[]{21, 14}));
    }

    @Test
    void testMultipleProductsWithLargeStores() {
        MinimizedMaximum solution = createMinimizedMaximum();
        assertEquals(1, solution.minimizedMaximum(100000, new int[]{4, 5, 4, 2, 1, 1, 4}));
        assertEquals(100000, solution.minimizedMaximum(8, new int[]{100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000}));
    }
}
