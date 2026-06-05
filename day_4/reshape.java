class Solution {
    public int[][] matrixReshape(int[][] matrix, int r, int c) {
       int m = matrix.length;
       int n = matrix[0].length;
       int row=0;
       int col =0;
       if(r*c != m*n) return matrix;
       int [][] ans = new int [r][c];
       for(int i=0; i<m ; i++){
        for(int j=0; j<n ; j++){
            ans[row][col] = matrix[i][j];
            col++;
            if(col==c){
                col =0;
                row++;
            }
        }
       }
       return ans;
    }
}