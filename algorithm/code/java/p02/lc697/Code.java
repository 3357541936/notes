package algorithm.code.java.p02.lc697;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Code {
    public int findShortestSubArray(int[] nums) {
        // 记录元素出现次数
        Map<Integer, Integer> count = new HashMap();
        // 记录元素最开始出现的索引
        Map<Integer, Integer> pointerLeft = new HashMap();
        // 记录元素最后出现的索引
        Map<Integer, Integer> pointerRight = new HashMap();

        for (int i = 0; i < nums.length; i++) {
            int v = nums[i];
            if (!count.containsKey(v)) {
                count.put(v, 0);
            }
            if (!pointerLeft.containsKey(v)) {
                pointerLeft.put(v, i);
            }
            int n = count.get(v);
            count.put(v, n + 1);
            pointerRight.put(v, i);
        }

        int maxCount = 0;
        int ans = 0;

        for (Integer k : count.keySet()) {
            int c = count.get(k);
            if (c > maxCount) {
                maxCount = c;
                ans = pointerRight.get(k) - pointerLeft.get(k) + 1;
            } else if (c == maxCount) {
                ans = Math.min(ans, pointerRight.get(k) - pointerLeft.get(k) + 1);
            }
        }
        return ans;
    }
}
