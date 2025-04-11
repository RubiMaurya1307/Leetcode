class Solution {
    // HashMap to store computed results for each TreeNode to avoid recomputation (memoization)
    Map<TreeNode, Integer[]> dp;

    public int rob(TreeNode root) {
        dp = new HashMap(); // Initialize the memoization map
        return sol(root, false);  // Start the recursive function with root and 'false' (not robbed)
    }

    // Recursive function to determine the maximum money that can be robbed
    private int sol(TreeNode root, boolean probbed){
        if(root == null) // Base case: if the node is null, return 0
            return 0;
        
        // Store computed values for both states (robbed or not) to optimize recursion
        dp.putIfAbsent(root, new Integer[2]);
        if(dp.get(root)[probbed ? 1 : 0] != null) // If already computed, return cached result
            return dp.get(root)[probbed ? 1 : 0];

        int one = 0;
        // Case 1: If the current node is NOT robbed in the previous step, we can rob it
        if(!probbed){
            one = root.val + sol(root.left, true) + sol(root.right, true);
        }
        
        // Case 2: Skip robbing the current node and explore the next level of children
        int two = sol(root.left, false) + sol(root.right, false);
        
        // Store the maximum value from both choices in the memoization map and return it
        return dp.get(root)[probbed ? 1 : 0] = Math.max(one, two);
    }
}