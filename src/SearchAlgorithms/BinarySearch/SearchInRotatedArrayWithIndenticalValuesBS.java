package BinarySearch;

public class SearchInRotatedArrayWithIndenticalValuesBS {

    public static void main(String[] args) {


        int[] arr = {4, 5, 6, 7, 8, 4, 4, 4};
        int target = 7;

        int pivot = findPivot(target, arr);

        System.out.println(pivot);

    }

    static int findPivot(int target, int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if(mid < end && arr[mid] <= arr[mid+1]){
                return mid;
            }

            if(start < mid && arr[mid] > arr[mid-1]){
                return mid-1;
            }

            if(arr[start] == arr[mid] && arr[mid] == arr[end]) {
                if(arr[start] > arr[start+1]){
                    return start;
                }
                start++;

                if(arr[end] < arr[end-1]){
                    return end-1;
                }
                end--;
            } else if (arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[end] < arr[mid])) {
                start = mid+1;
            } else {
                end = mid-1;
            }

        }
        return -1;
    }

}
