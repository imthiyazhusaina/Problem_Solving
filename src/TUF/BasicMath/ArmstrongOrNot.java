package TUF.BasicMath;

//Problem Statement:Given an integer N,
//return true it is an Armstrong number otherwise return false.
//
//An Armstrong number is a number that is equal to the sum of its own digits each raised to
//the power of the number of digits.

public class ArmstrongOrNot {
    static void main() {
        int n = 153;
        System.out.println(isArmstrong(n));
    }

    private static boolean isArmstrong(int n) {
        int len = (int)Math.log10(n)+1;
        int temp = n;
        int res = 0;
        while(temp>0){
            res=res+(int)(Math.pow(temp%10,len));
            temp/=10;
        }
        return n==res;
    }
}
