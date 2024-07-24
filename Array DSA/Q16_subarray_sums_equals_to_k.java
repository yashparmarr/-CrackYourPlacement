class Solution {
    public int subarraySum(int[] nums, int k) {
         int ans = 0 ;
         HashMap<Integer,Integer> m = new HashMap<>();
         int sum = 0 ;
         
         m.put(0,1);
         for(int i=0;i<nums.length;i++){
             sum += nums[i];
             int rsum = sum - k ;
             if(m.containsKey(rsum)){
                 ans += m.get(rsum);
             }
              m.put(sum,m.getOrDefault(sum,0)+1);
            }
           return ans ;
    }
}