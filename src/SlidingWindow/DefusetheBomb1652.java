package SlidingWindow;

import java.util.Arrays;

public class DefusetheBomb1652 {
    static void main(String[] args) {
        int[] arr = {1,2,3,4,5,5};
        int k = -2;
        System.out.println(Arrays.toString(decrypt(arr,k)));

    }
    public static int[] decrypt(int[] code, int k) {
        int[] res = new int[code.length];
        if(k==0) return res;
        else if(k>0){
            for(int i=0;i<code.length;i++){
                int t = 0;
                for(int j=1;j<=k;j++){
                    int x = (i+j)%code.length;
                    t+=code[x];
                }
                res[i] = t;
            }
        }else{
            for(int i=0;i<code.length;i++){
                int t = 0;
                for(int j=1;j<=Math.abs(k);j++){
                    int x = ((i-j)+code.length) % code.length;
                    t+=code[x];
                }
                res[i] = t;
            }
        }
        return res;
    }
}
