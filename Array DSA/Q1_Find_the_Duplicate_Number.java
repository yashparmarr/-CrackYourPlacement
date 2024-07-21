class Solution {
    //https://leetcode.com/problems/find-the-duplicate-number/
    public int findDuplicate(int[] nums) {
        //optimized 
          int slow = 0 ;
         int fast = 0 ;
         do{
            slow = nums[slow];
            fast = nums[nums[fast]] ;
         }while(slow != fast);

          slow = 0;
         while(slow!=fast){
            slow = nums[slow];
            fast = nums[fast];
         }
      return slow ;

    //      int slow = nums[0] ;
    //      int fast = nums[0] ;
    //      do{
    //         slow = nums[slow];
    //         fast = nums[nums[fast]] ;
    //      }while(slow != fast);

    //      fast = nums[0];
    //      while(slow!=fast){
    //         slow = nums[slow];
    //         fast = nums[fast];
    //      }
    //   return slow ;
        //better approach
        // int n= nums.length ;
        //  int[] arr = new int[n] ;
        //  for (int i = 0; i < n; i++) {
        //         arr[i] = 0;
        //   }

        //  for(int i=0;i<n;i++){
        //     arr[nums[i]] ++ ;
        //  }
        //   int x = 0;
        //  for(int i=0;i<n;i++){
        //      if(arr[i] > 1){
        //         x=i ;
        //         break ;
        //      }else{
        //         continue ;
        //      }
        //  }
        // return x ;
    }
}
