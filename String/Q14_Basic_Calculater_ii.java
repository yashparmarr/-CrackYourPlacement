class Solution {
    // https://leetcode.com/problems/basic-calculator-ii/
    public int calculate(String s) {
        Stack<Integer> stack = new Stack<>();
        char operation = '+' ;
        int currentNumber = 0 ;
       for(int i=0;i<s.length();i++){
         char ch = s.charAt(i);
         if(Character.isDigit(ch)){
             currentNumber = (currentNumber*10)+(ch-'0');
         }
         if(!Character.isDigit(ch) && !Character.isWhitespace(ch) || i == s.length()-1){
             if(operation == '-'){
                stack.push(-currentNumber);
             }else if(operation == '+'){
                stack.push(currentNumber);
             }else if(operation == '*'){
                stack.push(stack.pop()*currentNumber); 
             }else if(operation == '/'){
                stack.push(stack.pop()/currentNumber); 
             }
              operation =  ch ;
              currentNumber = 0 ;
         }
       }
         int result =0;
         while(!stack.isEmpty()){
            result += stack.pop();
         }
       return result ;
    }
}