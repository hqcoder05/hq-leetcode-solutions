class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int res = 0;
        int l = 0, r = 0;
        Set<Character> vis = new HashSet();
        while (r < n) {
            while (vis.contains(s.charAt(r))) {
                vis.remove(s.charAt(l));
                l++;
            }
            res = Math.max(res, r - l + 1);
            vis.add(s.charAt(r));
            r++;
        }
        return res;
    }
}