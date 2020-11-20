class Solution {
    public String generateTheString(int n) {
        String str="";
    
        
        if(n==1)
        {
            return "x";
            
        }
        if(n==2)
        {
            return "xy";
        }
        else
        {
        if(n%2!=0)
        {
            for(int j=0;j<n-2;j++)
              str+="x";
            
              if(n>=3)
              {
              str+="y";
              str+="z";
              }
            
        }
        else
        {
         for(int j=0;j<n-1;j++)
               str+="x";
         
             if(n>=2)
               str+="y";
            
            
        }
        }
        
