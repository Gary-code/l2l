 // 遍历就可以了
class Solution {
    int maxDis = 0;  // 记录最大路径
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null) return 0;
        maxDepth(root);
        return maxDis;
    }
    int maxDepth(TreeNode root) {
        if (root == null) return 0;
        // 前序位置计算
        int l = maxDepth(root.left);
        int r = maxDepth(root.right);
        // 后序位置顺便计算最大直径
        maxDis = Math.max(l + r, maxDis);  // 直径不用加一
        return 1 + Math.max(l, r);
    }
}