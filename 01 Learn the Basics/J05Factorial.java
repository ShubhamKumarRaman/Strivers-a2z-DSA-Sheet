
public class J05Factorial {
    public static int factorial(int num) {
        int fact = 1;
        while (num > 1) {
            fact *= num;
            num--;
        }
        return fact;
    }

    public static void main(String args[]) {
        System.out.println(factorial(5));
        System.out.println(factorial(2));
        System.out.println(factorial(6));
    }
}
