class Solution {
    int ways(int n, int[] memo) {
        if (n == 0 || n == 1) {
            return 1;
        }
        if (memo[n] != -1) {
            return memo[n];
        }
        return memo[n] = ways(n-1, memo) 
                        + ways(n-2, memo);
    }

    public int climbStairs(int n) {
        int[] memo = new int[n+1];
        Arrays.fill(memo, -1);
        return ways(n, memo);
    }
}