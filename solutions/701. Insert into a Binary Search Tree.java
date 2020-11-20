/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        
        if(root==null)
        {
            return null;
            
        }
        
        else
        {
            if(val>root.val)
            {
                if(root.right==null)
                {
                    TreeNode node=new TreeNode(val);
                    root.right=node;
                }
                else
                {
                insertIntoBST(root.right,val);
                }
            }
            else
            {
                 if(root.left==null)
                {
                    TreeNode node=new TreeNode(val);
                    root.left=node;
                }
                else
