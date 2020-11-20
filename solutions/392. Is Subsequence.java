class Solution {
    public static boolean isSubsequence(String s, String t) {
        char[] sChar=s.toCharArray();
        char[] tChar=t.toCharArray();
​
        String match="";
int count=-1;
        for (int i=0;i<s.length();i++) {
​
            for (int j=count+1;j<t.length();j++) {
                if (sChar[i]==tChar[j])
                {
                    match=match+sChar[i];
                    count=j;
                    break;
                }
            }
        }
        System.out.println(match);
        System.out.println(s);
        if(match.equals(s)) {
            return true;
        }
        else
            return false;
    }
}
