/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;
​
    public Node() {}
​
    public Node(int _val) {
        val = _val;
    }
​
    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/
class Solution {
    public List<Integer> preorder(Node root) {
        List<Integer> toReturn = new ArrayList<>();
        if(root==null)
            return toReturn;
        
        if(root.children==null)
        {
            toReturn.add(root.val);
            return toReturn;
        }
       
        Stack<Node> stack=new Stack<>();
        stack.push(root);
        
        while(stack.size()!=0)
        {
            Node pop=stack.pop();
            toReturn.add(pop.val);
             Stack<Node> newstack= new Stack<>();
            for(Node m : pop.children)
            {
                newstack.push(m);
            }
            while(newstack.size()!=0)
            {
                stack.push(newstack.pop());
            }
            
        }
        
        return toReturn;
    }
}
