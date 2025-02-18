package SortAlgorithms.CyclicSort;

import java.util.Arrays;

public class SetMismatchCyclicSort645 {

    public static void main(String[] args) {
        int[] arr = {1,2,2,4};
//        cyclic(arr);
        int[] result = cyclic(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(result));
    }

    static int[] cyclic (int[] nums) {

        int i = 0;
        int[] result = new int[2];
        while (i<nums.length){
            if(nums[i] != i+1 && nums[i] != nums[nums[i]-1]) {
                int temp = nums[i];
                nums[i] = nums[temp-1];
                nums[temp-1] = temp;
            } else {
                i++;
            }

        }

        for(int j=0; j<nums.length; j++){
            if(nums[j] != j+1) {
                result[0] = nums[j];
                result[1] = j+1;
                return result;
            }
        }
        return result;
    }
}
