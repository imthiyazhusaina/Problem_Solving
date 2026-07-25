package TUF.Patterns;

// Given an integer n. You need to recreate the pattern
// given below for any value of N. Let's say for N = 5,
// the pattern should look like as below:

//    ABCDE
//    ABCD
//    ABC
//    AB
//    A

public class pattern15 {
    static void main() {
        int n = 5;
        char x = 'A';

        for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print((char)(x+j));
            }
            System.out.println();
        }
    }
}
