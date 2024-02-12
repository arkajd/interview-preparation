// Given a number A, we need to find the sum of its digits using recursion.
// 1 <= n <= 109

package Recursion;

public class SumOfDigits {

    public static void main(String[] args) {
        System.out.println(digitSum(12345));
    }

    private static int digitSum(int n){
        if(n<10){
            return n;
        }
        int remainder = n % 10;
        return remainder + digitSum(n/10);
    }
}
