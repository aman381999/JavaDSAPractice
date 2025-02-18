package SortAlgorithms.CyclicSort;

import java.util.Arrays;

public class FirstMissingPositiveCyclicSort41 {

    public static void main(String[] args) {
        int[] arr = {7,8,9,11,12};

        int result = cyclicSort(arr);

        System.out.println(Arrays.toString(arr));
        System.out.println(result);
    }

    static int cyclicSort(int[] nums) {
        int i=0;
        while(i<nums.length){
            if(nums[i] > 0 && nums[i]-1 < nums.length && nums[i] != nums[nums[i]-1] ){
                    int temp = nums[i];
                    nums[i] = nums[temp-1];
                    nums[temp-1] = temp;
            } else {
                i++;
            }
        }

        for(int j=0; j<nums.length; j++){
            if(nums[j] != (j+1)) {
                return j+1;
            }
        }
        return nums.length+1;
    }
}
