//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
//1295

package LinearSearch;

public class LinearSearch1295 {


    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};

//        int result = findNumbers(nums);
        int result = findNumbersOptimise(nums);
        System.out.println("result " + result);
    }

    static int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            String numsIndexString = Integer.toString(num);
            char[] numIndexChar = numsIndexString.toCharArray();
            if (numIndexChar.length % 2 == 0) {
                count += 1;
            }
        }
        return count;
    }

    //optimise function

    static int findNumbersOptimise(int[] nums) {
        int count = 0;
        for (int num : nums) {
//            int numIndexChar = (int) Math.log10(num) + 1;
            if ((int) Math.log10(num) % 2 != 0) {
                count ++;
            }
        }
        return count;
    }
}
