package TUF.BasicMath;

//    Input: N = 12345
//    Output:54321
//    Explanation: The reverse of 12345 is 54321.
//
//    Input: N = 7789
//    Output: 9877
//    Explanation: The reverse of number 7789 is 9877.

public class ReverseDigits {
    static void main() {
        int n = 123445;
        int rev = 0;
        while(n>0){
            rev = rev*10 + n%10;
            n/=10;
        }
        System.out.println(rev);
    }
}
