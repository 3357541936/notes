package algorithm.code.java.p02.lc226;

import algorithm.code.java.p02.utils.TreeNode;

public class Test {
    public static void main(String[] args) {
        Code code = new Code();
        TreeNode tree = new TreeNode(4,
                new TreeNode(2, new TreeNode(1), new TreeNode(3)),
                new TreeNode(7, new TreeNode(6), new TreeNode(9)));
        code.invertTree(tree);
    }
}
