class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> result=new ArrayList<>();
     
        for(int i=0;i<nums1.length;i++)
        {
            for(int j=0;j<nums2.length;j++)
            {
                if(nums1[i]==nums2[j]  && !result.contains(nums1[i]))
                {
                    result.add(nums1[i]);
                }
                
            }
            
        }
        int[] resultarr=new int[result.size()];
        for(int m=0;m<result.size();m++)
        {
       //     System.out.println(result.get(m));
            resultarr[m]=result.get(m);
        }
        
         
        return resultarr;
        
    }
}
