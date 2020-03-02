public int findMissing(int[] nums) {
        
        HashSet<Integer> hash = new HashSet();
        int max =0;
        for(int i =0; i<nums.length; i++) {
            hash.add(nums[i]);
            max = Math.max(max, nums[i]);
        }
        
        for(int i =0; i<=max; i++) {
            if(!hash.contains(i)) return i;
        }
        return max + 1; 
        
    }