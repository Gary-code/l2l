 // 拆分子问题思路
class Solution {
    int res = 0; // 结果

    public int maxDepth(TreeNode root) {
        if(root == null) {
            return 0; // 没有高度
        }
        int l = maxDepth(root.left);
        int r = maxDepth(root.right);

        res = Math.max(l, r) + 1;
        return res;

    }
}



 // 遍历的思路
class Solution {
    int depth = 0;  // 记录当前遍历的深度
    int res = 0; // 结果

    public int maxDepth(TreeNode root) {
        traverse(root);
        return res;
    }

    void traverse(TreeNode root) {
        if (root == null) {
            // 到达叶子
            res = Math.max(res, depth);
            return;  // 结束递归
        }
        // 前序遍历
        depth ++;
        traverse(root.left);
        traverse(root.right);

        // 后序位置
        depth --;
    }
}