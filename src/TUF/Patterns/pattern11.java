package TUF.Patterns;

// Given an integer n. You need to recreate the pattern
// given below for any value of N. Let's say for N = 5,
// the pattern should look like as below:

//    1
//    0 1
//    1 0 1
//    0 1 0 1
//    1 0 1 0 1

public class pattern11 {
    static void main() {
        int n = 5;
        int x = 1;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(x);
                if(x==0) x=1;
                else x=0;
            }
            System.out.println();
        }
    }
}
