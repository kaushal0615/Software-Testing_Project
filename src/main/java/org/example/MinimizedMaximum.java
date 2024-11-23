package org.example;

public class MinimizedMaximum {

    private final DistributionHelper distributionHelper;

    public MinimizedMaximum(DistributionHelper distributionHelper) {
        this.distributionHelper = distributionHelper;
    }

    public int minimizedMaximum(int storeCount, int[] productQuantities) {
        int maxQuantity = 0;
        for (int quantity : productQuantities) {
            maxQuantity = Math.max(maxQuantity, quantity);
        }

        int left = 1;
        int right = maxQuantity;
        int result = 0;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (distributionHelper.canDistributeProducts(mid, storeCount, productQuantities)) {
                result = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return result;
    }
}
