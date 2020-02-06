package learning.series;

public class Series {

    public static int nSum (int n) {
        if (n < 0) {
            return -1;
        } else {
            int sum = 0;
            for (int i = 0; i <= n; i++) {
                sum += i;
            }
            return sum;
        }
    }

    public static int factorial (int n) {
        if (n < 0) {
            return -1;
        } else if (n == 0) {
            return 0;
        } else {
            int fac = 1;
            for (int i = 1; i <= n; i++) {
                fac *= i;
            }
            return fac;
        }
    }

    public static int fibonacci (int n) {
        int fib;
        if (n < 0) {
            fib = -1;
        } else if ((n == 0)){
            fib = 0;
        } else if (n == 1) {
            fib = 1;
        } else {
            fib = fibonacci(n-1) + fibonacci(n-2);
        }
        return fib;
    }

}
