// Last updated: 11/08/2026, 14:14:26
class Solution {
    public int[][] modifiedMatrix(int[][] matrix) {
        int max=0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                max=0;
                if(matrix[i][j]==-1){
                    for(int k=0;k<matrix.length;k++){
                        if(matrix[k][j]>max){
                            max=matrix[k][j];
                        }
                    }
                    matrix[i][j] = max;
                }
            }
        }
        return matrix;
    }
}