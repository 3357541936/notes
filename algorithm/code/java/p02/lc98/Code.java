package algorithm.code.java.p02.lc98;

import algorithm.code.java.p02.utils.TreeNode;

public class Code {
    public boolean isValidBST(TreeNode root) {
        return fn(root, -(1l << 31),  (1l << 31) - 1);
    }

    private boolean fn(TreeNode node, long min, long max){
        System.out.println(min);
        System.out.println(max);
        if (node == null)
            return true;
        if (min > node.val || max < node.val){
            return false;
        }
        boolean state_l = fn(node.left, min, (long)node.val - 1);
        boolean state_r = fn(node.right, (long) node.val + 1, max);

        return state_l && state_r;
    }

}
