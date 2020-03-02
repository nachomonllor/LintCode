https://www.lintcode.com/problem/valid-sudoku/description


public boolean isValidSudoku(char[][] board) {
        // write your code here
        for (int i = 0; i < board.length; i++)
        {
            HashSet<Integer> hash_fila = new HashSet();
            for (int j = 0; j < board[i].length; j++)
            {
                if (board[i][j] != '.')
                {
                    if (!hash_fila.add(board[i][j] - '0'))
                    {
                        return false;
                    }
                }
            }
        }

        for (int j = 0; j < board[0].length; j++)
        {
            HashSet<Integer> hash_col = new HashSet();
            for (int i = 0; i < board.length; i++)
            {
                if (board[i][j] != '.')
                {
                    if (!hash_col.add(board[i][j] - '0'))
                    {
                        return false;
                    }
                }
            }
        }


        for (int i = 0; i < board.length; i += 3)
        {
            for (int j = 0; j < board.length; j += 3)
            {
                HashSet<Integer> hash_region = new HashSet();
                for (int  k = i; k < i + 3; k++)
                {
                    for (int l = j; l < j + 3; l++)
                    {
                        if (board[k][l] != '.')
                        {
                            if (!hash_region.add(board[k][l] - '0'))
                            {
                                return false;
                            }
                        }
                    }
                }
            }
        }

        return true;
        
        
        
    }