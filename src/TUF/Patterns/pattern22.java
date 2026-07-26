package TUF.Patterns;

// Given an integer n. You need to recreate the pattern
// given below for any value of N. Let's say for N = 5,
// the pattern should look like as below:
//
//    5 5 5 5 5 5 5 5 5
//    5 4 4 4 4 4 4 4 5
//    5 4 3 3 3 3 3 4 5
//    5 4 3 2 2 2 3 4 5
//    5 4 3 2 1 2 3 4 5
//    5 4 3 2 2 2 3 4 5
//    5 4 3 3 3 3 3 4 5
//    5 4 4 4 4 4 4 4 5
//    5 5 5 5 5 5 5 5 5

public class pattern22 {
    static void main() {
        int n = 5;
        int k = 2*n-1;
        for(int i=0;i<k;i++){
            for(int j=0;j<k;j++){
                int d = Math.min(
                        Math.min(i,j),
                        Math.min(k-1-i,k-1-j)
                );
                System.out.print(n-d);
            }
            System.out.println();
        }
    }
}
