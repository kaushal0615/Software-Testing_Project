package org.example;

import java.util.LinkedList;
import java.util.Queue;

public class MinimumSteps {
    public long minimumSteps(String s) {
        Queue<Integer> q=new LinkedList<>();
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)=='1'){
                q.add(i);
            }
        }
        int i=s.length()-1;
        long ans=0;
        while(!q.isEmpty()){
            int a=q.poll();
            ans+=i-a;
            i--;
        }
        return ans;
    }
}