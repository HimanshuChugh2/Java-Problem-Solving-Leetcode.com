/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 
 
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode invertTree(TreeNode root) {
        
        
        
        if(root==null)
        {
            return null;
        }
        else
        {
            TreeNode L=root.left;
            TreeNode R=root.right;
            root.left=R;
            root.right=L;
            invertTree(root.left);
            invertTree(root.right);
            
        }
       return root; 
    }
}
