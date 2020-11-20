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
    int minval=Integer.MAX_VALUE;
    int minsofar=Integer.MAX_VALUE;
     boolean bool=false;
      List<Integer> list = new ArrayList<>();
         
   
     public int findSecondMinimumValue(TreeNode root)
     {
         if(root == null)
         {
             return -1;
         }
         if(root.left==null && root.right==null)
         {
             return -1;
         }
         
         
         
         dfs(root);
         Collections.sort(list);
         for(int i=0;i<list.size()-1;i++)
         {
             if(list.get(i)!=list.get(i+1))
             {
             return list.get(i+1);
             }
         }
         return -1;
     }
         
        public void dfs(TreeNode root) {
        if (root != null) {
            list.add(root.val);
            dfs(root.left);
            dfs(root.right);
        }
    }
         
//         public int findSecondMinimumValue(TreeNode root) {
     
//         fun(root);
//          fun2(root);
        
//         if(minval == Integer.MAX_VALUE && bool==false)
//         {
//              return -1;
//         }
        
//          return minval;
//      }
//         public void fun2(TreeNode root){
//          if(root==null)
//         {
//              return;
//         }
//         else
//         {
