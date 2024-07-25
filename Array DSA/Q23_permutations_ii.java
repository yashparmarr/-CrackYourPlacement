class Solution {
    // https://leetcode.com/problems/permutations-ii/
    public List<List<Integer>> permuteUnique(int[] nums) {
         List<List<Integer>> ansList = new ArrayList<>();
         Arrays.sort(nums);
         boolean used[] = new boolean[nums.length] ;
        backtrack(ansList,new ArrayList<>(), nums ,used);
           return ansList ;
    }

    public void backtrack(List<List<Integer>> ansList,ArrayList<Integer> tempList,int nums[],boolean[] used){
           if(tempList.size()== nums.length && !ansList.contains(tempList)){
               ansList.add(new ArrayList<>(tempList));
               return ;
           }

           for(int i=0;i<nums.length;i++){
             if(used[i]) continue ;

             used[i] = true ;

             tempList.add(nums[i]);
             backtrack(ansList,tempList,nums,used);
             used[i] = false ;
             tempList.remove(tempList.size()-1);
           }
    }
}