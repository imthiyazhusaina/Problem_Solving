package TUF.Patterns;

// Given an integer n. You need to recreate the pattern
// given below for any value of N. Let's say for N = 5,
// the pattern should look like as below:
//    *
//    **
//    ***
//    ****
//    *****
//    ****
//    ***
//    **
//    *

public class pattern10 {
    static void main() {
        int n = 5;
        for(int i=0;i<n;i++){

            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
