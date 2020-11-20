class Solution {
     public static int firstUniqChar(String s) {
        HashMap<String,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            if(map.containsKey(String.valueOf(s.charAt(i))))
            {
                map.put(String.valueOf(s.charAt(i)),2);
            }
            else
            {
                map.put(String.valueOf(s.charAt(i)),1);
            }
        }
​
//         for(int x:map.values())
//         {
//             System.out.print(x);
​
//         }
​
         for(int x=0;x<s.length();x++) {
             String xx=String.valueOf(s.charAt(x));
             int mapget=map.get(xx);
             if ( mapget== 1) {
                 return s.indexOf(s.charAt(x));
             }
         }
        return -1;
    }
}
