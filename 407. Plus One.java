 public int[] plusOne(int[] digits) {
        // write your code here
        
        int[] ans = new int[digits.length];

            ans[digits.length - 1] = (digits[digits.length - 1] + 1) % 10;
            int mellevo = ((digits[digits.length - 1] + 1) / 10) % 10;

            for (int i = digits.length - 2; i >= 0; i--)
            {
                ans[i] = (digits[i] + mellevo) % 10;
                mellevo = ((digits[i] + mellevo) / 10) % 10;
            }

            if (mellevo == 1)
            {
                //List<Integer> lista = new ArrayList();
                //lista. (0, 1);
                //return lista.ToArray();
                int[] x = new int[digits.length+1];
                x[0] = 1;
                for(int i =0; i<digits.length; i++) {
                    x[i+1] = ans[i];
                }
                return x;
            }

            return ans;
    }