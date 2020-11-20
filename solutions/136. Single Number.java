class Solution {
  public static int singleNumber(int[] nums) {
        List<Integer> list=new ArrayList<>();
​
        for(int i=0;i<nums.length;i++)
        {
            int listNum=nums[i];
            if(list.contains(listNum))
            {
        //        System.out.println("removing" + listNum);
                listNum= list.indexOf(listNum);
         //       System.out.println("listNum/ indexOfListNum is" + listNum);
                list.remove(listNum);
            }
            else
            {
         //       System.out.println("adding "+ listNum);
                list.add(listNum);
            }
        }
       // System.out.println("answer is "+list.get(0));
        return list.get(0);
​
    }
}
