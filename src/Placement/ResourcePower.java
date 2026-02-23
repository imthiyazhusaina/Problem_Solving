package Placement;

import java.util.Scanner;

public class ResourcePower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int count = Math.min(a, Math.min(b, c));
        a-=count;
        b-=count;
        c-=count;

        count += a/3;
        count += b/3;
        count += c/3;

        System.out.println(count);
    }
}
