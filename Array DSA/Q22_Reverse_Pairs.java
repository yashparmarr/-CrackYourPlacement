class Solution {
    // https://leetcode.com/problems/reverse-pairs/description/
    public static int divide(int[] nums,int l,int r){
        int cnt =0;
         if(l>=r){
            return cnt;
         }
        int m = l + (r-l)/2 ;
        cnt += divide(nums,l,m);
        cnt += divide(nums,m+1,r);
        cnt += count(nums,l,m,r);
        conquer(nums,l,m,r);

        return cnt ;
    }
  
    public static int count(int[] nums,int l,int m,int r){
         int cnt =0 ;
         int j = m+1 ;
         for(int i=l;i<=m;i++){
         while(j<=r && (long)nums[i] > (long)2*nums[j]){ 
               j++ ;
           }
            cnt += (j-(m+1)) ; 
         }

         return cnt ;
    }
          
    public static void conquer(int[] nums,int l,int m,int r){
            
         int[] merged = new int[r-l+1];

         int i=l;
         int j=m+1 ;
         int k = 0 ;
         while(i<=m && j<=r){
            if(nums[i] <= nums[j]){
                merged[k] = nums[i];
                i++ ;
            }else{
                merged[k] = nums[j];
                j++ ;
            }
            k++;
         }

         while(i<=m){
             merged[k] = nums[i];
             i++;
             k++;
         }

         while(j<=r){
             merged[k] = nums[j];
             j++ ;
             k++;
         }

         for(int x=0,y=l;x<merged.length;x++,y++){
             nums[y] = merged[x] ;
         }

    }
         
    public int reversePairs(int[] nums) {
         int n = nums.length;
         int l = 0 ;
         int r = n-1;
         return divide(nums,l,r);   
    }
}