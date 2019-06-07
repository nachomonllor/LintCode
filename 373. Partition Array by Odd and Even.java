public int[] partitionArray(int[] nums) {
        // write your code here
        
        if(nums == null || nums.length == 0) return nums;
        
        for (int i = nums.length - 1; i > 0; i--)
        {
            int indice = i;
            while (indice < nums.length && nums[indice - 1] % 2 ==0 && nums[indice] % 2 != 0)
            {
                int temp = nums[indice - 1];
                nums[indice - 1] = nums[indice];
                nums[indice] = temp;
                indice++;
            }
        }
        return nums;
    }