//https://leetcode.com/problems/richest-customer-wealth/description/
//1672

package LinearSearch;

import java.util.Arrays;

public class LinearSearch1672 {

    public static void main(String[] args) {

        int[][] accounts = {{1,5},{7,3},{3,5}};
        int result = maximumWealth(accounts);
        System.out.println("result " + result);
    }

    static int maximumWealth(int[][] accounts) {
        int finalCount = 0;
        for (int[] account : accounts) {
            int count = 0;

            for (int j = 0; j < account.length; j++) {
                count = count + account[j];
            }
            if (finalCount < count) {
                finalCount = count;
            }
        }
        return finalCount;
    }
}
