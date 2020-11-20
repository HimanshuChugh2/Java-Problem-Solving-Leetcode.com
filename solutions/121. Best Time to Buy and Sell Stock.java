class Solution {
    public int maxProfit(int[] prices) {
             if(prices.length<=0)
             {return 0;}
            int minSoFar = Integer.MAX_VALUE;
            for (int i = 0; i < prices.length; i++) {
                for (int j = i; j < prices.length; j++) {
                    if (prices[i] - prices[j] < minSoFar) {
                        minSoFar = prices[i] - prices[j];
                    }
                }
            }
            return Math.abs(minSoFar);
        
    }
}
