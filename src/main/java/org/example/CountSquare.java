package org.example;

import java.util.Arrays;

public class CountSquare {

    private final GridHelper gridHelper;

    public CountSquare(GridHelper gridHelper) {
        this.gridHelper = gridHelper;
    }

    public int countSquares(int[][] grid) {
        int ans = 0;
        int[][] dp = new int[grid.length][grid[0].length];
        for (int i = 0; i < grid.length; i++) {
            Arrays.fill(dp[i], -1);
        }
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                ans += gridHelper.calculateSquare(i, j, grid, dp);
            }
        }

        return ans;
    }
}