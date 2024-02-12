// Given an array of integers A, every element appears twice except for one. Find that integer that occurs once.

package BitManipulation;

public class SingleNumber {

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 1};
        System.out.println(uniqueNumber(arr));
    }

    private static int uniqueNumber(int[] arr){
            int uniqueNumber = 0;

            // perform XOR on the entire array as a^a=0 and a^0=a
            for(int i=0; i<arr.length; i++){
                uniqueNumber = uniqueNumber ^ arr[i];
            }
            return uniqueNumber;
    }
    
}
