package DynamicPrograming;

public class PartitionEqualSubsetSum416 {
    static void main() {
        Solution416 s = new Solution416();
        System.out.println(s.canPartition(new int[]{1,5,11,5}));
    }
}
class Solution416 {
    public boolean canPartition(int[] nums) {
        int n = nums.length;
        int sum = 0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        if(sum%2==1) return false;
        sum=sum/2;

         boolean[][] dp = new boolean[n+1][sum+1];
         for(int i=0;i<n+1;i++){
             dp[i][0] = true;
         }
         for(int i=1;i<n+1;i++){
             for(int j=1;j<sum+1;j++){
                 dp[i][j] = dp[i-1][j];
                 if(j>=nums[i-1]){
                     dp[i][j] = dp[i-1][j] || dp[i-1][j-nums[i-1]];
                 }
             }
         }
         return dp[n][sum];
    }
}