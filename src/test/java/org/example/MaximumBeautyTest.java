package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
public class MaximumBeautyTest {
    MaximumBeauty maximumBeautyObj = new MaximumBeauty();

    @Test
    void testExampleCases() {
        // Example 1
        assertArrayEquals(new int[]{2, 4, 5, 5, 6, 6},
                maximumBeautyObj.maximumBeauty(new int[][]{{1, 2}, {3, 2}, {2, 4}, {5, 6}, {3, 5}}, new int[]{1, 2, 3, 4, 5, 6}));
        // Example 2
        assertArrayEquals(new int[]{4},
                maximumBeautyObj.maximumBeauty(new int[][]{{1, 2}, {1, 2}, {1, 3}, {1, 4}}, new int[]{1}));
        // Example 3
        assertArrayEquals(new int[]{0},
                maximumBeautyObj.maximumBeauty(new int[][]{{10, 1000}}, new int[]{5}));
    }

    @Test
    void testSingleItem() {
        // Single item with price matching query
        assertArrayEquals(new int[]{1},
                maximumBeautyObj.maximumBeauty(new int[][]{{1, 1}}, new int[]{1}));
        // Single item with price exceeding query
        assertArrayEquals(new int[]{0},
                maximumBeautyObj.maximumBeauty(new int[][]{{10, 100}}, new int[]{5}));
    }

    @Test
    void testAllMatchingItems() {
        // All items have prices <= all queries
        assertArrayEquals(new int[]{5, 5, 5},
                maximumBeautyObj.maximumBeauty(new int[][]{{1, 2}, {2, 3}, {3, 5}}, new int[]{3, 4, 5}));
    }

    @Test
    void testNoMatchingItems() {
        // No items have prices <= any query
        assertArrayEquals(new int[]{0, 0, 0},
                maximumBeautyObj.maximumBeauty(new int[][]{{10, 100}, {20, 200}}, new int[]{1, 2, 3}));
    }

    @Test
    void testMultipleItemsSamePrice() {
        // Multiple items with the same price but different beauties
        assertArrayEquals(new int[]{4},
                maximumBeautyObj.maximumBeauty(new int[][]{{1, 2}, {1, 3}, {1, 4}}, new int[]{1}));
    }

    @Test
    void testLargeQueries() {
        // Large queries and high prices
        assertArrayEquals(new int[]{1, 0},
                maximumBeautyObj.maximumBeauty(new int[][]{{1000000000, 1}}, new int[]{1000000000, 999999999}));
    }

    @Test
    void testPerformance() {
        // Large input size
        int[][] items = new int[100000][2];
        for (int i = 0; i < 100000; i++) {
            items[i][0] = i + 1;
            items[i][1] = i + 1;
        }
        int[] queries = new int[100000];
        for (int i = 0; i < 100000; i++) {
            queries[i] = i + 1;
        }
        int[] expected = Arrays.stream(queries).toArray();
        assertArrayEquals(expected, maximumBeautyObj.maximumBeauty(items, queries));
    }

    @Test
    void testEdgeCases() {
        // Single query matches all items
        assertArrayEquals(new int[]{5},
                maximumBeautyObj.maximumBeauty(new int[][]{{1, 2}, {2, 3}, {3, 5}}, new int[]{10}));
        // Empty items or queries
        assertArrayEquals(new int[]{},
                maximumBeautyObj.maximumBeauty(new int[][]{}, new int[]{}));
    }
}
