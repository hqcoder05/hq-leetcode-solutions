class Solution {
    public int characterReplacement(String s, int k) {
        int[] arr = new int[26];
        int left = 0;
        int right = 0;
        int max = 0;
        int res = 0;
        while (right < s.length()) {
            int index = s.charAt(right) - 'A';
            arr[index] = arr[index] + 1;
            max = Math.max(max, arr[index]);
            while ((right - left + 1) - max > k) {
                arr[s.charAt(left) - 'A']--;
                left++;
            }
            res = Math.max(res, right - left + 1);
            right++;
        }
        return res;
    }
}