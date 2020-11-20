class Solution {
       public  int lengthOfLongestSubstring(String s)  
       {
           if(s.length()==0)
            return 0;
        int max=1;
        int maxSoFar=0;
        List<Character> list=new ArrayList<>();
        char[] chr=s.toCharArray();
        //abcabcdbb
        for(int i=0;i<s.length()-1;i++)
        {
            int j=i;
            while(!list.contains(chr[j]))
            {
                maxSoFar++;
                list.add(chr[j]);
                j++;
                if(j>=s.length())
                {
                    break;
                }
            }
​
            if(maxSoFar>max)
                max=maxSoFar;
​
            list.clear();
            maxSoFar=0;
        }
           return max;
}
}
