package Heap;

import java.util.Comparator;
import java.util.PriorityQueue;

public class KClosestPointToOrigin {
    public int[][] solution() {
        return kClosest(new int[][]{
                {0,2},
                {2,2}
        }, 1);
    }

    private int[][] kClosest(int[][] points, int k) {
        record Pair(int distance, int[] point){}
        PriorityQueue<Pair> heap = new PriorityQueue<>(Comparator.comparing(Pair::distance));

        for (int[] p : points) {
            int dist = (p[0] * p[0]) + (p[1] * p[1]);
            heap.offer(new Pair(dist, p));
        }

        int[][] ans = new int[k][2];
        for (int i = 0; i < k; i++) {
            ans[i] = heap.poll().point;
        }

        return ans;
    }
}
