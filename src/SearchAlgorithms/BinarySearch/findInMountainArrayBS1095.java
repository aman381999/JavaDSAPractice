//https://leetcode.com/problems/find-in-mountain-array/submissions/1444059038/

package BinarySearch;

public class findInMountainArrayBS1095 {

    public static void main(String[] args) {

//        int[] mountainArr = {1,2,3,4,5,3,1};
        int[] mountainArr = {0,1,2,4,2,1};

        int target = 3;

        int result = findTargetInMountainArray(target, mountainArr);

        System.out.println("result " + result);
    }

    static int findTargetInMountainArray (int target, int[] mountainArr) {

        int start = 0;
        int end = mountainArr.length - 1;
        int peak = -1;

        while (start <= end){

            int mid = start + ( end - start ) / 2;

            if (start == end) {
                peak = mid;
                break;
            }

            if (mountainArr[mid + 1] < mountainArr[mid]) {
                end = mid;
            } else {
                start = mid + 1;
            }

        }

        int ascArrData = searchInAscMountainArray(peak, target, mountainArr);

        if (ascArrData >= 0 && mountainArr[ascArrData] == target) {
            return ascArrData;
        }

        int descArrData = searchInDescMountainArray(peak, target, mountainArr);

        if(descArrData >= 0 &&  mountainArr[descArrData] == target) {
            return descArrData;
        }

        return -1;
    }

    static int searchInAscMountainArray (int peak, int target, int[] mountainArr) {

        int start = 0;
        int end = peak;

        while (start <= end) {
            int mid = start + ( end - start ) / 2;

            if(mountainArr[mid] == target){
                return mid;
            };

            if (mountainArr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return -1;
    }

    static int searchInDescMountainArray (int peak, int target, int[] mountainArr) {

        int start = peak + 1;
        int end = mountainArr.length - 1;

        while (start <= end) {
            int mid = start + ( end - start ) / 2;

            if(mountainArr[mid] == target){
                return mid;
            };

            if (mountainArr[mid] < target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return -1;
    }
}
