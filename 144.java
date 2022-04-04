 // 遍历思路，回溯
class Solution {
    LinkedList<Integer> res = new LinkedList<>();  // 记录返回结果
    public List<Integer> preorderTraversal(TreeNode root) {
        traverse(root);
        return res;
    }

    void traverse(TreeNode root) {
        if (root == null) {
            return;
        }
        // 前序位置
        res.add(root.val);
        traverse(root.left);
        traverse(root.right);
    }
}


 // 分解问题思路，动态规划
class Solution {
    // 定义：输入一个节点，返回以该节点为根的二叉树的前序遍历结果!!!
    public List<Integer> preorderTraversal(TreeNode root) {
        LinkedList<Integer> res = new LinkedList<>();
        if (root == null) {
            return res;
        }
        // 下面是前序遍历的特点
        res.add(root.val);
        res.addAll(preorderTraversal(root.left));
        res.addAll(preorderTraversal(root.right));
        return res;
    }
}