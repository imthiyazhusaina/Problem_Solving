package Math;

import java.util.Scanner;

public class ClimbingStairs {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n==0){
            System.out.println(0);
        }
        if(n==1){
            System.out.println(1);
        }
        int a = 0;
        int b = 1;
        int c = a+b;
        for(int i=1;i<=n;i++){
            c=a+b;
            a=b;
            b=c;
        }
        System.out.println(c);
    }
}
