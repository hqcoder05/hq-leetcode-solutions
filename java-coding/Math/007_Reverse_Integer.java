class Solution {
    public int reverse(int x) {
        long res = 0;
        int tempX = x;
        while (tempX != 0) {
            res = res * 10 + tempX % 10;
            tempX/=10;
        }
        if (res > Integer.MAX_VALUE || res < Integer.MIN_VALUE) {
            return 0;
        } else {
            return (int)res;
        }
    }
}