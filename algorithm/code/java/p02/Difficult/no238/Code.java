package algorithm.code.java.p02.Difficult.no238;


import java.util.*;

public class Code {
    private Deque<Integer> deque = new LinkedList();
    private int pointerLeft = 1;
    private int pointRight = 0;

    public int[] maxSlidingWindow(int[] nums, int k) {
        int len = nums.length;

        if (k > len || k <= 0) return new int[0];
        int[] ans = new int[len - k + 1];
        pointerLeft -= k;
        for (; pointRight < len; pointRight++, pointerLeft++) {
            // 移出当前已经操作过的(放入结果中)的值
            if (pointerLeft > 0 && deque.peekFirst() == nums[pointerLeft - 1])
                deque.removeFirst();

            while (!deque.isEmpty() && (deque.peekLast() < nums[pointRight]))
                deque.removeLast();

            deque.addLast(nums[pointRight]);

            if (pointerLeft >= 0) {
                ans[pointerLeft] = deque.peekFirst();
            }
        }
//        System.out.println(Arrays.toString(ans));
        return ans;
    }
}
