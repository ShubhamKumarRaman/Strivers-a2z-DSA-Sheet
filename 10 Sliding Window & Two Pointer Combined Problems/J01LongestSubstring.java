import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class J01LongestSubstring {
    // My approach XX Not working
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

    // My approach 2 -> Generate all substring
    public static int longestSubstring2(String s) {
        int longest = 0;
        int n = s.length();
        for (int i = 0; i < n; i++) {
            Set<Character> seen = new HashSet<>();
            for (int j = i; j < n; j++) {
                char currentCharacter = s.charAt(j);

                if (seen.contains(currentCharacter))
                    break;

                seen.add(currentCharacter);
                longest = Math.max(longest, j - i + 1);
            }
        }
        return longest;
    }

    // Approach 3:- Optimal solution
    public static int longestSubstring3(String s) {
        int n = s.length();
        int L = 0;
        int longest = 0;
        Map<Character, Integer> map = new HashMap<>();

        for (int R = 0; R < n; R++) {
            char currentCharacter = s.charAt(R);
            if (map.containsKey(currentCharacter)) {
                L = Math.max(L, map.get(currentCharacter) + 1);
            }
            map.put(currentCharacter, R);
            longest = Math.max(longest, R - L + 1);
        }
        return longest;
    }

    // Approach 4:- Most Optimal Solution
    public static int longestSubstring4(String s) {
        int n = s.length();
        int left = 0;
        int maxLength = 0;
        int[] lastSeen = new int[128];
        for (int right = 0; right < n; right++) {
            char ch = s.charAt(right);

            left = Math.max(left, lastSeen[ch]);

            maxLength = Math.max(maxLength, right - left + 1);

            lastSeen[ch] = right + 1;
        }
        return maxLength;
    }

    public static void main(String args[]) {
        String s1 = "abcabcbb";
        String s2 = "bbbbb";
        String s3 = "dvdf";
        String s4 = "abc";
        System.out.println("Approach 1:- " + longestSubstring(s1));
        System.out.println("Approach 1:- " + longestSubstring(s2));
        System.out.println("Approach 1:- " + longestSubstring(s3) + " X 3");
        System.out.println("Approach 1:- " + longestSubstring(s4));
        System.out.println("-".repeat(40));
        System.out.println("Approach 2:- " + longestSubstring2(s1));
        System.out.println("Approach 2:- " + longestSubstring2(s2));
        System.out.println("Approach 2:- " + longestSubstring2(s3));
        System.out.println("Approach 2:- " + longestSubstring2(s4));
        System.out.println("-".repeat(40));
        System.out.println("Approach 3:- " + longestSubstring3(s1));
        System.out.println("Approach 3:- " + longestSubstring3(s2));
        System.out.println("Approach 3:- " + longestSubstring3(s3));
        System.out.println("Approach 3:- " + longestSubstring3(s4));
        System.out.println("-".repeat(40));
        System.out.println("Approach 4:- " + longestSubstring4(s1));
        System.out.println("Approach 4:- " + longestSubstring4(s2));
        System.out.println("Approach 4:- " + longestSubstring4(s3));
        System.out.println("Approach 4:- " + longestSubstring4(s4));
        System.out.println("-".repeat(40));
    }
}
