package DynamicPrograming;

import java.util.Arrays;

public class MinCoins322 {
    static void main(String[] args) {
        Solution322 s = new Solution322();
        System.out.println(s.coinChange(new int[]{1,2,5},11));
    }
}
class Solution322 {
    public int coinChange(int[] coins, int amount) {
        int n = coins.length;
        int[][] dp = new int[n+1][amount+1];
        Arrays.fill(dp[0],-1);
        for(int i=1;i<n+1;i++){
            for(int j=1;j<amount+1;j++){
                int d = j-coins[i-1];
                if(j>=coins[i-1]){
                    if(dp[i-1][j]==-1 && dp[i][d]==-1){
                        dp[i][j] = dp[i-1][j];
                    }else if(dp[i-1][j] == -1 && dp[i][d]!=-1){
                        dp[i][j] = dp[i][d]+1;
                    }else if(dp[i-1][j] != -1 && dp[i][d]==-1){
                        dp[i][j] = dp[i-1][j];
                    }else{
                        dp[i][j] = Math.min(dp[i-1][j],dp[i][d]+1);
                    }
                }else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        return dp[n][amount];
    }
}
