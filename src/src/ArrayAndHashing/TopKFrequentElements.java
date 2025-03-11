package ArrayAndHashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TopKFrequentElements {
    public int[] solution() {
        return topKFrequent(new int[]{1,2,2,3,3,3}, 2);
    }

    private int[] topKFrequent(int[] nums, int k) {
        List<Integer>[] freq = new List[nums.length + 1];
        for (int i = 0; i < freq.length; i++) {
            freq[i] = new ArrayList();
        }

        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (var entry : map.entrySet()) {
            freq[entry.getValue()].add(entry.getKey());
        }

        int index = 0;
        int[] ans = new int[k];
        for (int i = freq.length - 1; i > 0 && index < k; i--) {
            for (int n : freq[i]) {
                ans[index++] = n;
                if (index == k) {
                    return ans;
                }
            }
        }

        return ans;
    }
}
