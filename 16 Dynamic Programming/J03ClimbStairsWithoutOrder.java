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

    // [Better Approach] Using Dynamic Programming - O(n) Time and O(1) Space
    public static int climbStairs2(int n) {
        int ans = 0;
        int prev1 = 0, prev2 = 0;
        for(int i = 0;i<=n;i++){
            ans = 1+prev2;
            prev2 = prev1;
            prev1 = ans;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(climbStairs(5));
        System.out.println(climbStairs2(5));
    }
}