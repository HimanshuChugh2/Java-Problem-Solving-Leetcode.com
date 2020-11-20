class Solution {
     int x=Integer.MIN_VALUE,y=0;
    public   int lastStoneWeight(int[] stones) {
        if(stones.length==1)
        {
            return stones[0];
        }
        List<Integer> list=new ArrayList<>();
         for(int m: stones)
        {
             list.add(m);
        }
        //2,7,4,1,8,1
​
​
​
        for(int j=0;j<stones.length;j++)
        {
 
            setXy(list);
            if(x==y)
            {
 
                list.remove(list.indexOf(y));
                list.remove(list.indexOf(x));
            }
            else if(x>y)
            {
 
                list.add(x-y);
                list.remove(list.indexOf(y));
                list.remove(list.indexOf(x));
            }
             if(list.size()==0)
            {
                return 0;
            }
