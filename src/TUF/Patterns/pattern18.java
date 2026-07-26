package TUF.Patterns;

// Given an integer n. You need to recreate the pattern
// given below for any value of N. Let's say for N = 5,
// the pattern should look like as below:

//E
//D E
//C D E
//B C D E
//A B C D E

public class pattern18 {
    static void main() {
        int n = 5;
        int c = 64;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print((char)(c+n+j-i));
            }
            System.out.println();
        }
    }
}
