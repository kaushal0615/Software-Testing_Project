package org.example;

public class FindLengthOfShortestSubarray {
    public int findLengthOfShortestSubarray(int[] arr) {
        int n = arr.length;
        int left = 0;

        // Find the longest non-decreasing prefix
        while (left < n - 1 && arr[left] <= arr[left + 1]) {
            left++;
        }

        // If the entire array is non-decreasing, no subarray needs to be removed
        if (left == n - 1) return 0;

        int right = n - 1;

        // Find the longest non-decreasing suffix
        while (right > 0 && arr[right - 1] <= arr[right]) {
            right--;
        }

        // Calculate the initial result based on prefix and suffix
        int res = Math.min(n - left - 1, right);

        // Try to merge prefix and suffix
        int i = 0, j = right;
        while (i <= left && j < n) {
            if (arr[i] <= arr[j]) {
                res = Math.min(res, j - i - 1);
                i++;
            } else {
                j++;
            }
        }

        return res;
    }
}
