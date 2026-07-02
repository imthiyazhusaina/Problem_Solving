package SlidingWindow;
import java.util.*;
public class ContainsDuplicateII219 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        // Map<Integer,Integer> map = new HashMap<>();
        // if(k==0){
        //     return false;
        // }

        // for(int i=0;i<nums.length && i<k;i++){
        //     map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        //     if(map.get(nums[i])==2){
        //         return true;
        //     }
        //     if(i==nums.length-1){
        //         return false;
        //     }
        // }
        // int i = 0;
        // for(int j = k;j<nums.length;j++){
        //     map.put(nums[j],map.getOrDefault(nums[j],0)+1);
        //     int t = map.get(nums[i]);
        //     if(map.get(nums[j])==2){
        //         return true;
        //     }
        //     if(t==1) map.remove(nums[i]);
        //     else map.put(nums[i],t-1);
        //     i++;
        // }
        // return false;

        Map<Integer, Integer> seen = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int val = nums[i];
            if (seen.containsKey(val) && i - seen.get(val) <= k) {
                System.out.println("TRUE");
                return;
            }
            seen.put(val, i);
        }
        System.out.println("FALSE");
    }

}
