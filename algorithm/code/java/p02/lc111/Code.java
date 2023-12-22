package algorithm.code.java.p02.lc111;

import algorithm.code.java.p02.utils.TreeNode;

public class Code {
    public int minDepth(TreeNode root) {
        if (root == null)
            return 0;

        int leftDepth = minDepth(root.left);
        int rightDepth = minDepth(root.right);
        // 左侧为空, 右侧不为空
        if (root.left == null && root.right != null)
            return rightDepth + 1;

        // 右侧为空, 左侧不为空
        if (root.right == null && root.left != null)
            return leftDepth + 1;

        // 双侧都不为空
        return Math.min(leftDepth, rightDepth) + 1;
    }
}
