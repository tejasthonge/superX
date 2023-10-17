/*
 Search Insert Position (LeetCode 35)
Given a sorted array of distinct integers and a target value, return the index if the target
is found. If not, return the index where it would be if it were inserted in order.
You must write an algorithm with O(log n) runtime complexity.
Example 1:
Input: nums = [1,3,5,6], target = 5
Output: 2
Example 2:
Input: nums = [1,3,5,6], target = 2
Output: 1
Example 3:
Input: nums = [1,3,5,6], target = 7
Output: 4
Constraints:
1 <= nums.length <= 104
-104 <= nums[i] <= 104
nums contains distinct values sorted in ascending order.
-104 <= target <= 104

*/

//TC :O(N)
//SC: O(1)
class X{

	public static void main(String[] boss){
	
		int arr[] = new int[]{1,3,5,6};
		int N=arr.length;
		//int target = 5;
		//int target = 2;
		int target = 7;

		for(int i=0;i<N;i++){
		
			if(arr[i] == target){
				System.out.println(i);
				break;
			}
			else if (arr[i] +1 ==target){
				System.out.println(i+1);
				break;
			}
		
		}
	
	}

}
