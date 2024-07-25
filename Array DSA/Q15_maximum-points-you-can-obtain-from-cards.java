class Solution {
    // https://leetcode.com/problems/maximum-points-you-can-obtain-from-cards/
    public int maxScore(int[] cardPoints, int k) {
        int s = 0, n = cardPoints.length;
        for (int i = n - k; i < n; ++i) {
            s += cardPoints[i];
        }
        int ans = s;
        for (int i = 0; i < k; ++i) {
            s += cardPoints[i] - cardPoints[n - k + i];
            ans = Math.max(ans, s);
        }
        return ans;


        //   int left = 0; 
        //   int n = cardPoints.length ;
        //   int lsum = 0 , rsum = 0,maxsum = 0;
        //   for(int i=0;i<k;i++)
        //     lsum += cardPoints[i];
        //     maxsum = lsum ;
         
        //    int right = n-1;
        //   for(int i=right;i>=0;i--){
        //       lsum = lsum - cardPoints[i];
        //       rsum = rsum + cardPoints[right];
        //       right = right -1 ;
        //       maxsum = Math.max(maxsum ,lsum+rsum);
        //   }
        //    return maxsum;
    }
}