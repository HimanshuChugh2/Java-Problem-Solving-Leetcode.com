class Solution {
     public static int search(int[] nums, int target) {
​
         int lenBy2=nums.length/2;
         int first=0;
         int last=nums.length;
         for (int i=0;i<nums.length;i++)
         {
             if (target>nums[lenBy2])
             {
                 first=lenBy2;
                 lenBy2=((lenBy2+last)/2);
​
             }
             else if(target<nums[lenBy2])
             {
                 last=lenBy2;
                 lenBy2=((lenBy2+first)/2);
​
​
             }
             else if (target==nums[lenBy2])
             {
                 System.out.println("found on index= "+ lenBy2);
                 return lenBy2;
             }
​
         }
​
        return -1;
    }
}
