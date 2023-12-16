package algorithm.code.java.p02.lc77;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * LCode_77: 组合
 * @author chens
 */
public class Code {
    private List wrap = new ArrayList<ArrayList<Integer>>();
    private List item = new ArrayList<Integer>();
    public List<List<Integer>> combine(int n, int k) {
        fn(1,n, k);
        return wrap;
    }

    private void fn(int curr, int nums, int k){
        if (k == item.size()){
            wrap.add(new ArrayList<Integer>(item));
            return;
        }
        if (curr >= nums+1){
            return;
        }
        // 不需要当前位
        fn(curr +1, nums,k);

        // 需要当前位置
        item.add(curr);
        fn(curr+1, nums,k);
        item.removeLast();
    }
}
