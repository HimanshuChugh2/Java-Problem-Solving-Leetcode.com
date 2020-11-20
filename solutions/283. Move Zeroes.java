class Solution {
    
    //i did this, the below one is with two pointers 0MS
    public void moveZeroes(int[] nums) {
        int len=nums.length-1;
         for(int i=0;i<len;i++)
        {
             if(nums[i]==0)
            {
                for(int j=i;j<nums.length-1;j++)
                {
                     nums[j]=nums[j+1];
                }
                nums[len]=0;
                len--;
                i--;
             }
        }
    }
//     public void moveZeroes(int[] nums) {
​
//     int j = 0;
//     for(int i = 0; i < nums.length; i++) {
//         if(nums[i] != 0) {
//             int temp = nums[j];
//             nums[j] = nums[i];
//             nums[i] = temp;
//             j++;
//         }
//     }
// }
}
