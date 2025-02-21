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
    private int util(TreeNode root,int ans[]){
        if(root==null){
            return 0;
        }
        int l= util(root.left,ans);
        int  r=util(root.right,ans);
        ans[0]+=Math.abs(l-r);
        return l+r+root.val;
    }
    public int findTilt(TreeNode root) {
        int ans[]=new int[1];
        util(root,ans);
        return ans[0];
    }
}