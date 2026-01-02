class Solution {
    public boolean isPalindrome(String s) {
        if (s.length() == 1) return true;
        s = s.toLowerCase();
        String str = s.replaceAll("[^a-z0-9]","");
        StringBuilder string = new StringBuilder(str);
        StringBuilder reversedString = new StringBuilder(str);
        reversedString.reverse();
        return reversedString.toString().equals(string.toString());
    }
}