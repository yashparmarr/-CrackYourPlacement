class Solution {
    public boolean isValid(String s) {
          Stack<Character> st = new Stack<>();
         
          for(int i=0;i<s.length();i++ ){
              char c = s.charAt(i);
              if(c == '(' || c=='{' || c=='['){
                 st.push(c);
              }else{
                if(st.empty()) return false ;
                char a = st.pop();
                if((c==')' && a=='(') || (c=='}' && a=='{') || (c==']' && a=='[')) continue ;
                else return false ;

              }
          }

           if(st.empty()) return true ;
           else return false ;
    }
}