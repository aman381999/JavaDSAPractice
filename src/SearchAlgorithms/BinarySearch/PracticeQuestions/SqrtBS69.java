package BinarySearch.PracticeQuestions;

public class SqrtBS69 {

    public static void main(String[] args) {
        System.out.println(findSqrt(5));
    }

    static int findSqrt(int x) {
        if(x==0)return 0;

        int start = 1;
        int end = x;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (mid == x/mid) {
                return mid;
            }

            if(mid < x/mid && (mid + 1) > x/(mid+1)){
                return mid;
            }

            if(mid > x/mid && (mid-1) < x/(mid-1)) {
                return mid-1;
            }

            if (mid > x/mid) {
                end = mid-1;
            } else {
                start = mid+1;
            }
        }

        return 1;
    }
}
