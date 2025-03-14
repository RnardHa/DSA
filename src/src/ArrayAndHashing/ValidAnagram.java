package ArrayAndHashing;

public class ValidAnagram {
    public boolean solution() {
        return isAnagram("racecar", "carrace");
    }

    private boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] alphaArr = new int[26];
        for (int i = 0; i < s.length(); i++) {
            alphaArr[s.charAt(i) - 'a']++;
            alphaArr[t.charAt(i) - 'a']--;
        }

        for (int i : alphaArr) {
            if (i != 0) {
                return false;
            }
        }

        return true;
    }
}
