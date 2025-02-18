package SelectionSort;

import java.util.Arrays;

public class SelectionSortPractice1 {

    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selection(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int lastIndex = arr.length - i -1;
            int maxIndex = 0;
            for (int j = 0; j <= lastIndex; j++) {  //check j is equals to less than lastIndex (IMPORTANT) // Inner loop includes the last unsorted element
                if(arr[maxIndex] < arr[j]){
                    maxIndex = j;
                }
            }

            int temp = arr[maxIndex];
            arr[maxIndex] = arr[lastIndex];
            arr[lastIndex] = temp;
        }
    }
}
