class Solution {
    public int removeDuplicates(int[] nums) {
        int j=0;
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i+1]>nums[i]) 
            {
                j++;
                nums[j]=nums[i+1];
                //System.out.println(nums[j]);
                
            }
            
        }
        
         
        return ++j;
    }
}
