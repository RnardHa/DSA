package TwoPointers;

public class TwoSumII {
    public int[] solution() {
        return twoSum(new int[]{1,2,3,4,}, 3);
    }

    private int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {
            int sum = numbers[left] + numbers[right];
            if (sum < target) {
                left++;
            } else if (sum > target) {
                right--;
            } else {
                return new int[]{left + 1, right + 1};
            }
        }
        return new int[]{};
    }
}
