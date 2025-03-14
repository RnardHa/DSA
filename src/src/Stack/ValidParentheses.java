package Stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses {
    public boolean solution() {
        return isValid("([{}])");
    }

    private boolean isValid(String s) {
        Map<Character, Character> map = new HashMap<>();
        map.put('}', '{');
        map.put(')', '(');
        map.put(']', '[');
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (!map.containsKey(s.charAt(i))) {
                stack.push(s.charAt(i));
            } else {
                if (stack.empty()) {
                    return false;
                }

                var curr = stack.pop();
                if (curr != map.get(s.charAt(i))) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
