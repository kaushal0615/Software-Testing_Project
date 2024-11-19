package org.example;

import java.util.HashMap;
import java.util.Map;

public class MaximumSubarraySumWithDistinctK {
    public long maximumSubarraySum(int[] nums, int k) {
        long sum=0,ans=0;
        Map<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
            if(i-k>=0){
                mp.put(nums[i-k],mp.get(nums[i-k])-1);
                if(mp.get(nums[i-k])==0){
                    mp.remove(nums[i-k]);
                }
                sum-=nums[i-k];
            }
            if(mp.size()==k){
                if(ans<=sum) ans=sum;
            }
        }
        return ans;
    }
}
