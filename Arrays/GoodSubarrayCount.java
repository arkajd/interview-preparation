// Given an array of integers A, a subarray of an array is said to be good if it fulfills any one of the criteria:
// 1. Length of the subarray is be even, and the sum of all the elements of the subarray must be less than B.
// 2. Length of the subarray is be odd, and the sum of all the elements of the subarray must be greater than B.
// Find the count of good subarrays in A.

package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class GoodSubarrayCount {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(13, 16, 16, 15, 9, 16, 2, 7, 6, 17, 3, 9));
        int B = 65;
        System.out.println(solve(list, B));
    }
    

    private static int solve(ArrayList<Integer> A, int B) {
        int length = A.size();
        int goodCount = 0;

        // consider all possible sub arrays
        for(int i=0; i<length; i++){
            int sum = 0;
            for(int j=i; j<length; j++){
                sum = sum + A.get(j);
                int subArrayLength = j - i + 1;
                
                if(subArrayLength%2==0){
                    if(sum<B){
                        goodCount++;
                    }
                }
                else{
                    if(sum>B){
                        goodCount++;
                    }
                }
            }
        }
        return goodCount;
    }
}
