package BinarySearch;

import java.util.Arrays;

public class BinarySearchSortedMatrix {

    public static void main(String[] args) {
        int[][] matrix = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16},
        };

        System.out.println(Arrays.toString(search(matrix, 13)));
    }

    static int[] search(int[][] matrix, int target) {

        int rows = matrix.length; //length of the rows
        int cols = matrix[0].length - 1; // be cautious, matrix may be empty

        if(rows == 1){
            return binarySearch(matrix, target, 0, 0, cols);
        }

        int rStart = 0;
        int rEnd = rows - 1;
        int cMid = cols / 2;

        while(rStart < (rEnd - 1)) { // range of getting 2 rows only will be rStart (eg: rStart = 1) and rEnd (eg: rEnd = 2). So rEnd should not be lesser than rStart

            int rMid = rStart + (rEnd - rStart)/2;

            if(matrix[rMid][cMid] == target) {
                return new int[]{rMid, cMid};
            }

            if(matrix[rMid][cMid] > target) {
                rEnd = rMid;
            } else {
                rStart = rMid;
            }
        }

        //check in two rows
        if(matrix[rStart][cMid] == target) {
            return new int[]{rStart,cMid};
        }

        if(matrix[rEnd][cMid] == target) {
            return new int[]{rEnd,cMid};
        }

        //check for four conditions

        //1st condition
        if(target <= matrix[rStart][cMid-1]) {
            return binarySearch(matrix, target, rStart, 0, cMid - 1);
        }

        //2nd condition
        if(target >= matrix[rStart][cMid+1] && target <= matrix[rStart][cols-1]) {
            return binarySearch(matrix, target, rStart, cMid + 1, cols - 1);
        }

        //3rd condition
        if(target <= matrix[rEnd][cMid - 1]) {
            return binarySearch(matrix, target, rEnd, 0, cMid - 1);
        }

        //4th condition
        if(target >= matrix[rEnd][cMid+1]) {
            return binarySearch(matrix, target, rEnd, cMid + 1, cols - 1);
        }

        return new int[]{-1,-1};
    }

    static int[] binarySearch(int[][] matrix, int target, int row, int cStart, int cEnd){

        while (cStart <= cEnd) {
            int cMid = cStart + (cEnd - cStart) / 2;

            if(matrix[row][cMid] == target){
                return new int[]{row,cMid};
            }

            if(matrix[row][cMid] > target) {
                cEnd = cMid - 1;
            } else {
                cStart = cMid + 1;
            }
        }

        return new int[]{-1,-1};
    }
}
