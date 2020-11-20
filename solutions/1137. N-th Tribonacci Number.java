class Solution {
    
    public int tribonacci(int n) {
      
          if(n<=1)
            return n;
        if(n==2)
            return 1;
        Integer[] arr =new Integer[n+1];
        arr[0]=0;
        arr[1]=1;
        arr[2]=1;
      
      
        
        helper(arr,n);
        
        return arr[n];
    }
    
    public int helper(Integer[] arr,int n )
    {
          if (n == 0 || n == 1 ) 
            return n; 
              
        if (n == 2) 
            return 1; 
        
        if(arr[n]!=null)
        {
 //         System.out.println("in memoization, n ="+n);
            return arr[n];
        }
        else
        {
        int x=  helper(arr,n-1)+ helper(arr,n-2)+ helper(arr,n-3) ;
        arr[n]=x;
        //    System.out.println("x and n are "+n+" "+x);
            return x;
         
