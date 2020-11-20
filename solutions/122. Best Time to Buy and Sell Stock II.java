class Solution {
    public static int maxProfit(int[] prices) {
            int result=0;
            int len=prices.length-1;
        if(len==-1)
            return 0;
            int valley=0;
            int peak=0;
​
            while(valley!=len && peak !=len)
            {
                while(prices[valley]>=prices[valley+1]) {
        
                    valley++;
                    if(valley==len)
                        break;
                }
                peak=valley;
                if(peak==len)
                {}
                else {
                    while (prices[peak] <= prices[peak + 1]) {
               
                        peak++;
                        if (peak == len)
                            break;
                    }
                }
                result+=prices[peak]-prices[valley];
                valley=peak;
            }
      
            return result;
        }
}
 
