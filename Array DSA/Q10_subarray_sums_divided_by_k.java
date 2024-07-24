class Solution {
    // https://leetcode.com/problems/subarray-sums-divisible-by-k/
    public int subarraysDivByK(int[] nums, int k) {
        int ans = 0 ;
        HashMap<Integer,Integer> m = new HashMap<>();
        int sum = 0 ;
        int rem = 0 ;
        m.put(0,1); // zero is remainder and 1 is its frequency

        for(int i=0;i<nums.length;i++){
            sum += nums[i] ; 
            rem = sum%k ;
            if(rem < 0) {
                rem += k ;
            }
            if(m.containsKey(rem)){
                ans += m.get(rem);
                m.put(rem,m.get(rem)+1);
            }else{
                m.put(rem,1);
            }
        }
        return ans ;
    }
}