package org.example;

import java.util.Arrays;

public class CountFairPairs {

    private final RangeHelper rangeHelper;

    public CountFairPairs(RangeHelper rangeHelper) {
        this.rangeHelper = rangeHelper;
    }

    public long countFairPairs(int[] v, int lower, int upper) {
        Arrays.sort(v);
        long ans = 0;
        for (int i = 0; i < v.length - 1; i++) {
            int low = rangeHelper.lowerBound(v, i + 1, v.length, lower - v[i]);
            int up = rangeHelper.upperBound(v, i + 1, v.length, upper - v[i]);
            ans += up - low;
        }
        return ans;
    }
}
