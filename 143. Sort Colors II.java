public static void sortColors2(int[] colors, int k)
        {
            // write your code here
            int[] count = new int[k + 1];

            for (int i = 0; i < colors.length; i++)
            {
                count[colors[i]]++;
            }

            int indice = 0;
            for (int i = 0; i <= k; i++)
            {
                for (int j = 0; j < count[i]; j++)
                {
                    colors[indice++] = i;
                }

            }

        }
