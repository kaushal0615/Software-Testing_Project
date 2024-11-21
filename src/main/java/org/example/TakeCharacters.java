package org.example;

public class TakeCharacters {
    public int takeCharacters(String s, int k) {
        int n = s.length();

        int countA = 0;
        int countB = 0;
        int countC = 0;

        // Count occurrences of 'a', 'b', and 'c'
        for (char ch : s.toCharArray()) {
            if (ch == 'a') {
                countA++;
            } else if (ch == 'b') {
                countB++;
            } else if (ch == 'c') {
                countC++;
            }
        }

        // If any character count is less than k, return -1
        if (countA < k || countB < k || countC < k) {
            return -1;
        }

        int i = 0;
        int j = 0;
        int notDeletedWindowSize = 0;

        while (j < n) {
            if (s.charAt(j) == 'a') {
                countA--;
            } else if (s.charAt(j) == 'b') {
                countB--;
            } else if (s.charAt(j) == 'c') {
                countC--;
            }

            // Shrink the window if constraints are violated
            while (i <= j && (countA < k || countB < k || countC < k)) {
                if (s.charAt(i) == 'a') {
                    countA++;
                } else if (s.charAt(i) == 'b') {
                    countB++;
                } else if (s.charAt(i) == 'c') {
                    countC++;
                }
                i++;
            }

            notDeletedWindowSize = Math.max(notDeletedWindowSize, j - i + 1);
            j++;
        }

        return n - notDeletedWindowSize;
    }

}
