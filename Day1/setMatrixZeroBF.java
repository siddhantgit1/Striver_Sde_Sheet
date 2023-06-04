class Solution {
    public void setZeroes(int[][] matrix) {
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                if(matrix[i][j] == 0){
                    //mark whole ith row as -1
                    markrow(matrix, i);
                    //mark whole jth col as -1
                    markcol(matrix, j);
                }
            }
        }

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                if(matrix[i][j] == -1){
                    //make them 0
                    matrix[i][j] = 0;
                }
            }
        }
        
    }

     static void markrow(int[][] matrix, int i){
        for(int j = 0; j < matrix[0].length; j++){
            if(matrix[i][j] != 0){
                matrix[i][j] = -1;
            }
        }
    }
     static void markcol(int[][] matrix, int j){
        for(int i = 0; i < matrix.length; i++){
            if(matrix[i][j] != 0){
                matrix[i][j] = -1;
            }
        }
    }
}
