// You are given a 0-indexed array of integers nums of length n. You are initially positioned at nums[0].
// Each element nums[i] represents the maximum length of a forward jump from index i. In other words, if you are at nums[i], you can jump to any nums[i + j] where:

// Constraints: 0<=j<= nums[i] and i + j < n

// Return the minimum number of jumps to reach nums[n - 1]. The test cases are generated such that you can reach nums[n - 1].

package Greedy;

public class JumpGame_II {


    public static void main(String[] args) {
        int[] nums = {2,3,1,1,4};
        System.out.println(jump(nums));
    }

    // below is TC: O(N^2) solution
    private static int jump(int[] nums){
        int idx = nums.length-1;
        int jumpCount = 0;

        while(idx>0){
            int i = -1;

            for(int j=idx-1; j>=0; j--){
                if(j+nums[j]>=idx){
                    i = j;
                }
            }
            idx = i;
            jumpCount++;

        }
        return jumpCount;
    }
    
}
