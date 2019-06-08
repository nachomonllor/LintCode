 public String addStrings(String a, String b) {
        // write your code here
        
         String c = "";

            int mellevo = 0;

            int i = a.length() - 1, j = b.length() - 1;

            while (i >= 0 && j >= 0)
            {
                int res = Integer.parseInt(a.charAt(i)+"") + Integer.parseInt(b.charAt(j)+"") + mellevo;

                //c.Insert(0, res % 10);
               // c = c.(0, (res % 10).ToString());
                c = ((res%10)+"")+c;
                if (res > 9)
                {
                    mellevo = res / 10;
                }
                else
                {
                    mellevo = 0;
                }
                i--;
                j--;
            }

            while (i >= 0)
            {
                int res = Integer.parseInt(a.charAt(i)+"") + mellevo;

                c = ((res%10)+"")+c;
                if (res > 9)
                    mellevo = res / 10;
                else
                    mellevo = 0;

                i--;
            }

            while (j >= 0)
            {
                int res = Integer.parseInt(b.charAt(j)+"") + mellevo;
                c = ((res%10)+"")+c;

                if (res > 9)
                    mellevo = res / 10;
                else
                    mellevo = 0;
                j--;
            }

            if (mellevo > 0)
            {
                c = ((mellevo)+"")+c;
            }


            return c;
        
    }
}