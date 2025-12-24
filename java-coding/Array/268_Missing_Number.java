class Solution {
    public int missingNumber(int[] nums) {
        int expect = 0;
        int current = 0;
        for (int i = 0; i <= nums.length; i++) {
            expect += i;
        }
        for (int num : nums) {
            current += num;
        }
        return expect - current;
    }
}