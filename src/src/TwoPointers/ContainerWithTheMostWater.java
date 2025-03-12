package TwoPointers;

public class ContainerWithTheMostWater {
    public int solution() {
        return maxArea(new int[]{1,7,2,5,4,7,3,6});
    }

    private int maxArea(int[] heights) {
        int left = 0;
        int right = heights.length - 1;
        int max = 0;

        while (left < right) {
            int area = Math.min(heights[left], heights[right]) * (right - left);
            if (heights[left] < heights[right]) {
                left++;
            } else {
                right--;
            }
            max = Math.max(max, area);
        }

        return max;
    }
}
