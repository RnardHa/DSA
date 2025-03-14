package Stack;

import java.util.Stack;

public class EvaluateRPN {
    public int solution() {
        return evalRPN(new String[]{"10","6","9","3","+","-11","*","/","*","17","+","5","+"});
    }

    private int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for (String s : tokens) {
            if (s.equals("+")) {
                stack.push(stack.pop() + stack.pop());
            } else if (s.equals("-")) {
                var val1 = stack.pop();
                var val2 = stack.pop();
                stack.push(val2 - val1);
            } else if (s.equals("*")) {
                stack.push(stack.pop() * stack.pop());
            } else if (s.equals("/")) {
                var val1 = stack.pop();
                var val2 = stack.pop();
                stack.push(val2 / val1);
            } else {
                stack.push(Integer.parseInt(s));
            }
        }
        return stack.pop();
    }
}
