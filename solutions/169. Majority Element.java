class Solution {
    
    public int majorityElement(int[] nums) 
    {  
        int len=nums.length/2;
        int maxCurr=0;
        int majEle=0;
       
        for (int i=0;i<nums.length;i++)
        {    
                 maxCurr=0;
                 for (int j=0;j<nums.length;j++) {
                    if (i == j ) {
                    } else {
                        if (nums[i] == nums[j]) {
                            maxCurr++;
                            if(maxCurr>=len)
                            {
                                 return nums[i];}
                        }
                    }
                }
        }
    return nums[majEle];
    }
    }
     
​
 
        
        
    
​
