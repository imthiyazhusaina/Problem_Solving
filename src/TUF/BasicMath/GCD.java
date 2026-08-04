package TUF.BasicMath;
import java.util.*;

//    Example 1:
//    Input: N1 = 9, N2 = 12
//
//    Output: 3
//    Explanation:
//    Factors of 9: 1, 3, 9
//    Factors of 12: 1, 2, 3, 4, 6, 12
//    Common Factors: 1, 3
//    Greatest common factor: 3 (GCD)
//
//    Example 2:
//    Input: N1 = 20, N2 = 15
//
//    Output: 5
//    Explanation:
//    Factors of 20: 1, 2, 4, 5, 10, 20
//    Factors of 15: 1, 3, 5, 15
//    Common Factors: 1, 5
//    Greatest common factor: 5 (GCD)

public class GCD {
    public static int findGcd(int a, int b) {
        while(a > 0 && b > 0) {
            if(a > b) {
                a = a % b;
            }
            else {
                b = b % a;
            }
        }
        if(a == 0) {
            return b;
        }
        return a;
    }

    public static void main(String[] args) {
        int n1 = 20, n2 = 15;

        // Find the GCD of n1 and n2
        int gcd = findGcd(n1, n2);

        System.out.println("GCD of " + n1 + " and " + n2 + " is: " + gcd);
    }
}