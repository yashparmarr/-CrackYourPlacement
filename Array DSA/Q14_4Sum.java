class Solution {
    //https://leetcode.com/problems/4sum/
    public List<List<Integer>> fourSum(int[] nums, int target) {
        
        int n = nums.length;
        Set<List<Integer>> set = new HashSet<>();

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
               Set<Long> hashset = new HashSet<>();
                 for(int k=j+1;k<n;k++){
                    List<Integer> temp = new ArrayList<Integer>();
                       long sum = nums[i] + nums[j] ;
                       sum += nums[k] ;
                       long fourth = target - sum ;
                       if(hashset.contains(fourth)){
                       temp.add(nums[i]);
                       temp.add(nums[j]);
                       temp.add(nums[k]);
                       temp.add((int) fourth);
                       temp.sort(Integer::compareTo);
                       set.add(temp);
                      }

                       hashset.add((long) nums[k]) ;
            }
          }
        }

        List<List<Integer>> ans = new ArrayList<>(set);
        return ans ;
    }
}