// Last updated: 11/08/2026, 14:19:43
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(target==matrix[i][j])
                    return true;
            }
        }
        return false;
    }
}