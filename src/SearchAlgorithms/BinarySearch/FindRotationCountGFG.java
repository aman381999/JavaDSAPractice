package BinarySearch;

public class FindRotationCountGFG {
    public static void main(String[] args) {
        int[] arr = {15,18,2,3,6,12};
        int pivot = rotationCount(arr);

        int count = pivot+1;

        System.out.println(count);
    }

    static int rotationCount(int[] arr) {

        int start = 0;
        int end = arr.length-1;

        while(start<=end){
            int mid = start + (end-start)/2;

            if(end > mid && arr[mid] > arr[mid+1]) {
                return mid;
            }

            if(start < mid && arr[mid] < arr[mid-1]) {
                return mid-1;
            }

            if(arr[start] > arr[mid]) {
                end = mid-1;
            } else{
                start = mid+1;
            }
        }
        return -1;
    }


}
