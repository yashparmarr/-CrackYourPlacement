class Solution {
    // https://leetcode.com/problems/generate-parentheses/
    static void check(int n,int open,int close,List<String> list,String currstr){
        if(currstr.length() ==n*2){
             list.add(currstr);
             return ;
        }
        if(open<n){
             check(n,open+1,close,list,currstr+"(");
        }
        if(close<open){
             check(n,open,close+1,list,currstr+")");
        }
    }
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<String>();

          int open = 0;
          int close = 0 ;
          check(n,open,close,list,"");
          return list ;
    }
}