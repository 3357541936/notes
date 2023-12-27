package algorithm.code.java.p02.Difficult.no84;

import java.util.Arrays;
import java.util.Stack;

public class Code {
    // 高度栈
    private Stack<Integer> stack = new Stack();
    // 宽度栈
    private Stack<Integer> width = new Stack();
    // 输出答案
    private int ans = 0;

    public int largestRectangleArea(int[] heights) {
        // 对原数组末尾补充 0, 以保证栈被弹空.
        heights = Arrays.copyOf(heights, heights.length + 1);
        heights[heights.length - 1] = 0;

        for (int i = 0; i < heights.length; i++) {
            // 对需要出栈的宽度进行计算, 若无元素弹出, 则加一入栈(当前元素宽度)
            int w = 0;
            // 栈不为空, 且栈顶的元素(前一位)比当前项高, 证明单调性被破坏, 需要出栈
            while (!stack.empty() && (stack.peek() > heights[i])) {
                w = w + width.peek();
                this.ans = Math.max(ans, w * stack.peek());
                // 对该项计算后, 弹出该项
                width.pop();
                stack.pop();
            }
            // 对当前遍历项 进行入栈
            width.push(w + 1);
            stack.push(heights[i]);
        }
        return ans;
    }
}
