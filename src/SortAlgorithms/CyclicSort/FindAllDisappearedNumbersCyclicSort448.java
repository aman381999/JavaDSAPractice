package SortAlgorithms.CyclicSort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllDisappearedNumbersCyclicSort448 {
    public static void main(String[] args) {
        int[] arr = {1,1}; //in cyclic sort the number should be continuous like 1,2,3,4.... also it should start from (1 till N or N-1)

        List<Integer> result = cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(result);
    }

    private static List<Integer> cyclicSort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            if(arr[i] != arr[arr[i]-1] && arr[i] != i+1){
                int temp = arr[i];
                arr[i] = arr[temp-1];
                arr[temp-1] = temp;
            } else {
                i++;
            }
        }

        List<Integer> myList = new ArrayList<>();

        for (int j = 0; j < arr.length; j++) {
            if(arr[j] != (j+1)) {
                myList.add(j+1);
            }
        }
        return myList;
    }


}
