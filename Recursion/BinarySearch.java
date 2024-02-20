package Recursion;

public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = {1,4,7,9,12};
        int target = 4;
        System.out.println(binarySearchRecursion(arr, 0, arr.length-1, target));
    }

    private static int binarySearchRecursion(int[] arr, int left, int right, int target){
        if(left>right){
            return -1;
        }
        int mid = (left + right)/2;
        if(arr[mid]==target){
            return mid;
        }
        else if(target>arr[mid]){
            return binarySearchRecursion(arr, mid+1, right, target);
        }
        return binarySearchRecursion(arr, left, mid-1, target);
    }
    
}
