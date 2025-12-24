class Solution {
    public int missingNumber(int[] nums) {
        int current = 0;
        int n = nums.length;
        int expect = n * (n + 1) / 2;
        for (int num : nums) {
            current += num;
        }
        return expect - current;
    }
}