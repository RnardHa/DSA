package Stack;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Stack;

public class CarFleet {
    public int solution() {
        return carFleet(10, new int[]{1,4},  new int[]{3,2});
    }

    private int carFleet(int target, int[] position, int[] speed) {
        record Pair(int position, int speed){}
        List<Pair> list = new ArrayList<>();

        for (int i = 0; i < position.length; i++) {
            list.add(new Pair(position[i], speed[i]));
        }
        list.sort(Comparator.comparing((Pair::position)).reversed());

        Stack<Double> stack = new Stack<>();
        for (Pair p : list) {
            stack.push((double)(target - p.position) / p.speed);
            if (stack.size() > 1 && stack.peek() <= stack.get(stack.size() - 2)) {
                stack.pop();
            }
        }
        return stack.size();
    }
}
