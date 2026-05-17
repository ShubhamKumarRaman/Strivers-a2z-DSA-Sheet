
public class J06Varargs {
    public static int findSum(int... nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return sum;
    }

    public static void main(String args[]) {
        System.out.println(findSum(1, 2, 3));
        System.out.println(findSum(10, 20, 30, 40, 50));
    }
}
