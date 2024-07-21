class Solution {
    // https://leetcode.com/problems/two-sum/
    public int[] twoSum(int[] nums, int target) {  
        Map<Integer,Integer> mp = new HashMap<>();
        int n = nums.length ;
        
        for(int i=0;i<n;i++)
        {
                int x = target-nums[i] ;
            if(mp.containsKey(x))
            {
                return new int[] {mp.get(x),i} ;
            }else
            {
                mp.put(nums[i],i);
            }
                    
        }
      return new int[] {};   
    }
//         for(int i=0;i<n;i++)
//         {    for(int j=i+1;j<n;j++)
//             {  
//                 int x= target-nums[i] ;
                
//                 if(nums[j] == x)
//                 {
//                    return new int[] {i,j} ;             
//                 }         
//             }
//          } 
//           return new int[] {} ;
//     }
}  