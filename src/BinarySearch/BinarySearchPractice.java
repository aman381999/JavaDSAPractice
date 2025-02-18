package BinarySearch;

public class BinarySearchPractice {
    public static void main(String[] args) {

        int[] nums = {-30, -15, -8, 0, 2, 5, 25, 32, 54, 63, 78, 89, 95};
        int target = -15;
        int result = binarySearch(nums, target);
        System.out.println(result);
    }

    static int binarySearch(int[] nums, int target) {

        int start = 0;
        int end = nums.length - 1;

        while(start <= end) {

//            int mid = (start + end)/2; // this will exceed the int range
            int mid = start + (end - start)/2;

            if (nums[mid] < target) {
                start = mid + 1;
            } else if (nums[mid] > target) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}




// 1 = N / 2^k
// N = 2^k
// log(N) = log(2^k)
// log(N) = klog2
// k = log(N) / log(2)
// k = log2(N)   // 2 is in base which looks like in lower position