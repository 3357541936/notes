package algorithm.code.java.p02.lc79;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Code {
    List content = new ArrayList<Integer>();
    List wrap = new ArrayList<ArrayList<Integer>>();

    public List<List<Integer>> subsets(int[] nums) {
        this.fn(0, nums);
        return wrap;
    }

    private void fn(int index, int[] nums) {
        if (index == nums.length) {
//            System.out.println();
            wrap.add(new ArrayList<Integer>(content));
            return;
        }

        fn(index + 1, nums);
//        System.out.print(" ---- *");

        content.add(nums[index]);
        fn(index + 1, nums);
        content.removeLast();
//        System.out.print(" ---- " + nums[index]);
    }

}

