package BinarySearch;

import java.util.Arrays;

public class BinarySearch2DMatrix {

    public static void main(String[] args) {

        int[][] arr = {
                {10,20,30,40},
                {15,25,35,45},
                {16,27,38,49},
                {18,29,39,50}
        };

        System.out.println(Arrays.toString(search(arr, 35)));

    }

    static int[] search(int[][] matrix, int target){

        int r = 0;
        int c = matrix.length-1;

        while(r < matrix.length && c >= 0){
            if(matrix[r][c] == target){
                return new int[]{r,c};
            }

            if(matrix[r][c] > target){
                c--;
            } else {
                r++;
            }
        }

        return new int[]{-1,-1};
    }
}
