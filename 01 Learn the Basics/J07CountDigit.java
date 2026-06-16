public class J07CountDigit {
    public static int countDigit(int n) {
        int count = 0;
        while (n > 0) {
            count++;
            n /= 10;
        }
        return count;
    }

    public static void main(String args[]) {
        System.out.println(countDigit(1234));
        System.out.println(countDigit(4));
    }
}
