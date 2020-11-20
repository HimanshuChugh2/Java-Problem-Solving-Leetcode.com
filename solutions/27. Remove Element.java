class Solution {
    public int removeElement(int[] arr, int element) {
         {                                               //0,1,2,2,3,0,4,2
        int j=0;
​
        for (int i=0;i<arr.length;i++)
        {
         if (arr[i]!=element)
         {
             arr[j]=arr[i];
             j++;
         }
         else {}
        }
        return j;
    }
    }
}
