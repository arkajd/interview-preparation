// You are given an integer array nums. You are initially positioned at the array's first index, 
// and each element in the array represents your maximum jump length at that position.

// Return true if you can reach the last index, or false otherwise.

package Greedy;

public class JumpGame_I {

    public static void main(String[] args) {
        int[] arr = {3,2,1,0,4};
        System.out.println(isReachable(arr));
    }

    private static boolean isReachable(int[] arr){
        int maxJumpPossible = 0;

        // check if max jump possible at any index (other than last index) is not 0
        // if 0, we cannot proceed further and return false
        for(int i=0; i<arr.length; i++){
            maxJumpPossible = Math.max(maxJumpPossible, arr[i]);
            if(maxJumpPossible==0 && i!=arr.length-1){
                return false;
            }
            maxJumpPossible--;
        }
        return true;
    }
    
}
