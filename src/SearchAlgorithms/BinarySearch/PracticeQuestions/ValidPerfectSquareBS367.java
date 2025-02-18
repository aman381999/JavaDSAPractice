package BinarySearch.PracticeQuestions;

public class ValidPerfectSquareBS367 {

    public static void main(String[] args) {
        System.out.println(search(100000001));
    }

    static boolean search(int num){
        int start = 1;
        int end = num;

        while(start<=end){
            int mid=start+(end-start)/2;

            if(mid == (double)num/mid){
                return true;
            }

            if(mid > num/mid){
                end = mid-1;
            } else {
                start = mid+1;
            }
        }

        return false;
    }
}
