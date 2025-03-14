package BinarySearch;

import java.util.Arrays;

public class SearchInRotatedSortedArr {
    public int solution() {
        return search(new int[]{3,4,5,6,1,2}, 1);
    }

    private int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = (left + right) >>> 1;
            if (nums[mid] < nums[right]) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        int pivot = left;

        left = 0;
        right = nums.length - 1;

        if (nums[pivot] <= target && target <= nums[right]) {
            left = pivot;
        } else {
            right = pivot;
        }

        while (left <= right) {
            int mid = (left + right) >>> 1;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}
