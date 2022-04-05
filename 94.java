 // 子问题思路
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        LinkedList res = new LinkedList<>();
        if (root == null) return res;
        res.addAll(inorderTraversal(root.left));
        res.add(root.val);
        res.addAll(inorderTraversal(root.right));
        return res;
    }
}


 // 遍历思路
class Solution {
    LinkedList res = new LinkedList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        if(root == null) return res;
        traversal(root);
        return res;
    }
    void traversal(TreeNode root) {
        if(root == null) return ;
        
        traversal(root.left);
        // 中序遍历位置
        res.add(root.val);
        traversal(root.right);
    }
}
