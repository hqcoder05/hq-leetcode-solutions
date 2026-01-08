class Solution {
    public boolean isOpened(char c) {
        if (c == '(' || c == '{' || c == '[') return true;
        return false;
    }
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (!isOpened(c)) {
                if (stack.isEmpty() || stack.pop() != c) return false;
            } else {
                if (c == '(') stack.push(')');
                else if (c == '{') stack.push('}');
                else stack.push(']');
            }
        }
        return stack.isEmpty();
    }
}