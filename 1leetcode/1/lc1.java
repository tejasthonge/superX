/*
 
  Two Sum (LeetCode 1)
Given an array of integers nums and an integer target, return indices of the two
numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use
the same element twice.
You can return the answer in any order.
Example 1:
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:
Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:
Input: nums = [3,3], target = 6
Output: [0,1]
Constraints:
2 <= nums.length <= 104
-109 <= nums[i] <= 109
-109 <= target <= 109
Only one valid answer exists.
*/


class x{

	public static void main(String[] boss){
	
		int arr[] =  new int[]{2,7,11,15};
		int target = 9;

		int N =arr.length;

		for(int i=0;i<N;i++){
		
			for(int j=0;j<N;j++){
			
				if(arr[i]+arr[j]==target && i!=j &i<j){
					System.out.print(i+","+j);
					break;
				}
				

			}
			
		
		}
		System.out.println();
	
	}

}












