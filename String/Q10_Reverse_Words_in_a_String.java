class Solution {
    //https://leetcode.com/problems/reverse-words-in-a-string/
    public String reverseWords(String s) {
           int i = s.length()-1;
           String ans ="";
           int j=0;
           while(i>=0){

              while(i>=0 && s.charAt(i) == ' ') i-- ;
              j=i ;
              if(i<0) break ;
              while(i>=0 && s.charAt(i) != ' ') i-- ;

              if(ans.isEmpty()){
                 ans = ans.concat(s.substring(i+1,j+1));
              }else{
                 ans = ans.concat(" " +s.substring(i+1,j+1));
              } 
        }
          return ans ;
    }
}