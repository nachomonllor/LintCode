int maxSubArray(vector<int> &nums) {
    // write your code here
    int m = nums[0];
    int actual = nums[0];
    for(int i = 1; i < nums.size(); i++) {
    	//int actual = nums[i]	
    	actual = max(nums[i], actual + nums[i]);
    	m = max(m, actual);
	}
    return m;
}
