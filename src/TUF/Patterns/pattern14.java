package TUF.Patterns;

// Given an integer n. You need to recreate the pattern
// given below for any value of N. Let's say for N = 5,
// the pattern should look like as below:

//    A
//    AB
//    ABC
//    ABCD
//    ABCDE

public class pattern14 {
    static void main() {
        int n = 5;
        char x = 'A';
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print((char)(x+j));
            }
            System.out.println();
        }
    }
}
