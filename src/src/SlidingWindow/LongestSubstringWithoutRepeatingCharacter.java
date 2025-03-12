package SlidingWindow;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacter {
    public int solution() {
        return lengthOfLongestSubstring("zxyzxyz");
    }

    private int lengthOfLongestSubstring(String s) {
        int left = 0;
        int max = 0;
        Set<Character> set = new HashSet<>();

        for (int r = 0; r < s.length(); r++) {
            while (set.contains(s.charAt(r))) {
                set.remove(s.charAt(left++));
            }
            int len = r - left + 1;
            max = Math.max(max, len);
            set.add(s.charAt(r));
        }

        return max;
    }
}
