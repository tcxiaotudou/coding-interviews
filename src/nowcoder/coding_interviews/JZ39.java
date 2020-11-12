package nowcoder.coding_interviews;

/**
 输入一棵二叉树，判断该二叉树是否是平衡二叉树。
 在这里，我们只需要考虑其平衡性，不需要考虑其是不是排序二叉树
 */
public class JZ39 {

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    public int depth(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int left = depth(node.left);
        if (left == -1) {
            return -1;
        }
        int right = depth(node.right);
        if (right == -1) {
            return -1;
        }
        if (Math.abs(left - right) > 1) {
            return -1;
        }
        return Math.max(left, right) + 1;
    }

    public boolean IsBalanced_Solution(TreeNode root) {
        return depth(root) != -1;
    }
}
