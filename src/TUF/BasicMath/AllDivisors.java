package TUF.BasicMath;

//Problem Statement: Given an integer N, return all divisors of N.
//A divisor of an integer N is a positive integer that divides N without leaving a remainder.
//In other words, if N is divisible by another integer without any remainder,
//then that integer is considered a divisor of N.

import java.util.ArrayList;
import java.util.List;

public class AllDivisors {
    static List<Integer> list = new ArrayList<>();
    static List<Integer> list2 = new ArrayList<>();
    static void main(String[] args) {
        int n = 36;
        getDivisorsBrute(n);
        getDivisorsOptimal(n);
    }

    private static void getDivisorsOptimal(int n) {
        for(int i=1;i<=Math.sqrt(n);i++){
            if(n%i == 0){
                list2.add(i);
                if(i!=(n/i)){
                    list2.add(n/i);
                }
            }
        }
        System.out.println(list2);
    }

    private static void getDivisorsBrute(int n) {
        for(int i=1;i<=n;i++){
            if(n%i == 0){
                list.add(i);
            }
        }
        System.out.println(list);
    }
}
