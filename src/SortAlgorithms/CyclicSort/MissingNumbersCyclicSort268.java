package SortAlgorithms.CyclicSort;

import java.util.Arrays;

public class MissingNumbersCyclicSort268 {
    public static void main(String[] args) {
        int[] arr = {0,1}; //in cyclic sort the number should be continuous like 1,2,3,4.... also it should start from (1 till N or N-1)
        int result = cyclicSort(arr);
        System.out.println(result);
    }

    static int cyclicSort(int[] arr){
        int i = 0;
        while(i < arr.length) {

            if(arr[i] < arr.length && arr[i] != i) {
                int temp = arr[i];
                arr[i] = arr[temp];
                arr[temp] = temp;
            } else {
                i++;
            }
        }

        for (int j = 0; j < arr.length; j++) {
            if(arr[j] != j) {
                return j;
            }
        }
        return arr.length;
    }
}
