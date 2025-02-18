package BubbleSort;

import java.util.Arrays;

public class BubbleSortPractice1 {
    public static void main(String[] args) {
            int [] arr = {3,4,1,5,2};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubble (int[] arr) {

        boolean swapped;
        for (int i = 0; i < arr.length; i++) {
            swapped = false;

            for (int j = 1; j < arr.length-i; j++) {
                if(arr[j] < arr[j-1]){
                    int tempVal = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = tempVal;
                    swapped = true;
                }
            }

            if(!swapped){
                break;
            }
        }
    }
}
