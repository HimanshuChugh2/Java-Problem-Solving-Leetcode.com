class MinStack {
​
    /** initialize your data structure here. */
       List<Integer> stack=new ArrayList<>();
​
    public MinStack() {
        
    }
    
    public   void push(int x) {
​
        stack.add(x);
    }
​
    public   void pop() {
    stack.remove(stack.size()-1);
    }
 
    public   int top() {
    return stack.get(stack.size()-1);
    }
​
    public   int getMin() {
        int min=Integer.MAX_VALUE;
        for (int m:
             stack) {
            if(m<min)
                min=m;
        }
        return min;
    }
    }
​
​
/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
