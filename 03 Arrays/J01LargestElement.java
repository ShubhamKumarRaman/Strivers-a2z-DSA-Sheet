
public class J01LargestElement {

    public static int largest(int[] arr) {
        if (arr.length == 0) {
            return Integer.MIN_VALUE;
        }
        int max = arr[0];
        for (int n : arr) {
            if (n > max) {
                max = n;
            }
        }
        return max;
    }

    public static void main(String args[]) {
        int[] arr = { 1, 8, 7, 56, 90 };
        System.out.println(largest(arr));
        int[] arr2 = {};
        System.out.println(largest(arr2));
    }
}
