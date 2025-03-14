package Stack;

import java.util.Stack;

public class DailyTemperature {
    public int[] solution() {
        return dailyTemperatures(new int[]{30,38,30,36,35,40,28});
    }

    private int[] dailyTemperatures(int[] temperatures) {
        int[] ans = new int[temperatures.length];
        record Pair(int temp, int index){}
        Stack<Pair> stack = new Stack<>();

        for (int i = 0; i < temperatures.length; i++) {
            if (stack.empty()) {
                stack.push(new Pair(temperatures[i], i));
            } else {
                while (!stack.empty() && temperatures[i] > stack.peek().temp()) {
                    var data = stack.pop();
                    ans[data.index] = i - data.index;
                }
                stack.push(new Pair(temperatures[i], i));
            }
        }

        return ans;
    }
}
