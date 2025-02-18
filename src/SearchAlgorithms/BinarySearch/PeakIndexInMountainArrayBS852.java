package BinarySearch;

public class PeakIndexInMountainArrayBS852 {

    public static void main(String[] args) {
        int[] arr = {3, 5, 3, 2, 0};

        int result = peakIndexInMountainArray(arr);
        System.out.println(result);
    }

    static int peakIndexInMountainArray(int[] arr) {

        int start = 0;
        int end = arr.length - 1;
//        int mid = start + (end - start) / 2;
//        int peakNumber = mid;

//        while (start <= end) {
//            if (mid != 0) {
//
//                if (arr[peakNumber] > arr[mid + 1] && arr[peakNumber] < arr[mid - 1]) {
//
//                    if (arr[mid] < arr[mid - 1]) {
//                        end = mid - 1;
//                        peakNumber = start + (end - start) / 2;
//                    } else if (arr[mid] > arr[mid - 1]) {
//                        start = mid + 1;
//                        peakNumber = start + (end - start) / 2;
//                    }
//                    mid = start + (end - start) / 2;
//                } else if (arr[peakNumber] < arr[mid + 1] && arr[peakNumber] > arr[mid - 1]) {
//
//                    if (arr[mid] < arr[mid - 1]) {
//                        end = mid - 1;
//                        peakNumber = start + (end - start) / 2;
//                    } else if (arr[mid] > arr[mid - 1]) {
//                        start = mid + 1;
//                        peakNumber = start + (end - start) / 2;
//                    }
//                    mid = start + (end - start) / 2;
//                } else {
//                    return mid;
//                }
//
//            } else {
//                if (arr[peakNumber] > arr[mid + 1]) {
//
//                    if (arr[mid] < arr[mid - 1]) {
//                        end = mid - 1;
//                        peakNumber = start + (end - start) / 2;
//                    } else if (arr[mid] > arr[mid - 1]) {
//                        start = mid + 1;
//                        peakNumber = start + (end - start) / 2;
//                    }
//                    mid = start + (end - start) / 2;
//                } else if (arr[peakNumber] < arr[mid + 1]) {
//
//                    start = mid + 1;
//                    peakNumber = start + (end - start) / 2;
//                    mid = start + (end - start) / 2;
//                }else {
//                    return mid;
//                }
//            }
//
//
//        }

        while (start <= end) {
            int mid = start + ( end - start) / 2;
            if (arr[mid] > arr[mid + 1]){
                //you are in descending part of array
                //this may be the ans but look at left
                end = mid;
            } else {
                start = mid + 1;
            }

            if(start == end) {
                return start;
            }
        }
        return -1;
    }


}
