package BinarySearch;

public class BinarySearchOrderAgnostic {
    public static void main(String[] args) {
        int[] numsAsc = {-30, -15, -8, 0, 2, 5, 25, 32, 54, 63, 78, 89, 95};

        int[] numsDesc = {99, 87, 45, 39, 22, 11, 6, 2, 0, -3, -16, -22, -34};

        int targetAsc = -15;
        int resultAsc = orderAgnosticBinarySearch(numsAsc, targetAsc);
        System.out.println(resultAsc);

        int targetDesc = -22;
        int resultDesc = orderAgnosticBinarySearch(numsDesc, targetDesc);
        System.out.println(resultDesc);
    }

    // check whether the sorted array is ascending or descending
    //check by considering the start and end elem of the array

    static int orderAgnosticBinarySearch(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        Boolean isAsc = nums[start] < nums[end];

        while(start <= end) {

//            int mid = (start + end)/2; // this will exceed the int range
            int mid = start + (end - start)/2;

            //removing the common condition outside
            if ( target == nums[mid]) {
                return mid;
            }

            if(isAsc) {
                if (nums[mid] < target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                if (nums[mid] > target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}
