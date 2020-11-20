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
    
    TreeNode found=null;
    public TreeNode searchBST(TreeNode root, int val)  {
      if(root.val==val)
      {
          return root;
      }
        fun(root,val);
        return found;
    }
    
    public int fun(TreeNode root, int vall)
    {
        if(root==null || found!=null)
        {return 1;}
        
        else{
            fun(root.left,vall);
            if(root.left!=null && root.left.val==vall)
            {
                found=root.left;
            }
            if(root.right!=null && root.right.val==vall)
            {
                found=root.right;
            }
            fun(root.right,vall);
      
        }
        return root.val;
