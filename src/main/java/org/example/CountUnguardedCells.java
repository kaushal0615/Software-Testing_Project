package org.example;

public class CountUnguardedCells {
    public int countUnguarded(int m, int n, int[][] guards, int[][] walls) {
        int[][] dp=new int[m][n];
        for(int i=0;i<walls.length;i++){
            dp[walls[i][0]][walls[i][1]]=1;
        }
        for(int it=0;it<guards.length;it++){
            int x=guards[it][0];
            int y=guards[it][1];
            dp[x][y]=2;
        }
        for(int it=0;it<guards.length;it++){
            int x=guards[it][0];
            int y=guards[it][1];
            int i=x-1;
            while(i>=0){
                if(dp[i][y]==1||dp[i][y]==2) break;
                dp[i][y]=3;
                i--;
            }
            i=x+1;
            while(i<m){
                if(dp[i][y]==1||dp[i][y]==2) break;
                dp[i][y]=3;
                i++;
            }
            int j=y-1;
            while(j>=0){
                if(dp[x][j]==1||dp[x][j]==2) break;
                dp[x][j]=3;
                j--;
            }
            j=y+1;
            while(j<n){
                if(dp[x][j]==1||dp[x][j]==2) break;
                dp[x][j]=3;
                j++;
            }
        }
        int cnt=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++) {
                if (dp[i][j] == 0) cnt++;
            }
        }
        return cnt;
    }
}
