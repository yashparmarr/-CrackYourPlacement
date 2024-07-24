class Solution {
    // https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/
    public int maxProfit(int[] prices) {
           int maxProfit =0 ;
         
         for(int i=0;i<prices.length-1;i++){
                if(prices[i+1] > prices[i]){
                    maxProfit = maxProfit + prices[i+1] - prices[i] ;
                }
           } 
           return maxProfit;


        //    for(int i=1;i<prices.length;i++){
        //         int buyprices = prices[i-1];
        //        int  profit = prices[i] - buyprices ;
        //        if(profit < 0){
        //           profit = 0 ;
        //        }  
        //        maxProfit = maxProfit + profit ;
        //    } 
        //    return maxProfit;
    }
}