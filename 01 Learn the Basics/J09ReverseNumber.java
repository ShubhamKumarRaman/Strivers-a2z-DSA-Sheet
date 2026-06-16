public class J09ReverseNumber {
    public static int reverse(int n) {
        int revNum = 0;
        int num = n;
        while (num != 0) {
            int digit = num % 10;
            revNum = (revNum * 10) + digit;
            num /= 10;
        }
        return revNum;
    }

    public static void main(String args[]) {
        System.out.println(reverse(123));
    }
}
