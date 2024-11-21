package org.example;

public class MakeStringFancy {
    public String makeFancyString(String s) {
        StringBuilder ans=new StringBuilder();
        ans.append(s.charAt(0));
        int cnt=1;
        char last=s.charAt(0);
        for(int i=1;i<s.length();i++){
            if(last==s.charAt(i)){
                if(cnt<2){
                    ans.append(s.charAt(i));
                    cnt++;
                }
            }
            else{
                ans.append(s.charAt(i));
                last=s.charAt(i);
                cnt=1;
            }
        }
        return ans.toString();
    }
}
