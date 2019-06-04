 public static  void sortLetters(char[] chars)
        {
            // write your code here
            int[] count = new int[52];
            for (int i = 0; i < chars.length; i++)
            {
                if (chars[i] >= 'a' && chars[i] <= 'z') count[chars[i] - 'a']++;
                else count[chars[i] - 'A' + 26]++;
            }

            int k = 0;
            for (int i = 0; i < 52; i++)
            {
                if (i < 26) for (int j = 0; j < count[i]; j++) chars[k++] = (char)(i + 'a');
                else for (int j = 0; j < count[i]; j++) chars[k++] = (char)(i - 26 + 'A');
            }

            //Console.WriteLine(new string(chars));

        }