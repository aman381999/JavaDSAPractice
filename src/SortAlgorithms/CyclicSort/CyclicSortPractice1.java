package SortAlgorithms.CyclicSort;

import java.util.Arrays;

public class CyclicSortPractice1 {
    public static void main(String[] args) {
        int[] arr = {4,5,1,3,2}; //in cyclic sort the number should be continuous like 1,2,3,4.... also it should start from (1 till N or N-1)
//        cyclicSort(arr);
        cyclicSortWhile(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void cyclicSort(int[] arr){
        for (int i = 0; i < arr.length;) {
            if(arr[i] == i+1){
                i++;
            } else {
                int temp = arr[i];
                arr[i] = arr[temp-1];
                arr[temp-1] = temp;
            }
        }
    }

    static void cyclicSortWhile(int[] arr){
        int i = 0;
        while (i < arr.length){
            if(arr[i] == i+1){
                i++;
            } else {
                int temp = arr[i];
                arr[i] = arr[temp-1];
                arr[temp-1] = temp;
            }
        }
    }
}
