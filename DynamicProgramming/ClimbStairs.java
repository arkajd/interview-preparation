// You are climbing a staircase. It takes n steps to reach the top.
// Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

package DynamicProgramming;

import java.util.HashMap;

public class ClimbStairs {

    public static void main(String[] args) {
        HashMap<Integer, Integer> ways = new HashMap<>();
        System.out.println(waysToClimbStairs(43, ways));
    }

    // using hashmap as there are overlapping sub-problems
    // using recursion as there is optimal substructure
    private static int waysToClimbStairs(int n, HashMap<Integer, Integer> ways){
        if(n<4){
            return n;
        }
        if(ways.containsKey(n)){
            return ways.get(n);
        }
        ways.put(n, waysToClimbStairs(n-1, ways) + waysToClimbStairs(n-2, ways));
        return ways.get(n);
    }
    
}
