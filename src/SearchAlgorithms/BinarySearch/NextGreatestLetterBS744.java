// https://leetcode.com/problems/find-smallest-letter-greater-than-target/description/

package BinarySearch;

import java.util.Arrays;

public class NextGreatestLetterBS744 {

    public static void main(String[] args) {
        char[] letters = {'e','e','e','e','e','e','n','n','n','n'};
        char target = 'e';

//        char[] letters = {'c','f','j'};
//        char target = 'c';

        char result = nextGreatestLetter(letters, target);
        System.out.println(result);
    }
    
    static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;

        while(start <= end) {

            int mid = start + (end - start) / 2;

            if(target < letters[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return letters[start % letters.length];
    }
}
