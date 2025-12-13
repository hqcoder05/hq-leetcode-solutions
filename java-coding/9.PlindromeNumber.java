class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) { 
            return false;
        }
        if (x < 10) {
            return true;
        }
        if (x % 10 == 0) {
            return false;
        }
        String originalX = Integer.toString(x);
        int reversedX = 0;
        while (x > reversedX) {
            int digit = x % 10;
            reversedX = reversedX * 10 + digit;
            x/=10;
        }
        if (originalX.length() % 2 == 1) {
            return x == (reversedX / 10);
        } else {
            return x == reversedX;
        }
    }
}