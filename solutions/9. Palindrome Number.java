class Solution {
    public boolean isPalindrome(int temp) {
        
    
​
        int temptemp=temp;
        int x=0;
        int newX=0;
        System.out.println(Integer.MAX_VALUE);
        if(temp>=Integer.MAX_VALUE || temp<=Integer.MIN_VALUE)
        {
            return  false;
        }
​
        else {
            if (temp < 0) {
                temp = Math.abs(temp);
​
                while (temp > 0) {
                    if (newX>Integer.MAX_VALUE/10 || newX==Integer.MAX_VALUE/10 && (temp % 10)>7 )
                        return false;
                    if (newX<Integer.MIN_VALUE/10 || newX==Integer.MIN_VALUE/10 && (temp % 10)<-8 )
                        return false;
​
                    newX = (newX * 10) + (temp % 10);
                    temp /= 10;
                }
​
            } else {
                while (temp > 0) {
                    if (newX>Integer.MAX_VALUE/10 || newX==Integer.MAX_VALUE/10 && (temp % 10)>7 )
                        return false;
                    if (newX<Integer.MIN_VALUE/10 || newX==Integer.MIN_VALUE/10 && (temp % 10)<-8 )
                        return false;
                    newX = (newX * 10) + (temp % 10);
                    temp /= 10;
                }
            }
