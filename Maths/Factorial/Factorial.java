package Factorial;

/**
 * Algorithm to do the factorial N.
 */
public class Factorial {

    // test code
    public static void main(String[] args) {
        assert factorial(0) == 1;
        assert factorial(1) == 1;
        assert factorial(5) == 120;
        assert factorial(10) == 3628800;
    }

    public static long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("number is negative");
        }
        long factorial = 1;
        for (int i = 1; i <= n; factorial *= i, ++i)
            ;
        return factorial;
    }
}