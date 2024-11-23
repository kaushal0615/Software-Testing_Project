package org.example;


public class GridHelper {

    public int calculateSquare(int i, int j, int[][] grid, int[][] dp) {
        if (i >= grid.length || j >= grid[0].length) {
            return 0;
        }
        if (grid[i][j] == 0) {
            return 0;
        }
        if (dp[i][j] != -1) {
            return dp[i][j];
        }
        int right = calculateSquare(i, j + 1, grid, dp);
        int diagonal = calculateSquare(i + 1, j + 1, grid, dp);
        int below = calculateSquare(i + 1, j, grid, dp);

        return dp[i][j] = 1 + Math.min(right, Math.min(diagonal, below));
    }
}
