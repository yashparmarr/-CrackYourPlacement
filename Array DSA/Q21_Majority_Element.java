class Solution {
    // https://leetcode.com/problems/majority-element/
    public int majorityElement(int[] nums) {
        int n = nums.length ;
        if(n==1){
            return nums[0];
        }
         int count =0 ;
         int el =0;

         for(int i=0;i<n;i++){
             if(count == 0){
                count = 1 ;
                el = nums[i];
             }else if(nums[i] == el){
                count++ ;
             }else{
                count-- ;
             }
         }
        int count1 = 0;
        for(int i=0;i<n;i++){
            if(nums[i] == el ){
                count1++ ;
            }
        }
        if(count1 > n/2){
            return el ;
        }
      return -1 ;
        //  Arrays.sort(nums);
        //  if(n==1){
        //     return nums[0];
        //  }
        //  for(int i=0;i<n-1;i++){
        //     if(nums[i] == nums[i+1]){
        //         count++ ;
        //     }else{
        //          count =0 ;
        //     }

        //     if(count >= n/2){
        //         return nums[i];
        //     }
        //  }
        //  return -1 ;
    }
}