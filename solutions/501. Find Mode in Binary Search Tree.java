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
            Map<Integer,Integer> map=new HashMap<>();
​
    public int[] findMode(TreeNode root) {
        int[] arr;
        fun(root);
        List<Integer> list=new ArrayList<>();
        int max=Integer.MIN_VALUE;
        
        
        
        for(Map.Entry<Integer,Integer> entry : map.entrySet())
        {
             int key = entry.getKey(); 
             int value = entry.getValue();
​
            if(max  == value)
            {   
                list.add(key);
            }
            else if(value>max )
            {
                list.clear();
                max=value;
                list.add(key);
            }
        }
        
        arr=new int[list.size()];
      //  System.out.println("list.size() is "+ list.size());
        for(int m=0; m<=list.size()-1; m++)
        {
     //       System.out.println("m is "+m +" list.get(m) is: " +list.get(m));
            arr[m]= list.get(m);
        }
        return arr;
    }
    
    public void fun(TreeNode root)
    {
        if(root==null)
            return;
        
        else
        {
        fun(root.left);
