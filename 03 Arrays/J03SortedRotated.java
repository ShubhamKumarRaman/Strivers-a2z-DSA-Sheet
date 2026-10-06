
public class J03SortedRotated {
    public static boolean SortedRotated(int[] arr) {
        int count = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] > arr[(i + 1) % n]) {
                count++;
            }
        }
        return count <= 1;
    }

    public static void main(String args[]) {
        int[] arr = { 3, 4, 5, 1, 2 };
        System.out.println(SortedRotated(arr));
        int[] arr2 = { 2, 1, 3, 4 };
        System.out.println(SortedRotated(arr2));
    }
}
