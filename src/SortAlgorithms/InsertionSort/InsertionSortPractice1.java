package SortAlgorithms.InsertionSort;

import java.util.Arrays;

public class InsertionSortPractice1 {
    public static void main(String[] args) {
        int[] arr = {5,3,4,1,2};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void insertionSort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i+1; j > 0; j--) {  //j should be greater than 0 //j should minus just in case to check every index in left
                if(arr[j] < arr[j-1]){  //arr[j] is lesser than arr[j-1]
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                } else {
                    break;
                }
            }
        }
    }


}
