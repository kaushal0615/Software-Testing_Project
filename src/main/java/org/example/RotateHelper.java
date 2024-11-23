package org.example;

public class RotateHelper {

    // Reverse a row in the array
    public void reverse(char[] row) {
        int left = 0;
        int right = row.length - 1;
        while (left < right) {
            char temp = row[left];
            row[left] = row[right];
            row[right] = temp;
            left++;
            right--;
        }
    }

    // Apply gravity to the rotated matrix
    public void applyGravity(char[][] result, int m, int n) {
        for (int j = 0; j < m; j++) {
            for (int i = n - 1; i >= 0; i--) {
                if (result[i][j] == '.') {
                    int nextRowWithStone = -1;
                    for (int k = i - 1; k >= 0; k--) {
                        if (result[k][j] == '*') break; // Stop at an obstacle
                        if (result[k][j] == '#') {
                            nextRowWithStone = k;
                            break;
                        }
                    }
                    if (nextRowWithStone != -1) {
                        result[nextRowWithStone][j] = '.';
                        result[i][j] = '#';
                    }
                }
            }
        }
    }
}
