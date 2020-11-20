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
   ArrayList<Integer> al=new ArrayList();
 
    public boolean findTarget(TreeNode root, int k) {
       al.add(0,root.val);
       if(root.left == null  && root.right==null)
       {
           
        }
        else
        {
        populate(root);
        }
        for(int i=0;i<al.size();i++)
        {
         }
        
          for (int i=0;i<al.size();i++)
        {
            for (int j=0;j<al.size();j++)
            if(i==j)
            {
             }
              else
              {
 
                if (k==(al.get(i)+al.get(j)))
             {
                 return true;
             }
             }
