package ZZ_PracticeQuestions;

public class ArrangingCoins441 {
    public static void main(String[] args) {
        System.out.println(arrangecoins(3));
    }

    static int arrangecoins(int n) {

        long start = 0;
        long end = n;

        while (start <= end) {
            long mid = start + (end-start)/2;
            long maxVal = (mid*(mid+1))/2;

            if(maxVal == n) {
                return (int) mid;
            }

            if( maxVal > n){
                end = mid-1;
            } else {
                start = mid+1;
            }
        }

        return (int) end;
    }
}
