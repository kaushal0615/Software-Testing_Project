package org.example;

import java.util.*;

public class DefuseTheBomb {
    public int[] decrypt(int[] code, int k) {
        int n = code.length;
        int[] ans = new int[n];
        if (k == 0) {
            Arrays.fill(ans, 0);
            return ans;
        }
        for (int i = 0; i < n; i++) {
            int sum = 0;
            if (k > 0) {
                for (int j = 1; j <= k; j++) {
                    sum += code[(i + j) % n];
                }
            } else {
                for (int j = 1; j <= -k; j++) {
                    sum += code[(i - j + n) % n];
                }
            }
            System.out.println("Index " + i + ": sum = " + sum);  // Debugging line
            ans[i] = sum;
        }
        return ans;
    }

}

