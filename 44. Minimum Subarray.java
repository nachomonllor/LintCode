public class Solution {
    /*
     * @param nums: a list of integers
     * @return: A integer indicate the sum of minimum subarray
     */
    public int minSubArray(List<Integer> nums) {
        // write your code here
         int min_sum = nums.get(0);
         int sum = nums.get(0);
         for(int i =1; i<nums.size(); i++) {
              sum = Math.min(nums.get(i), sum + nums.get(i));
              min_sum = Math.min(min_sum, sum);
         }
         return min_sum;
    }
}
