package BinarySearch;

import java.util.Arrays;

public class SearchRangeBS34 {
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,8,8,8,8,10};
        int target = 8;

        int[] result = searchRange(nums, target);

        System.out.println(Arrays.toString(result));
    }

    static int[] searchRange(int[] nums, int target) {

        int[] result = {-1, -1};

        int start = search(nums, target, true);
        int end = search(nums, target, false);

        result = new int[]{start, end};
        return result;
    }

    static int search(int[] nums, int target, boolean findStartValue) {

        int result = -1;
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if(target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                result = mid;
                if(findStartValue) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }

        return result;
    }
}
