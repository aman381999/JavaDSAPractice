package BinarySearch;

import java.util.Arrays;

public class SplitArrayLargestSumBS410 {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int k = 2;

//        System.out.println(maxValue);

        int sumOfMinimumElemSubArray = splitArray(arr, k);

        System.out.println(sumOfMinimumElemSubArray);
    }

    static int splitArray(int[] arr, int k) {

        int start = 0;
        int end = 0;

        for (int i = 0; i < arr.length; i++) {
            start = Math.max(start, arr[i]);
            end += arr[i];
        }

        while(start <= end){
            int mid = start + (end-start)/2;

            if(start == end) {
                return mid;
            }

            int totalOfElem = 0;
            int numberOfSplit = 1;

            for (int i = 0; i < arr.length; i++) {

                if(totalOfElem + arr[i] > mid) {
                    totalOfElem = arr[i];
                    numberOfSplit++;
                } else {
                    totalOfElem += arr[i];
                }

            }

            if(numberOfSplit > k){
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return -1;
    }
}
