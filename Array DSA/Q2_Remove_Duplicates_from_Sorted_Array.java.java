class Solution {
    // https://leetcode.com/problems/remove-duplicates-from-sorted-array/
    public int removeDuplicates(int[] nums) {
        int i=0;
        int j=0;

        while(i<nums.length){
            if(i==0 || nums[i]!=nums[i-1]){
                nums[j++]=nums[i];
            }
            i++;
            
        }
        return j;

        //   int n = nums.length ;
        //   int len = 1 ;
        //   for(int i=1,k=1;i<n;i++){
        //     if(nums[i] == nums[i-1]) continue ;
        //     nums[k++] = nums[i];
        //     len++;
        //   }
        //   return len ;
    }
}