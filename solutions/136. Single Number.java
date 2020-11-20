class Solution {
  public static int singleNumber(int[] nums) {
        List<Integer> list=new ArrayList<>();
​
        for(int i=0;i<nums.length;i++)
        {
            int listNum=nums[i];
            if(list.contains(listNum))
            {
                 listNum= list.indexOf(listNum);
                 list.remove(listNum);
            }
            else
            {
                 list.add(listNum);
            }
        }
         return list.get(0);
​
    }
}
