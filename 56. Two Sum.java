 public static int[] twoSum(int[] numbers, int target)
        {

            
            HashMap<Integer, Integer> hash = new HashMap<Integer, Integer>();

            for (int i = 0; i < numbers.length; i++)
            {
                if (hash.containsKey(target - numbers[i]))
                {
                    int[] r = new int[]{i, hash.get(target- numbers[i])};
                    Arrays.sort(r);
                    return r;
                }
                hash.put(numbers[i], i);
            }

            return new int[] { -1, -1 };

        }