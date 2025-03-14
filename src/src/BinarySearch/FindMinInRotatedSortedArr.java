package BinarySearch;

public class FindMinInRotatedSortedArr {
    public int solution() {
        return findMin(new int[]{4,5,0,1,2,3});
    }

    private int findMin(int[] nums) {
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
        return nums[left];
    }
}
