//  Climbing Stairs - Count ways to reach Nth stair (Order does not matter)
public class J03ClimbStairsWithoutOrder {
    // Using recursion
    public static int climbStairs(int n) {
        if (n < 0) {
            return 0;
        }
        if (n == 0) {
            return 1;
        }
        return 1 + climbStairs(n - 2);
    }

    public static void main(String[] args) {
        System.out.println(climbStairs(5));
    }
}