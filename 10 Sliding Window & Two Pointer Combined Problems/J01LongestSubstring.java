import java.util.HashSet;
import java.util.Set;

public class J01LongestSubstring {
    // My approach
    public static int longestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int longest = 0;
        int current = 0;
        for (char ch : s.toCharArray()) {
            if (set.contains(ch)) {
                set.clear();
                longest = Math.max(longest, current);
                current = 1;
                set.add(ch);
            } else {
                set.add(ch);
                current++;
            }
        }
        return Math.max(longest, current);
    }

    public static void main(String args[]) {
        String s1 = "abcabcbb";
        String s2 = "bbbbb";
        String s3 = "pwwkew";
        String s4 = "abc";
        System.out.println("Approach 1:- " + longestSubstring(s1));
        System.out.println("Approach 1:- " + longestSubstring(s2));
        System.out.println("Approach 1:- " + longestSubstring(s3));
        System.out.println("Approach 1:- " + longestSubstring(s4));
        System.out.println("-".repeat(40));
    }
}
