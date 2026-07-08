package DFS;
import java.util.*;
public class CombinationSum39 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] candidates = {1,3,6,7};
        int target = 7;
        Solution39 c = new Solution39();
        System.out.println(c.combinationSum(candidates,target));
    }
}
class Solution39 {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        backtrack(candidates, target, 0, new ArrayList<>(), ans);
        return ans;
    }

    private void backtrack(int[] candidates, int target, int index,
                           List<Integer> current, List<List<Integer>> ans) {
        System.out.println(current);
        // Found a valid combination
        if (target == 0) {
            ans.add(new ArrayList<>(current));
            return;
        }

        // Invalid combination
        if (target < 0) {
            return;
        }

        for (int i = index; i < candidates.length; i++) {

            current.add(candidates[i]);

            // Pass i (not i + 1) because we can reuse the same number
            backtrack(candidates, target - candidates[i], i, current, ans);

            // Backtrack
            current.removeLast();
        }
    }
}