package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class MinimizedMaximumTest {
    MinimizedMaximum minimizedMaximumObj = new MinimizedMaximum();

    @Test
    void testExampleCases() {
        // Example 1
        assertEquals(3, minimizedMaximumObj.minimizedMaximum(6, new int[]{11, 6}));
        // Example 2
        assertEquals(5, minimizedMaximumObj.minimizedMaximum(7, new int[]{15, 10, 10}));
        // Example 3
        assertEquals(100000, minimizedMaximumObj.minimizedMaximum(1, new int[]{100000}));
    }

    @Test
    void testSingleProduct() {
        // Only one product, should return the quantity of the product
        assertEquals(1, minimizedMaximumObj.minimizedMaximum(10, new int[]{5}));
        assertEquals(1, minimizedMaximumObj.minimizedMaximum(10, new int[]{1}));
    }

    @Test
    void testSingleStore() {
        // Single store, should return the sum of all product quantities
        assertEquals(0, minimizedMaximumObj.minimizedMaximum(1, new int[]{5, 5, 5}));
        assertEquals(0, minimizedMaximumObj.minimizedMaximum(1, new int[]{20, 30, 50}));
    }

    @Test
    void testEqualDistribution() {
        // Perfectly divisible distribution
        assertEquals(2, minimizedMaximumObj.minimizedMaximum(5, new int[]{2, 2, 2, 2, 2}));
        assertEquals(10, minimizedMaximumObj.minimizedMaximum(2, new int[]{10, 10}));
    }

    @Test
    void testLargeInput() {
        // Large input with a high number of stores
        assertEquals(1, minimizedMaximumObj.minimizedMaximum(100000, new int[]{1, 1, 1, 1, 1}));
        assertEquals(100000, minimizedMaximumObj.minimizedMaximum(4, new int[]{100000, 100000, 100000, 100000}));
    }

    @Test
    void testEdgeCases() {
        // Smallest inputs
        assertEquals(1, minimizedMaximumObj.minimizedMaximum(1, new int[]{1}));
        assertEquals(1, minimizedMaximumObj.minimizedMaximum(2, new int[]{1}));

        // Large quantities with one store
        assertEquals(100000, minimizedMaximumObj.minimizedMaximum(1, new int[]{100000}));

        // Large quantities with enough stores
        assertEquals(1, minimizedMaximumObj.minimizedMaximum(100000, new int[]{100000}));
    }

    @Test
    void testUnevenDistribution() {
        // Uneven distribution
        assertEquals(20, minimizedMaximumObj.minimizedMaximum(5, new int[]{30, 40, 20}));
        assertEquals(7, minimizedMaximumObj.minimizedMaximum(6, new int[]{21, 14}));
    }

    @Test
    void testMultipleProductsWithLargeStores() {
        // Large number of stores with multiple products
        assertEquals(1, minimizedMaximumObj.minimizedMaximum(100000, new int[]{4, 5, 4, 2, 1, 1, 4}));
        assertEquals(100000, minimizedMaximumObj.minimizedMaximum(8, new int[]{100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000}));
    }
}
