package ArrayAndHashing;

import java.lang.reflect.Array;
import java.util.*;

public class GroupAnagrams {
    public List<List<String>> solution() {
        return groupAnagrams(new String[]{"act","pots","tops","cat","stop","hat"});
    }

    private List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String s : strs) {
            var charArr = s.toCharArray();
            Arrays.sort(charArr);
            var sorted = Arrays.toString(charArr);

            if (!map.containsKey(sorted)) {
                List<String> list = new ArrayList<>();
                list.add(s);
                map.put(sorted, list);
            } else {
                map.get(sorted).add(s);
            }
        }

        List<List<String>> ans = new ArrayList<>();
        for (var key : map.keySet()) {
            ans.add(map.get(key));
        }

        return ans;
    }
}
