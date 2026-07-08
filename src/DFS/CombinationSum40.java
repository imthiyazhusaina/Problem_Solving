package DFS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CombinationSum40 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] candidates = {1, 3, 6, 7};
        int target = 7;
        Solution40 c = new Solution40();
        System.out.println(c.combinationSum(candidates, target));
    }
}
class Solution40{
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> list = new ArrayList<>();
        dfs(candidates,target,0,list,new ArrayList<>());
        return list;
    }
    public void dfs(int[] arr,int t,int index,List<List<Integer>> list,List<Integer> curr ){
        if(t==0){
            list.add(new ArrayList<>(curr));
            return;
        }

        if(t<0){
            return;
        }

        for(int i=index;i<arr.length;i++){
            if(i>index && arr[i]==arr[i-1]) continue;
            if(arr[i]>t){
                return;
            }
            curr.add(arr[i]);
            dfs(arr,t-arr[i],i+1,list,curr);
            curr.removeLast();
        }
    }
}
