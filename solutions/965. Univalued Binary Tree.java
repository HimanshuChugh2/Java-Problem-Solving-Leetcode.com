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
    
   static Integer toReturn;
     public boolean isUnivalTree(TreeNode root)
    {
        toReturn=1;
        if(root.right == null && root.left== null)
        {
            return true;
        }
        
        int result= fun(root,root.val);
       
           if(result==0)
           {
                return false;
           }
            else if(result== 1)
            {
                 return true;
            }
            return true;
    }
    
    
    public static Integer fun(TreeNode rut, int value)
    {
      
        TreeNode temp=rut;
        
        if(temp==null)
        {
            return 0;
        }
        
        else
        {
            
           fun(temp.left,value);
           Integer x= temp.left == null ? null : temp.left.val;
           fun(temp.right,value); 
           Integer y= temp.right == null ? null : temp.right.val;
             
            if(x!=null)
            {
                if(x != value)
                {
                    toReturn=0;
                }
            }
            if(y!=null)
            {
                if(y != value)
                {
                    toReturn=0;
                }
            }   
        }
    return toReturn;
    }
    
         
    }
​
​
​
