package TUF.Patterns;

// Given an integer n. You need to recreate the pattern
// given below for any value of N. Let's say for N = 5,
// the pattern should look like as below:

//     A
//    ABA
//   ABCBA
//  ABCDCBA
// ABCDEDCBA

public class pattern17 {
    static void main() {
        int n = 5;

        for(int i=0;i<n;i++){
            char c = 'A';
            for(int j=0;j<n-i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print(c++);
            }
            c--;
            c--;
            for(int j=0;j<i;j++){
                System.out.print(c--);
            }
            System.out.println();
        }
    }
}
