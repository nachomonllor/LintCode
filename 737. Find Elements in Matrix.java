 public int FindElements(int[][] Matrix) {
        // write your code here
       
        HashSet<Integer> hash = new HashSet<Integer>( );
 
        for(int i =0; i<Matrix[0].length; i++) {
            hash.add(Matrix[0][i]);
        }
        
        for (int i = 1; i < Matrix.length; i++)
        {
            HashSet<Integer> candidatos = new HashSet<Integer>();
            for (int j = 0; j < Matrix[i].length; j++)
            {
                if (hash.contains(Matrix[i][j]))
                {
                    candidatos.add(Matrix[i][j]);
                }
            }
            hash = candidatos;
        }

        return (int) hash.toArray()[0];
        
    }