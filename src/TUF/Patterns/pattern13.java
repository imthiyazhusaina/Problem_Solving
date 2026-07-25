package TUF.Patterns;

// Given an integer n. You need to recreate the pattern
// given below for any value of N. Let's say for N = 5,
// the pattern should look like as below:

//    1
//    2 3
//    4 5 6
//    7 8 9 10
//    11 12 13 14 15

public class pattern13 {
    static void main() {
        int n = 5;
        int x = 1;

        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(x++ +" ");
            }
            System.out.println();
        }
    }
}
