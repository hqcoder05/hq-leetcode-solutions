class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) return false;
        int[] arr1 = new int[26];
        int[] arr2 = new int[26];
        for (char ch : s1.toCharArray()) {
            arr1[ch - 'a']++;
        }
        int left = 0, right = 0;
        while (right < s2.length()) {
            arr2[s2.charAt(right) - 'a']++;
            while ((right - left + 1) > s1.length()) {
                arr2[s2.charAt(left) - 'a']--;
                left++;
            }
            if (Arrays.equals(arr1, arr2) && (right - left + 1) == s1.length()) return true;
            right++;
        }
        return false;
    }
}