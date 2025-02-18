package LinearSearch.PracticeQuestions;

import java.util.Arrays;

public class TwoSumsLS167 {
    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        System.out.println(Arrays.toString(search(arr, 9)));
    }

    static int[] search(int[] numbers, int target){
        for(int i=0; i<numbers.length; i++){
            for(int j=i+1; j<numbers.length; j++){
                if(numbers[i]+numbers[j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
