package Heap;

import java.util.Comparator;
import java.util.PriorityQueue;

public class LastStoneWeight {
    public int solution() {
        return lastStoneWeight(new int[]{2,3,6,2,4});
    }

    private int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());

        for (int s : stones) {
            maxHeap.offer(s);
        }

        while (maxHeap.size() > 1) {
            maxHeap.offer(maxHeap.poll() - maxHeap.poll());
        }

        return maxHeap.poll();
    }
}
