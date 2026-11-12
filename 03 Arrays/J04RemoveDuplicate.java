public class J04RemoveDuplicate {
    public static int removeDuplicate(int[] nums) {
        int n = nums.length;
        int i = 0;
        for (int j = 1; j < n; j++) {
            if (nums[j] != nums[i]) {
                nums[++i] = nums[j];
            }
            j++;
        }
        return i + 1;
    }

    public static void print(int[] nums, int i) {
        for (int j = 0; j < i; j++) {
            System.out.print(nums[j] + "  ");
        }
    }

    public static void main(String[] args) {
        int[] nums = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
        int count = removeDuplicate(nums);
        print(nums, count);
    }
}
