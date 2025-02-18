package BinarySearch.PracticeQuestions;

import java.util.Arrays;

public class TwoSumsBS167 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,4,9,56,90};
        System.out.println(Arrays.toString(search(arr, 8)));
    }

    static int[] search(int[] numbers, int target){
        int start = 0;
        int end = numbers.length-1;

        while(start <= end){
            if(numbers[start]+numbers[end] == target){
                return new int[]{start+1, end+1};
            }

            int mid = start + (end-start)/2;

            if(numbers[start]+numbers[mid] == target){
                return new int[]{start+1, mid+1};
            }

            if(numbers[end]+numbers[mid] == target){
                return new int[]{mid+1, end+1};
            }

            if(numbers[start]+numbers[end] > target){
                end--;
            } else {
                start++;
            }

        }
        return new int[]{-1,-1};
    }
}
