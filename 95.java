/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<TreeNode> generateTrees(int n) {
        if (n == 0) return new LinkedList<>();
        return build(1, n);  // 构建BST
    }

    /* 构建[lo, hi]组成的BST */
    List<TreeNode> build(int lo, int hi) {
        List<TreeNode> res = new LinkedList<>();
        // base case 
        if(lo > hi) {
            res.add(null);  // 千万不要忘记这一步！！！这个也是一种情况
            return res;
        }

        // 以i为根节点的所有可能
        for(int i = lo; i <= hi; i++) {
            // 递归构造出左右子树的所有合法BST
            List<TreeNode> leftTree = build(lo, i - 1);
            List<TreeNode> rightTree = build(i + 1, hi);
            for (TreeNode leftNode: leftTree) {
                for(TreeNode rightNode: rightTree){
                    // i 作为根节点
                    TreeNode root = new TreeNode(i);
                    root.left = leftNode;
                    root.right = rightNode;
                    res.add(root);
                }
            }
        }
        return res;
    }
}