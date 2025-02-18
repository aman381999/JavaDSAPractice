package BinarySearch;

import java.util.Arrays;

public class InfiniteArrayBSGeeksForGeeks {

    public static void main(String[] args) {
        int[] nums = {2,3,5,9,14,16,18,22,26,29,35,48,52,56,65,69,78,84,96};
        int target = 52;

        int result = searchInInfinite(nums, target);

        System.out.println(result);
    }

    static int searchInInfinite(int[] nums, int target) {

        int start = 0;
        int end = 1;

        while(target > nums[end]) {
            int tempStart = end + 1;

            end = end + (end-start+1) * 2;
            start = tempStart;
        }

        return search(nums, target, start, end);
    }

    static int search(int[] nums, int target, int start, int end) {

        while(start <= end) {

            int mid = start + (end - start) / 2;

            if(target == nums[mid]) {
                return mid;
            }

            if (target < mid) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }

        }

        return -1;
    }
}
