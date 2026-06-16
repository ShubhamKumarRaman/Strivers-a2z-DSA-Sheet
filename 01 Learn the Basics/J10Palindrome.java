public class J10Palindrome {
    public static boolean palindrome(int n) {
        int reverse = 0;
        int num = n;
        if (n < 0) {
            return false;
        } else {
            while (num != 0) {
                int digit = num % 10;
                reverse = (reverse * 10) + digit;
                num /= 10;
            }
        }
        return n == reverse;
    }

    public static void main(String args[]) {
        System.out.println(palindrome(121));
        System.out.println(palindrome(1234));
        System.out.println(palindrome(-121));
    }
}
