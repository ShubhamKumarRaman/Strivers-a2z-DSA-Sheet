public class J12LCMandGCD {
    public static int[] LCMandGCD(int n1, int n2) {
        int min = Math.abs(n1 - n2);
        int max = Math.max(n1, n2);

        int LCM = 1, GCD = 1;
        // Find LCM
        for (int i = 1; i <= min; i++) {
            if ((max * i) % min == 0) {
                LCM = max * i;
                break;
            }
        }

        // Find GCD
        for (int i = min; i >= 1; i--) {
            if (n1 % i == 0 && n2 % i == 0) {
                GCD = i;
                break;
            }
        }
        return new int[] { LCM, GCD };
    }

    public static void main(String args[]) {
        System.out.println((LCMandGCD(5, 10)).toString());
    }
}
