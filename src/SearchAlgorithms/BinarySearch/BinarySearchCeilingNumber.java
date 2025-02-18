package BinarySearch;

public class BinarySearchCeilingNumber {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        int target = 15;

        int result = ceilingOfNumber(arr, target);

        System.out.println(result);
    }

    // number greater than or equal to the target

    //refer floor solution for reference which the opposite of this

    static int ceilingOfNumber(int[] arr, int target){

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start)/2;

            if (arr[mid] == target){
                return arr[mid];
            }

            if(target < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        // return start when there is no target found because start and end violates the condition of while loop and now start is greater than end
        // so return start
        return start;
    }
}
