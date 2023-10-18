/*
 * Day-2
1. Palindrome Number(LeetCode 9)
Given an integer x, return true if x is a palindrome, and false otherwise.
Example 1:
Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.
Example 2:
Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-.
Therefore it is not a palindrome.
Example 3:
Input: x = 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
Constraints:
-231 <= x <= 231 - 1
*/

class X{

	
	public static void main(String[] boss){
	
		int N =121;
		//int N=-121;
		int temp = N;
		int rem =0;
		int ret =0;
		for(int i=1;N!=0;i++){
		rem = N%10;
		ret=rem+ret*10;
		N/=10;

		
		}
		if(temp <0){
			System.out.println("false");
		}
		else if(ret==temp)
			System.out.println("true");
		else
			System.out.println("false");
	}


}
