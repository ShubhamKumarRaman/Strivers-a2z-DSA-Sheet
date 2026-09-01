
public class J01atoi {
    // My approach- X not working for :- "-91283472332"
    public static int myAtoi(String s) {
        int result = 0;
        boolean negative = false;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (Character.isDigit(c)) {
                result = result * 10 + Character.getNumericValue(c);
            } else if (c == '-' && (i - 1 >= 0 && !Character.isDigit(s.charAt(i - 1)))) {
                negative = true;
            } else if ((Character.isWhitespace(c)) || c == '+') {
                continue;
            } else {
                break;
            }
        }
        return negative ? result * -1 : result;
    }

    // Approach 2
    public static int myAtoi2(String s) {
        int n = s.length();
        if (n == 0) {
            return 0;
        }
        int i = 0;

        // Skip whitespace
        while (i < n && s.charAt(i) == ' ') {
            i++;
        }
        if (i == n) {
            return 0;
        }

        // Handle sign
        int sign = 1;
        if (s.charAt(i) == '-') {
            sign = -1;
            i++;
        } else if (s.charAt(i) == '+') {
            i++;
        }

        // Convert digit
        int result = 0;
        while (i < n && Character.isDigit(s.charAt(i))) {
            int digit = Character.getNumericValue(s.charAt(i));

            // Check overflow before updating result
            if ((result > Integer.MAX_VALUE / 10)
                    || (result == Integer.MAX_VALUE / 10 && digit > Integer.MAX_VALUE % 10)) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            result = result * 10 + digit;
            i++;
        }
        return sign * result;
    }

    public static void main(String args[]) {
        System.out.println(myAtoi("1337c0d3"));
        System.out.println(myAtoi("0-1"));
        System.out.println(myAtoi2("-91283472332"));
    }
}
