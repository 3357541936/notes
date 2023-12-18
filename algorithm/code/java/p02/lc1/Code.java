package algorithm.code.java.p02.lc1;

import java.util.HashMap;
import java.util.Map;

public class Code {
    private Map ans = new HashMap<Integer, Integer>();

    public int[] twoSum(int[] nums, int target) {
        int size = nums.length;
        for (int i = 0; i < size; i++) {
            if (ans.containsKey(target - nums[i]))
                return new int[]{i, (int) ans.get(target - nums[i])};
            ans.put(nums[i],i);
        }
        return new int[]{};
    }
}
