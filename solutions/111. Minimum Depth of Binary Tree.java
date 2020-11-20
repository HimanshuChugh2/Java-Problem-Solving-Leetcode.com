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
    public int minDepth(TreeNode root) {
        
        Queue<TreeNode> q=new LinkedList<>();
        int min=0;
        int minsofar=Integer.MAX_VALUE;
        if(root==null)
        {
            return min;
        }
        if(root!=null){
        q.offer(root);
            min=1;
        
        }
        while(!q.isEmpty())
        {
           
            int size=q.size();
            
            for(int i=0;i<size;i++)
            {
            TreeNode poll=q.poll();  
                
            if(poll.left==null && poll.right==null)
                {
                   // System.out.println("left and right are null and poll.value is"+poll.val);
                if(minsofar>min)
                {
                    minsofar=min;
                    
