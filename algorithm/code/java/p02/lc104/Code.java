package algorithm.code.java.p02.lc104;

import algorithm.code.java.p02.utils.TreeNode;

public class Code {
    public int maxDepth(TreeNode root) {
        if(root == null)
            return 0;
        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);

        return Math.max(leftDepth,rightDepth) + 1;
    }
}
