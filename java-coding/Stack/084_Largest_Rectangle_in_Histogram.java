class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int[] leftLimits = new int[n];
        int[] rightLimits = new int[n];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && heights[stack.peek()] >= heights[i]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                leftLimits[i] = -1;
            } else {
                leftLimits[i] = stack.peek();
            }
            stack.push(i);
        }
        
        stack.clear();
        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && heights[stack.peek()] >= heights[i]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                rightLimits[i] = n;
            } else {
                rightLimits[i] = stack.peek();
            }
            stack.push(i);
        }

        int areaMax = 0;
        for (int i = 0; i < n; i++) {
            int width = rightLimits[i] - leftLimits[i] - 1;
            int area = heights[i] * width;
            areaMax = Math.max(areaMax, area);
        }
        return areaMax;
    }
}