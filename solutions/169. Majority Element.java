class Solution {
    
    public int majorityElement(int[] nums) 
    {
        int maxSoFar=0;
        int maxCurr=0;
        int majEle=0;
       
        for (int i=0;i<nums.length;i++)
        {
             
            if (maxSoFar<maxCurr) {
                maxSoFar = maxCurr;
                majEle=i-1;
                if(maxSoFar>=(nums.length/2))
             //       System.out.println("returning majEle");
                {return nums[majEle];}
           
            }
            maxCurr=0;
​
            for (int j=0;j<nums.length;j++) {
                if (i == j ) {
                } else {
                    if (nums[i] == nums[j]) {
                        maxCurr++;
                    }
                }
            }
        }
     
return nums[majEle];
        
    }    
    }
