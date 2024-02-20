package Recursion;

public class LinearSearch {

    public static void main(String[] args) {
        int[] arr = {1,4,3,2,5};
        int target = 4;
        int currentIndex = arr.length-1;
        System.out.println(linearSearchRecursion(arr, currentIndex, target));
    }

    private static int linearSearchRecursion(int[] arr, int currentIndex, int target){
        if(currentIndex<0){
            return -1;
        }
        if(arr[currentIndex]==target){
            return currentIndex;
        }
        return linearSearchRecursion(arr, currentIndex-1, target);
    }
    
}
