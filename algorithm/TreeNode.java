package algorithm;

public class TreeNode {
    public int value;
    public TreeNode[] children;

    public TreeNode() {
    }

    public TreeNode(int value) {
        this.value = value;
    }

    public TreeNode(int value, TreeNode[] children) {
        this.value = value;
        this.children = children;
    }
}
