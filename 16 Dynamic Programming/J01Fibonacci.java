import java.util.Collections;
import java.util.Vector;

public class J01Fibonacci {
    // Using recursion
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    // Using DP- Memoization vector
    public static int fibonacci2(Vector<Integer> v, int n) {
        if (n <= 1) {
            return n;
        }
        // Check if already created
        if (v.get(n) != -1) {
            return v.get(n);
        }

        int result = fibonacci2(v, n - 1) + fibonacci2(v, n - 2);
        // Store the result in vector
        v.set(n, result);
        return result;
    }

    public static void main(String[] args) {
        System.out.println("6:- " + fibonacci(6));

        int n = 8;
        Vector<Integer> v = new Vector<>(Collections.nCopies(n + 1, -1));
        System.out.println(n + ":- " + fibonacci2(v, n));
    }
}
