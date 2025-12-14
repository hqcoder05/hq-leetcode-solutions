class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int res = 0;
        //using Set 
        for (int i = 0; i < n; i++) {
            Set<Character> visited = new HashSet();
            for (int j = i; j < n; j++) {
                char cur_char = s.charAt(j);
                //if visited contains current char then break loop;
                if (visited.contains(cur_char)) {
                    break;
                } else {
                    //comparing res to find max
                    res = Math.max(res, j - i + 1);
                    visited.add(cur_char);
                }
            }
        }
        return res;
    }
}