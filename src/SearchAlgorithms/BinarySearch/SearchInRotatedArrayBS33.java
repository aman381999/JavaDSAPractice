//https://leetcode.com/problems/search-in-rotated-sorted-array/

package BinarySearch;

public class SearchInRotatedArrayBS33 {

    public static void main(String[] args) {

        int[] nums = {4,5,6,7,8,1,2,3};
        int target = 8;

        int pivot = searchInArray(nums, target);

        int result = -1;

        if(pivot == -1){
            result = binarySearch(0, nums.length-1, target, nums);
        }

        if(pivot != -1 && target == nums[pivot]) {
            result = pivot;
        }

        if(nums[0] <= target){
            result = binarySearch(0, pivot, target,nums);
        }

        if(nums[0] > target){
            result = binarySearch(pivot+1, nums.length -1 ,target, nums);
        }

        System.out.println("result " + result);
    }

    static int searchInArray(int[] nums, int target) {

        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if(mid > start && nums[mid] < nums[mid-1]){
                return mid-1;
            }

            if(mid < end && nums[mid] > nums[mid+1]){
                return mid;
            }

            if(nums.length == 1 && start == end) {
                return mid;
            }

            if(nums[start] > nums[mid]){
                end = mid-1;
            } else {
                start = mid + 1;
            }
        }

        return -1;
    }

    static int binarySearch (int start, int end, int target, int[] nums) {

        while(start <= end){

            int mid = start + (end - start) / 2;

            if(nums[mid] == target) {
                return mid;
            }

            if(target < nums[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return -1;
    }
}
