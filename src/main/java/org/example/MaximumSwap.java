package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MaximumSwap {
    public int maximumSwap(int num) {
        List<Integer> play=new ArrayList<>();
        List<Integer> nums=new ArrayList<>();
        while(num>0){
            play.add(num%10);
            nums.add(num%10);
            num/=10;
        }
        Collections.sort(nums);
        Collections.reverse(nums);
        Collections.reverse(play);
        int i=0;
        while(i<nums.size()){
            if(play.get(i)<nums.get(i)){
                int a=play.get(i);
                play.set(i,nums.get(i));
                int j=play.size()-1;
                while(j>i){
                    if(play.get(j)==play.get(i)){
                        play.set(j,a);
                        break;
                    }
                    j--;
                }
                break;
            }
            i++;
        }
        num=0;
        for(int p:play){
            num=num*10+p;
        }
        return num;
    }
}