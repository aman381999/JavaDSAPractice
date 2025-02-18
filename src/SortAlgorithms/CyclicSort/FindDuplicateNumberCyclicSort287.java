package SortAlgorithms.CyclicSort;

public class FindDuplicateNumberCyclicSort287 {

    public static void main(String[] args) {
        int[] arr = {0,1}; //in cyclic sort the number should be continuous like 1,2,3,4.... also it should start from (1 till N or N-1)
        int result = cyclicSort(arr);
        System.out.println(result);
    }

    static int cyclicSort(int[] nums){
        int i = 0;
        while (i < nums.length) {
            if(nums[i] != i+1){
                if(nums[i] != nums[nums[i] - 1]){
                    int temp = nums[i];
                    nums[i] = nums[temp - 1];
                    nums[temp-1] = temp;
                } else {
                    return nums[i];
                }
            } else {
                i++;
            }
        }
        return -1;
    }
}
