class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n = position.length;
        //[n][n] sẽ bị lỗi index out of bound do n có thể là 0
        //Mang khoi tao la Double vi khi thay time = (target - position[i]) / speed[i] se bi lam tron ve int
        Double[][] cars = new Double[n][2];
        for (int i = 0; i < n; i++) {
            cars[i][0] = (double)position[i];
            cars[i][1] = (double)(target - position[i]) / speed[i];
        }
        //Sap xep giam dan theo position
        Arrays.sort(cars, (a, b) -> Double.compare(b[0], a[0]));
        Stack<Double> stack = new Stack<>();
        //neu time cua xe hien tai lon hon time cua xe tren cung thi tao thanh 1 fleet moi
        for (int i = 0; i < n; i++) {
            double time = cars[i][1];
            if (stack.isEmpty()) {
                stack.push(time);
            } else if (time > stack.peek()) {
                stack.push(time);
            }
        }
        return stack.size();
    }
}