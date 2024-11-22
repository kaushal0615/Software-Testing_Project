package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CanSortArray {
    public boolean canSortArray(int[] nums) {
        boolean alreadyInc = true;
        int[] arr = new int[101];
        int n = nums.length;

        int prev = 0;
        // Counting set bits for a number and keeping into array
        for (int i = 0; i < n; i++) {
            alreadyInc = prev < nums[i] ? alreadyInc : false;
            int count = Integer.bitCount(nums[i]);
            arr[i] = count;
            prev = nums[i];
        }

        // Return true if nums array is already sorted
        if (alreadyInc == true) return true;

        List<Integer> list = new ArrayList();
        int prevMax = 0;
        int bitCount = arr[0];

        for (int i = 0; i < n; i++) {
            if (bitCount == arr[i]) {
                //Adding value of same bit into new segment
                list.add(nums[i]);
            } else {
                int currMin = Collections.min(list);
                int currMax = Collections.max(list);
                // Checking for continuous segment
                if (prevMax > currMin) {
                    return false;
                }
                prevMax = currMax;
                list = new ArrayList();
                list.add(nums[i]);
            }
            bitCount = arr[i];
        }

        // Checking for remaining segment
        int currMin = Collections.min(list);
        if (prevMax > currMin) {
            return false;
        }


        return true;
    }
}
