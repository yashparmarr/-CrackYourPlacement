class Solution {
    // https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
    public int maxProfit(int[] prices) {
        int maxprofit = 0 ;
        int n=prices.length ;
        int mini = prices[0] ;

        for(int i=1;i<n;i++){
             int cost = prices[i]-mini ;    
             maxprofit = Math.max(maxprofit,cost);
             mini = Math.min(mini,prices[i]);
        }
        return maxprofit ;
    }
}