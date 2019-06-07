#include <iostream>
#include <stdio.h>
#include <limits.h>
#include <vector>

using namespace std;

int secondMax(vector<int> &nums) {
        // write your code here
        
    int primero = nums[0];
    int segundo = INT_MIN;
    for (int i = 1; i < nums.size(); i++)
    {
        if (nums[i] >= primero)
        {
            segundo = primero;
            primero = nums[i];
        }
        else if (nums[i] >= segundo && nums[i] <= primero)
        {
            segundo = nums[i];
        }
    }
    return segundo;
}

int main() {
	
	
	
	
	return 0;
}