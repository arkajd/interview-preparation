package Recursion;

public class IsArraySorted {

    public static void main(String[] args) {
        int[] arr = {1,2,3,5,4};
        System.out.println(isSortedRecursion(arr, arr.length-1, Integer.MAX_VALUE));
    }

    private static boolean isSortedRecursion(int[] arr, int currentIndex, int max){
        if(arr.length==0){
            return true;
        }
        if(currentIndex<0){
            return true;
        }
        if(arr[currentIndex]>max){
            return false;
        }
        return isSortedRecursion(arr, currentIndex-1, arr[currentIndex]);
    }
    
}
