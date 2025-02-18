package BinarySearch;

public class BinarySearchFloorNumber {

    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        int target = 6;

        int result = floorNumber(arr, target);

        System.out.println(result);
    }

    // find the number lesser than or equal to target

    //refer ceiling solution for reference which the opposite of this
    static int floorNumber(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;

        while(start <= end){

            int mid = start + ( end - start) / 2;

            if(arr[mid] == target) {
                return arr[mid];
            }

            if(target < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return end;
    }
}
