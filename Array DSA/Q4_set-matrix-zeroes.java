class Solution {
    // https://leetcode.com/problems/set-matrix-zeroes/
    public void setZeroes(int[][] matrix) {
         
         int n = matrix.length ;
         int m = matrix[0].length ;

        boolean firstRow = false , firstCol = false ;
       // set markers in firstRow and firstCol
        for(int row=0;row<n;row++){
            for(int col=0;col<m;col++){
                if(matrix[row][col]==0){
                    if(row==0) firstRow = true ;
                    if(col==0) firstCol = true ;
                    matrix[0][col] = 0 ;
                    matrix[row][0] = 0 ;
                }
            }
        }
       // replce inner matrix
        for(int row=1;row<n;row++){
            for(int col=1;col<m;col++){
                 if(matrix[0][col] == 0 || matrix[row][0] == 0){
                     matrix[row][col] = 0 ;
                 }
            }
        }
        
        //last remaining checks
        if(firstRow){
             for(int col =0;col<m;col++){
                 matrix[0][col] = 0 ;
             }
        }

        if(firstCol){
            for(int row =0;row<n;row++){
                matrix[row][0] =0 ;
            }
        }

    // brute
    //     if(n==1&&m==1) return;

    //      for(int row=0;row<n;row++){

    //         for(int col=0;col<m;col++){
    //             if(n==1){
    //                 matrix[0][col] =0 ;
    //             }else if(m==1){
    //                 matrix[row][0] =0 ;
    //             }else if(n==1 && m==1){
    //                 if(matrix[0][0] == 0){
    //                      matrix[0][0] = 0 ;
    //                 }else{
    //                     continue ;
    //                 }
    //             }else{
    //             if(matrix[row][col] == 0){
    //                 int a =row,b=col ;
    //                  for(int i=0;i<n;i++){
    //                     if(matrix[i][b] != 0){
    //                     matrix[i][b] = -1 ;
    //                  }else{
    //                      continue ;
    //                  }
    //                  for(int j=0;j<m;j++){
    //                     if(matrix[a][j] != 0){
    //                     matrix[a][j] = -1 ;
    //                  }else{
    //                     continue ;
    //                  }
    //                  }
    //             }
    //         }
    //      }
    //     }
    // }
    //        for(int i=0;i<n;i++){
    //         for(int j=0;j<m;j++){
    //             if(matrix[i][j] == -1){
    //                 matrix[i][j] = 0;
    //             }else{
    //                 continue ;
    //             }
    //         }
    //        }
  }
}