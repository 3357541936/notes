package algorithm.code.java.p02.lc48;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * LCode_48:全排列
 *
 * @author chens
 */
public class Code {
    private boolean[] stateArr;
    private List item = new ArrayList<Integer>();
    private List wrap = new ArrayList<ArrayList<Integer>>();

    public List<List<Integer>> permute(int[] nums) {
        stateArr = new boolean[nums.length];
        fn(nums, 0, nums.length);
        return wrap;
    }

    private void fn(int[] arr, int index, int size) {
        if (index == size) {
//            System.out.println(Arrays.toString(item.toArray()));
            wrap.add(new ArrayList<Integer>(item));
            return;
        }
        for (int i = 0; i < size; i++) {
            if (!stateArr[i]) {
                // 需要当前分支
                item.add(arr[i]);
                stateArr[i] = true;
                fn(arr, index + 1, size);
                stateArr[i] = false;
                item.removeLast();
            }
        }
    }
}
