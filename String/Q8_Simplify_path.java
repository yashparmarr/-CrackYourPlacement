class Solution {
    // https://leetcode.com/problems/simplify-path/
    public String simplifyPath(String path) {
        StringBuilder respath = new StringBuilder();
        Stack<String> st = new Stack<>();
        String [] p = path.split("/");

        for(int i=0;i<p.length;i++){
         if(!st.isEmpty() && p[i].equals("..")){
             st.pop() ; 
             }
         else if(!p[i].equals("") && !p[i].equals(".") && !p[i].equals(".."))
            st.push(p[i]) ;  
        }

        if(st.isEmpty()) return "/" ;
        while(!st.isEmpty()){
            respath.insert(0,st.pop()).insert(0,"/") ;
        }

        return respath.toString() ;        
    }
}