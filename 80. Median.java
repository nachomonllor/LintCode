 public int median(int[] nums) {
        // write your code here
        
        int n = nums.length; 
        Arrays.sort(nums); 
         if(nums.length % 2 == 0){
            return nums[nums.length / 2 - 1];
        }

        return nums[nums.length / 2];
      
        
    }