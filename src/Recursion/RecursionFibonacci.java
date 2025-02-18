package Recursion;

public class RecursionFibonacci {
    public static void main(String[] args) {
        int result = fibonacci(4);
        System.out.println(result);
    }

    static int fibonacci(int n) {
        if(n < 2) {

            //if n = 0 or n == 1 return the n value (BASE CONDITION)
            return n;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }
}
