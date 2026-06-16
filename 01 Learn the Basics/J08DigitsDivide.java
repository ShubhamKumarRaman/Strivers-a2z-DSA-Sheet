import java.sql.Time;

public class J08DigitsDivide {
    // FUNCTION evenlyDivide(n)
    // num ← n
    // count ← 0

    // WHILE num > 0 DO
    // digit ← num MOD 10

    // IF digit = 0 THEN
    // num ← num DIV 10
    // CONTINUE
    // END IF

    // IF n MOD digit = 0 THEN
    // count ← count + 1
    // END IF

    // num ← num DIV 10
    // END WHILE

    // RETURN count
    // END FUNCTION
    // Time Complexity: O(\log_{10} n)
    // Space Complexity: O(1)
    public static int evenlyDivide(int n) {
        int num = n;
        int count = 0;
        while (num > 0) {
            int digit = num % 10;
            if (digit == 0) {
                num /= 10;
                continue;
            }
            if (n % digit == 0) {
                count++;
            }
            num /= 10;
        }
        return count;
    }

    public static void main(String args[]) {
        System.out.println(evenlyDivide(2446));
        System.out.println(evenlyDivide(23));
    }
}
