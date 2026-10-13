import java.util.HashMap;
import java.util.Map;

public class J02ClimbStairs {
    // Using recursion
    public static int climbStairs(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return climbStairs(n - 1) + climbStairs(n - 2);
    }

    // Using Memoization
    public static int climbStairs2(int n) {
        Map<Integer, Integer> memo = new HashMap<>();
        return climbStairs2(n, memo);
    }

    private static int climbStairs2(int n, Map<Integer, Integer> memo) {
        if (n == 0 || n == 1) {
            return 1;
        }
        if (!memo.containsKey(n)) {
            memo.put(n, climbStairs2(n - 1, memo) + climbStairs2(n - 2, memo));
        }
        return memo.get(n);
    }

    public static void main(String[] args) {
        System.out.println(climbStairs(5));
        System.out.println(climbStairs2(6));
    }
}
