/*
 Single Number (LeetCode-136)
Given a non-empty array of integers nums, every element appears twice
except for one. Find that single one.
You must implement a solution with a linear runtime complexity and use
only constant extra space.
Example 1:
Input: nums = [2,2,1]
Output: 1
Example 2:
Input: nums = [4,1,2,1,2]
Output: 4
Example 3:
Input: nums = [1]
Output: 1
Constraints:
1 <= nums.length <= 3 * 104
-3 * 104 <= nums[i] <= 3 * 104
Each element in the array appears twice except for one element which
appears only once

*/

class Solution {
    public int singleNumber(int[] nums) {
        int n=nums.length;
        // int maxRep=INTEGER.VALUE;
        int ret=0;
        for(int i =0;i<n;i++){
            int count = 0;
            for(int j= 0;j<n;j++){
                if(nums[i]==nums[j]){
                    count++;
                }
            }
            if(count==1)
            ret=nums[i];
        }
        return ret;

	
    }

    public static void main(String[] boss){
    
	  Solution obj= new Solution();
		
	  //int[] nums = new int[]{2,2,1};
	  int[] nums = new int[]{4,1,2,1,2};
	 // int[] nums = new int[]{2,2,1};
	  int ret = obj.singleNumber(nums);
	  System.out.println("single no in given array is : "+ ret);
    
    }
}
