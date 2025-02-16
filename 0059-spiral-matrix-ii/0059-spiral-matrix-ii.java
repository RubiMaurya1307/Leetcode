class Solution {
    public int[][] generateMatrix(int n) {
         int mat[][]=new int[n][n]; // output matrix
         int startRow=0;
         int endRow=n-1;
         int startCol=0;
         int endCol=n-1;
         int k=1; // to fill the matrix, a global var for this fnc

         while(startRow<=endRow && startCol<=endRow){
            // top row fill

            for(int i=startCol;i<=endCol;i++){
                mat[startRow][i]=k;
                k++; // keep updating k always
            }

            // rightCol fill

            for(int i=startRow+1;i<=endRow;i++){
                
                mat[i][endCol]=k;
                k++;
            }

            // bottom row filling

            for(int i=endCol-1;i>=startCol;i--){
                if(startRow==endRow){
                    break;
                }
                mat[endRow][i]=k;
                k++;
            }


            // leftcol filling

            for(int i=endRow-1;i>startRow;i--){
                if(startCol==endCol){
                    break;
                }

                mat[i][startCol]=k;
                k++;
            }

            startRow++;
            endRow--;
            startCol++;
            endCol--;
         }

         return mat; 
        
    }
}