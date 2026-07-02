package SlidingWindow;

import java.util.Scanner;

public class MaximumAverageSubarray643 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int i = 0;
        int j = 0;
        int max = Integer.MIN_VALUE;
        int count = 0;
        for(j=0;j<k;j++){
            count+=nums[j];
        }
        max = count;
        while(j<nums.length){
            count += nums[j];
            count -= nums[i];
            j++;
            i++;
            if(max<count) max = count;
        }
        System.out.println((double)max/k);
    }

}
