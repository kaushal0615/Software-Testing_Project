package org.example;

public class DistributionHelper {

    public boolean canDistributeProducts(int maxProductsPerStore, int storeCount, int[] quantities) {
        int requiredStores = 0;

        for (int quantity : quantities) {
            // Calculate stores needed for current product type
            requiredStores += (quantity + maxProductsPerStore - 1) / maxProductsPerStore;
        }

        return requiredStores <= storeCount;
    }
}
