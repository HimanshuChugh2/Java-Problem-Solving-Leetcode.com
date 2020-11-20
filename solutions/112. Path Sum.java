/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
​
boolean ans = false;
​
public boolean hasPathSum(TreeNode root, int sum) 
{
  if(root==null){return false;}
     fun(root, sum);
     return ans;
}
    //first fun whose return value is bool was the idea you got from "discuss" and after that you did recursive one by yourself
     
    public void fun(TreeNode root, int sum)
    {
        if(root==null)
        {
            return;
        }
        if(root.left==null  && root.right==null && root.val==sum)
        {
            ans=true;
            return;
        }
           
        else
        {
              if(root.left!=null)
         {
             System.out.println("root.left.val "+root.left.val +"root.val"+root.val);
             root.left.val+=root.val;
          
                
         }
             if(root.right!=null)
         {
                 root.right.val+=root.val;
                   System.out.println("root.right.val "+root.right.val +"root.val"+root.val);
               
             
         }
            fun(root.left,sum);
            fun(root.right,sum);
        
        }
    }
 }
