package SlidingWindow;

import java.util.Scanner;

public class ValidSubarraysWithMatchingSumDigits3969 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        int i = 0;
        int j = 0;
        long sum=0;
        int count = 0;
        while(j<n){
            sum += nums[j];
            if(sum%10==x){
                long t = sum;
                while(t>=10){
                    t=t/10;
                }
                if(t==x){
                    count++;
                }
            }
            if(j==n-1){
                j=i;
                i++;
                sum=0;
            }
            if(i==j && j==n-1){
                break;
            }
            j++;
        }
        System.out.println(count);
    }
}
