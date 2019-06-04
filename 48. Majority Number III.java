public int majorityNumber(List<Integer> nums, int k) {
        // write your code here
        HashMap<Integer, Integer> hash = 
                new HashMap();
        double size = (double) nums.size();
        for(int i =0; i<nums.size(); i++) {
            if(hash.containsKey(nums.get(i) )) {
                hash.put(nums.get(i), hash.get(nums.get(i)) + 1);
            }
            else{
                hash.put(nums.get(i), 1);
            }
            if(hash.get(nums.get(i)) > size /(double)k){
                  return nums.get(i);
            }
        }
        
    
        return -1;
        
    }