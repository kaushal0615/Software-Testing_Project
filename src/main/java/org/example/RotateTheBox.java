package org.example;

public class RotateTheBox {

    private final RotateHelper helper;

    public RotateTheBox(RotateHelper helper) {
        this.helper = helper;
    }

    public char[][] rotateTheBox(char[][] box) {
        int m = box.length;
        int n = box[0].length;
        char[][] result = new char[n][m];

        // Rotate the box by copying elements
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                result[i][j] = box[j][i];
            }
        }

        // Reverse rows using helper
        for (int i = 0; i < n; i++) {
            helper.reverse(result[i]);
        }

        // Apply gravity using helper
        helper.applyGravity(result, m, n);

        return result;
    }
}

