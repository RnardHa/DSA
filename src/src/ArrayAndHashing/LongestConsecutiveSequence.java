package ArrayAndHashing;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.IntStream;

public class LongestConsecutiveSequence {
    public int solution() {
        return longestConsecutive(new int[]{2,20,4,10,3,4,5});
    }

    private int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>(IntStream.of(nums).boxed().toList());
        int max = 0;

        for (Integer n : set) {
            int count = 0;
            if (!set.contains(n - 1)) {
                count = 1;
                while (set.contains(n + count)) {
                    count++;
                }
                max = Math.max(max, count);
            }
        }

        return max;
    }
}
