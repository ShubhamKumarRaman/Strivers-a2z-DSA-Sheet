public class J04FibonacciNumber {
    public static int nthFibonacciNumber(int n) {
        int prev1 = 0;
        int prev2 = 1;

        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        for (int i = 2; i <= n; i++) {
            int next = prev1 + prev2;
            prev1 = prev2;
            prev2 = next;
        }
        return prev2;
    }

    public static void main(String args[]) {
        System.out.println(nthFibonacciNumber(1));
        System.out.println(nthFibonacciNumber(3));
        System.out.println(nthFibonacciNumber(10));
    }
}