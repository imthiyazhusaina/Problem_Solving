package SlidingWindow;

import java.util.Arrays;

public class DefusetheBomb1652 {
    static void main(String[] args) {
        int[] arr = {1,2,3,4,5,5};
        int k = -2;
        System.out.println(Arrays.toString(decrypt(arr,k)));

    }
//    public static int[] decrypt(int[] code, int k) {
//        int[] res = new int[code.length];
//        if(k==0) return res;
//        else if(k>0){
//            for(int i=0;i<code.length;i++){
//                int t = 0;
//                for(int j=1;j<=k;j++){
//                    int x = (i+j)%code.length;
//                    t+=code[x];
//                }
//                res[i] = t;
//            }
//        }else{
//            for(int i=0;i<code.length;i++){
//                int t = 0;
//                for(int j=1;j<=Math.abs(k);j++){
//                    int x = ((i-j)+code.length) % code.length;
//                    t+=code[x];
//                }
//                res[i] = t;
//            }
//        }
//        return res;
//    }
    public static int[] decrypt(int[] code, int k) {

        int n = code.length;
        int[] ans = new int[n];

        if (k == 0) {
            return ans;
        }

        if (k > 0) {

            int sum = 0;

            // Initial window: next k elements of index 0
            for (int i = 1; i <= k; i++) {
                sum += code[i % n];
            }

            for (int i = 0; i < n; i++) {
                ans[i] = sum;

                // Remove the first element of the current window
                sum -= code[(i + 1) % n];

                // Add the next element entering the window
                sum += code[(i + k + 1) % n];
            }

        } else {

            k = -k;

            int sum = 0;

            // Initial window: previous k elements of index 0
            for (int i = n - k; i < n; i++) {
                sum += code[i];
            }

            for (int i = 0; i < n; i++) {
                ans[i] = sum;

                // Remove the element leaving the window
                sum -= code[(i - k + n) % n];

                // Add the current element as the window shifts
                sum += code[i];
            }
        }

        return ans;
    }
}
