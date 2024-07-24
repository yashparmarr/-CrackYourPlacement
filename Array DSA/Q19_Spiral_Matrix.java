class Solution {
    // https://leetcode.com/problems/spiral-matrix/
    public List<Integer> spiralOrder(int[][] matrix) {
           int n = matrix.length ;
           int m = matrix[0].length ;
           List<Integer> list = new ArrayList<>();
           int left = 0 , right = m-1 ;
           int top = 0, bottom=n-1 ;

        while(top <= bottom && left <= right){
            //top
           for(int i=left;i<=right;i++){
                list.add(matrix[top][i]);
           }
           top++ ;

           // right
           for(int i=top;i<=bottom;i++){
                list.add(matrix[i][right]);
           }
           right-- ;

           //bottom
           if(top<=bottom){
           for(int i=right;i>=left;i--){
                list.add(matrix[bottom][i]);
           }
           bottom--;
           }

           //left
           if(left<=right){
           for(int i=bottom;i>=top;i--){
                list.add(matrix[i][left]);
           }
           left++;
          }
        }
       return list ;
    }
}