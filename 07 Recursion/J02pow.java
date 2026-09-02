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

    public static void main(String args[]) {
        System.out.println("Approach 1:- " + myPow(2.00, 10));
        System.out.println("Approach 1:- " + myPow(2.10000, 3));
        // System.out.println("Approach 1:- " + myPow(2.00, -200000000));
    }
}
