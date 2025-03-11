package ArrayAndHashing;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.IntStream;

public class ContainsDuplicate {
    public boolean solution() {
        return hasDuplicate(new int[]{1,2,3,3});
    }

    private boolean hasDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>(IntStream.of(nums).boxed().toList());
        return set.size() != nums.length;
    }
}
