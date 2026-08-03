package TUF.BasicMath;

//    Example 1:
//    Input:N = 12345
//    Output:5
//    Explanation:  The number 12345 has 5 digits.
//
//    Example 2:
//    Input:N = 7789
//    Output: 4
//    Explanation: The number 7789 has 4 digits.

public class CountDigitsInANumber {
    static void main() {
        int n = 12345678;
        int count = 0;
        while(n>0){
            count++;
            n/=10;
        }
        System.out.println(count);
    }
}
