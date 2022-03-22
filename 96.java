class Solution {
    // 避免子问题重复，增加一个备忘录
    int[][] memo;
    public int numTrees(int n) {
        memo = new int[n + 1][n + 1];
        return count(1, n);
    }
    int count(int lo, int hi) {
        if (lo > hi) return 1;

        if(memo[lo][hi] != 0) {
            return memo[lo][hi];
        }

        int res = 0;
        // 以i为根节点
        for(int i = lo; i <= hi; i ++) {
            int left = count(lo, i - 1);
            int right = count(i + 1, hi);
            res += left * right;  // 排列组合
        }
        memo[lo][hi] = res;  // 结果保存到备忘录中
        return res;
        
    }
}