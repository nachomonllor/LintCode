public static boolean nextPermutation(int[] array)
        {
            // Find non-increasing suffix
            int i = array.length - 1;
            while (i > 0 && array[i - 1] >= array[i])
                i--;
            if (i <= 0)
                return false;

            // Find successor to pivot
            int j = array.length - 1;
            while (array[j] <= array[i - 1])
                j--;
            int temp = array[i - 1];
            array[i - 1] = array[j];
            array[j] = temp;

            // Reverse suffix
            j = array.length - 1;


            while (i < j)
            {
                temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }

            return true;

        }

        public static List<List<Integer >> permute(int[] nums)
        {
            // write your code here
            Arrays.sort(nums);
            List<List<Integer>> ans = new ArrayList();
            do
            {
                List<Integer> fila = new ArrayList();
                for (int i = 0; i < nums.length; i++)
                {
                    //Console.Write(nums[i] + " ");
                    fila.add(nums[i]);
                }
                //Console.WriteLine();
                ans.add(fila);
            } while (nextPermutation(nums));

            return ans;
        }