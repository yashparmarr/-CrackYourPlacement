class Solution {
    public String intToRoman(int num) {
        String roman = "" ;
        String str[] = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"} ;
        int arr[] = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        
        for(int pos=0;num>0;pos++){
            if(num ==0 ) break ;

            int time = num/arr[pos] ;
            while(time>0){ 
              roman += str[pos];
              time-- ;
            }
           num = num%arr[pos];
        }
        return roman ;
    }
}