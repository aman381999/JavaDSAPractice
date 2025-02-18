package PatternProblems;

public class PatternPractice {
    public static void main(String[] args) {
        pattern5(5);
    }

    static void pattern1 (int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern2 (int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern3 (int n) {

        //VIDEO APPROACH FOR SOLVING REVERSE

        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <=  n-row+1; col++) {   //if 5 then row=1 ==> 5+1-1 = 5 (row.e. n-row+1)
                System.out.print("* ");
            }
            System.out.println();
        }

        //MY APPROACH FOR SOLVING REVERSE
//        for (int row = n; row >= 1; row--) {
//            for (int col = 1; col <= row; col++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
    }

    static void pattern4 (int n) {

        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row ; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    static void pattern5 (int n) {

        for (int row = 1; row < 2 * n; row++) {   //double number of rows
            int totalColumns = row > n ? (2*n) - row: row;   //condition to check whether the row is greater than input
            for (int col = 1; col <= totalColumns; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }

//        for (int row = 1; row <= n; row++) {
//            for (int col = 1; col <= row; col++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//
//        for (int row = 1; row <= n; row++) {
//            for (int col = 2; col <=  n-row+1; col++) {   //if 5 then row=1 ==> 5+1-1 = 5 (row.e. n-row+1)
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

    }

    static void pattern6 (int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row + (row-1); col++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int row = 2; row <= n; row++) {
            for (int col = 1; col <=  ((n-row)*2)+1; col++) {   //if 5 then row=1 ==> 5+1-1 = 5 (row.e. n-row+1)
                System.out.print("* ");
            }
            System.out.println();
        }

    }

}
