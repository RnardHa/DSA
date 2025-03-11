package ArrayAndHashing;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] solution() {
        return twoSum(new int[]{3,4,5,6}, 7);
    }

    private int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (map.containsKey(diff)) {
                return new int[]{map.get(diff), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{};
    }
}
