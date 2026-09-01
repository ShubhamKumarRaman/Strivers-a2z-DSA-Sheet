
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

    public static void main(String args[]) {
        System.out.println(myAtoi("1337c0d3"));
        System.out.println(myAtoi("0-1"));
    }
}
