public class J02pow {
    // My approach:- using recursion X-> not working for long powers
    public static double myPow(double x, int n) {
        if (n == 0) {
            return 1;
        }
        boolean sign = n > 0 ? true : false;
        n = (int) Math.abs(n);
        double result = getPow(x, n);
        return (double) (sign ? result : (1 / result));
    }

    public static double getPow(double x, int n) {
        if (n == 1) {
            return x;
        }
        return x * (getPow(x, n - 1));
    }

    // Approach 2:- using Math.pow() method
    public static double myPow2(double x, int n) {
        return (double) Math.pow(x, n);
    }

    // Approach 3:- using recursion
    public static double myPow3(double x, int n) {
        long N = n;
        if (N < 0) {
            x = 1 / x;
            N = -N;
        }
        return getPow3(x, N);
    }

    private static double getPow3(double x, long n) {
        if (n == 0)
            return 1.0;

        double half = getPow3(x, n / 2);
        if (n % 2 == 0) {
            return half * half;
        } else {
            return half * half * x;
        }
    }

    public static void main(String args[]) {
        System.out.println("Approach 1:- " + myPow(2.00, 10));
        System.out.println("Approach 1:- " + myPow(2.10000, 3));
        System.out.println("Approach 2:- " + myPow2(2.00, -200000000));
        System.out.println("Approach 3:- " + myPow3(2.00000, -2));
    }
}
