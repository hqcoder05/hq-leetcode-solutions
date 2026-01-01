class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int result = nums[0] + nums[1] + nums[nums.length-1];
        for (int i = 0; i < nums.length - 2; i++) {
            int l = i + 1, h = nums.length-1;
            while (l < h) {
                int curr_sum = nums[i] + nums[l] + nums[h];
                if (curr_sum > target) {
                    h--;
                } else {
                    l++;
                }
                if (Math.abs(curr_sum - target) < Math.abs(result - target)) {
                    result = curr_sum;
                }
            }
        }
        return result;
    }
}