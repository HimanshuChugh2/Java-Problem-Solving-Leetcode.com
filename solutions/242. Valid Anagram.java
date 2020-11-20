public class Solution {
    public boolean isAnagram(String s, String t) {
        
        
        
        // did it one day after watching nick white
        int[] arr=new int[26];
        int len=s.length();
        if(len!=t.length()){
            return false;
        }
        for(int i=0;i<len;i++)
        {
            arr[s.charAt(i)-'a']++;
            arr[t.charAt(i)-'a']--;
        }
        
        
        for(int j=0;j<arr.length;j++)
        {
            if(arr[j]!=0)
            {
                return false;
            }
            
        }
        
     return true;   
    } 
    }
​
