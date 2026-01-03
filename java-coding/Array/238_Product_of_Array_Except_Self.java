class Solution {
    public int[] productExceptSelf(int[] nums) {
        int x = 1;
        int n = nums.length;
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            res[i] = x;
            x = x * nums[i];
        }
        x  = 1;
        for (int i = n - 1; i >= 0; i--) {
            res[i] *= x;
            x = x * nums[i];
        }
        return res;
    }
}