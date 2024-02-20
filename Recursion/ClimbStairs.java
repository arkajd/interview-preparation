// You are climbing a staircase. It takes n steps to reach the top.
// Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top? (without DP)

package Recursion;

public class ClimbStairs {

    public static void main(String[] args) {

        System.out.println(countWaysToClimbStairs(8));
    }

    // TC: O(2^N)
    // SC: O(N)
    private static int countWaysToClimbStairs(int n){
        if(n<=2){
            return n;
        }
        return countWaysToClimbStairs(n-1) + countWaysToClimbStairs(n-2);
    }
    
}
