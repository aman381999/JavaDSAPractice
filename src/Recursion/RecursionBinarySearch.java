package Recursion;

public class RecursionBinarySearch {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8,9};

        int target = 8;

        System.out.println(binarySearchRecursion(arr, target, 0, arr.length-1));
    }

    static int binarySearchRecursion(int[] arr, int target, int start, int end){
        if(start > end) {
            return -1;
        }
            int mid = start + (end-start)/2;

            if(arr[mid] == target) {
                return mid;
            }

            if(arr[mid] > target){
                return binarySearchRecursion(arr, target, start, mid-1);
            }
                return binarySearchRecursion(arr, target, mid+1, end);//        return end;
    }
}
