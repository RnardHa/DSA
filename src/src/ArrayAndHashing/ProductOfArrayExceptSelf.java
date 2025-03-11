package ArrayAndHashing;

public class ProductOfArrayExceptSelf {
    public int[] solution() {
        return productExceptSelf(new int[]{1,2,4,6});
    }

    private int[] productExceptSelf(int[] nums) {
        int[] pre = new int[nums.length];
        int[] post = new int[nums.length];
        int left = 1;
        int right = 1;
        int[] ans = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int j = nums.length - 1 - i;
            pre[i] = left;
            left *= nums[i];
            post[j] = right;
            right *= nums[j];
        }

        for (int i = 0; i < nums.length; i++) {
            ans[i] = pre[i] * post[i];
        }
        return ans;
    }
}
