package TUF.Patterns;

// Given an integer n. You need to recreate the pattern
// given below for any value of N. Let's say for N = 5,
// the pattern should look like as below:
//    1
//    22
//    333
//    4444
//    55555

public class pattern4 {
    static void main(String[] args) {
        int n = 5;
        for (int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(i+1);
            }
            System.out.println();
        }
    }
}