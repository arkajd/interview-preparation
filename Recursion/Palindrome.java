// Write a recursive function that checks whether string A is a palindrome or Not.
// Return 1 if the string A is a palindrome, else return 0.

package Recursion;

public class Palindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome("qweewq"));
    }

    private static int isPalindrome(String input){
        boolean isPalindrome = isPalindromeHelper(input, 0, input.length()-1);
        if(isPalindrome){
            return 1;
        }
        return 0;
    }

    private static boolean isPalindromeHelper(String input, int left, int right){
        if(left>=right){
            return true;
        }
        return input.charAt(left)==input.charAt(right) && isPalindromeHelper(input, left+1, right-1);
    }
   
}
