// Given an array A of N non-negative numbers and a non-negative number B,
// you need to find the number of subarrays in A with a sum less than B.
// We may assume that there is no overflow.

package Arrays;

import java.util.ArrayList;

public class SubarraysCountSumLessThanK {

    public static void main(String[] args) {
        int K = 10;
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(11);
        list.add(2);
        list.add(3);
        list.add(15);
        System.out.println(subarraysCount(list, K));
    }

    public static int subarraysCount(ArrayList<Integer> A, int K) {
        int length = A.size();
        int count = 0;

        // consider all subarrays using nested loop
        // if sum of subarray less than K, increase count
        for(int i=0; i<length; i++){
            int sum = 0;
            for(int j=i; j<length; j++){
                sum = sum + A.get(j);
                if(sum<K){
                    count++;
                }
                else{
                    break;
                }
            }
        }
        return count;
    }

}