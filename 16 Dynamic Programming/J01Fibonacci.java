
public class J01Fibonacci {
    // Using recursion
    public static int fibonacci(int n){
        if(n<=1){
            return n;
        }
        return fibonacci(n-1)+fibonacci(n-2);
    }
    public static void main(String[] args) {
        System.out.println("6:- "+fibonacci(6));
    }
}
