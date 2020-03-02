public class Solution {
    /**
     * @param matrix: A lsit of lists of integers
     * @return: nothing
     */
    public void setZeroes(int[][] matrix) {
        // write your code here
        
           //if(matrix == null ) return matrix;
           
           if(matrix != null && matrix.length != 0) {
         
           boolean[] filas = new boolean[matrix.length];
            boolean[] cols = new boolean[matrix[0].length];

            for (int i = 0; i < matrix.length; i++)
            {
                for (int j = 0; j < matrix[i].length; j++)
                {
                    if (matrix[i][j] == 0)
                    {
                        filas[i] = true;
                        cols[j] = true;
                    }
                }
            }


            for (int i = 0; i < matrix.length; i++)
            {
                for (int j = 0; j < matrix[i].length; j++)
                {
                    if (filas[i] || cols[j])
                    {
                        matrix[i][j] = 0;
                    }
                }
            }
        }
        
    }
}