package BinarySearch;

import java.util.Arrays;
import java.util.Map;
import java.util.PriorityQueue;

public class KokoEatingBanana {
    public int solution() {
        return minEatingSpeed(new int[]{1,1,1,999999999}, 10);
    }

    private int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = Arrays.stream(piles).max().getAsInt();
        int ans = right;

        while (left <= right) {
            int mid = (left + right) >>> 1;
            int sum = 0;
            for (int p : piles) {
                sum += Math.ceil((double) p / mid);
            }

            if (sum <= h) {
                ans = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return ans;
//        int ans = 1;
//        int max = Arrays.stream(piles).max().orElseThrow();
//        while (ans <= max) {
//            int sum = 0;
//            for (int p : piles) {
//                sum += Math.ceil((double) p / ans);
//            }
//
//            if (sum > h) {
//                ans++;
//            } else {
//                break;
//            }
//        }
//
//        return ans;
    }
}
