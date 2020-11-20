class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> list=new ArrayList<>();
        for(int m=1;m<=n;m++)
        {
            
            if(m%3==0  && m%5==0 )
            {
                 list.add("FizzBuzz");
            }
                
       else if(m%3==0  )
        {
             list.add("Fizz");
​
        }
        else if(m%5==0  )
        {
             list.add("Buzz");
        }
​
        else
        {
             list.add(String.valueOf(m));
        }
​
    }
        return list;
}
}
