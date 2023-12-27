package algorithm.code.java.p02.Difficult.no42;

import java.util.Stack;

public class Code {
    private Stack<Integer> stack = new Stack<>();
    private Stack<Integer> width = new Stack<>();
    private int ans = 0;

    public int trap(int[] height) {
        for (int i = 0; i < height.length; i++) {

            int currWidth = 0;
            while (!stack.empty() && (height[i] > stack.peek())) {
                int bottom = stack.peek();
                currWidth += width.peek();

                stack.pop();
                width.pop();
                if (stack.empty())
                    continue;
                int top = Math.min(height[i], stack.peek());
                ans += ((top - bottom) * currWidth);

            }
            stack.push(height[i]);
            width.push(currWidth + 1);
        }
        return ans;
    }
}
