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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
         List<List<Integer>> list= new ArrayList<>();
        if(root== null)
        {
            return list;
        }
       
        List<Integer> list1;
        list1=new ArrayList<>();
        list1.add(root.val);
        list.add(list1);
        
       Queue<TreeNode> q=new LinkedList<>();
       q.offer(root);
     
        while(!q.isEmpty())
        {
        list1 =new ArrayList();
        int size= q.size();
        
      //  System.out.println("size is "+size);  
            for(int i=0;i<size;i++)
            {
                TreeNode pop= q.poll();    
                 if(pop.right!=null)
            {
                q.add(pop.right);
                list1.add(0,pop.right.val);
            }
                
