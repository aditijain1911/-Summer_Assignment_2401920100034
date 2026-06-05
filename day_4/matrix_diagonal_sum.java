public class matrix_diagonal_sum {
    public int ans(int[][] mat){
        int m = mat.length;
        int n = mat[0].length;
        int s=0;
        int start=0;
        int end = mat.length-1;
        for(int i=0; i<m; i++){
            if(start==end){
                s+=mat[i][start];
            }
            else{
                s+=mat[i][start] + mat[i][end];

            }
            start++;
            end--;
        }
        return s;
    }
    public static void main(String[] args){
        int [][] mat =  {{1,2,3},{4,5,6},
              {7,8,9}};
              int ans = new matrix_diagonal_sum().ans(mat);
              System.out.println(ans);
    }
}
