public class Solution {
    /*
     * @param nums: a list of integers
     * @return: The majority number that occurs more than 1/3
     */
    public int majorityNumber(List<Integer> nums) {
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
            if(hash.get(nums.get(i)) > size / 3.0){
                  return nums.get(i);
            }
        }
        
    
        return -1;
        
        
    }
}
