package algorithm.code.java.p02.lc226;

import algorithm.code.java.p02.utils.TreeNode;

public class Code {
    public TreeNode invertTree(TreeNode root) {
        if (root == null)
            return null;
        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);

        // 开始进行交换
        root.left = right;
        root.right = left;

        // 传入自身, 返回自身
        return root;
    }
}
