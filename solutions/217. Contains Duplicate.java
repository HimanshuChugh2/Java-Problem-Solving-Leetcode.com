class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            if(map.get(nums[i]) != null)
            {
                map.put(nums[i],2);
            }
            else
            {
            map.put(nums[i],1);
            }
        }
        
        for(Map.Entry<Integer,Integer> entr : map.entrySet())
            
        {
             if(entr.getValue()>1)
            {
                 return true;
            }
        }
          return false;
    }
}
