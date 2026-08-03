package TUF.BasicMath;

//    Example 1:
//    Input:N = 4554
//    Output:Palindrome Number
//    Explanation: The reverse of 4554 is 4554 and therefore it is palindrome number
//
//    Example 2:
//    Input:N = 7789
//    Output: Not Palindrome
//    Explanation: The reverse of number 7789 is 9877 and therefore it is not palindrome

public class PalindromeNumber {
    static void main() {
        int n = 1234554321;
        int rev = 0;
        int t = n;
        while(t>0){
            rev = rev*10+t%10;
            t/=10;
        }
        System.out.println(n == rev);
    }
}
