class Solution {
    public void reverseString(char[] s) {
        
        int len=s.length;
        len--;
        for(int i=0;i<s.length/2; i++)
        {
            char x=s[i];
            s[i]=s[len];
            s[len]=x;
            len--;
        }
        
    }
}
