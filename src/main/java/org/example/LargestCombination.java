package org.example;

public class LargestCombination {
    public int largestCombination(int[] candidates) {
        int[] bit=new int[32];
        int a=0,j=0,n=0;
        for(int num:candidates){
            a=1;
            j=0;
            while(a<=num){
                if((a&num) !=0) bit[j]++;
                a<<=1;
                j++;
            }
        }
        int ans=0;
        for(int i=0;i<32;i++){
            ans=Math.max(ans,bit[i]);
        }
        return ans;
    }
}