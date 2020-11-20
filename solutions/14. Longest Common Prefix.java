class Solution {
    public String longestCommonPrefix(String[] arr) {
         if (arr.length<=0)
        {
            return "";
        }
        char[] result = arr[0].toCharArray();
        String tempResult="";
        for (int i = 1; i < arr.length; i++) {
​
        char[] match = arr[i ] != null ? arr[i].toCharArray() : null;
        if (match==null)
        {
           return String.valueOf(result);
        }
        for (int j=0;j<result.length && j<match.length;j++)
            {
​
                    if (result[j] == match[j]) {
                        tempResult += result[j];
                    }
                    else
                    {
                        break;
                    }
                }
            
            result=tempResult.toCharArray();
            tempResult="";
            }
        return String.valueOf( result);
    }
}
