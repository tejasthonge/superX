/*
 10. Plus One (Leetcode-66)
You are given a large integer represented as an integer array digits,
where each digits[i] is the ith digit of the integer. The digits are
ordered from most significant to least significant in left-to-right order.
The large integer does not contain any leading 0's.
Increment the large integer by one and return the resulting array of
digits.
Example 1:
Input: digits = [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.
Incrementing by one gives 123 + 1 = 124.
Thus, the result should be [1,2,4].
Example 2:
Input: digits = [4,3,2,1]
Output: [4,3,2,2]
Explanation: The array represents the integer 4321.
Incrementing by one gives 4321 + 1 = 4322.
Thus, the result should be [4,3,2,2].
Example 3:
Input: digits = [9]
Output: [1,0]
Explanation: The array represents the integer 9.
Incrementing by one gives 9 + 1 = 10.
Thus, the result should be [1,0].
Constraints:
1 <= digits.length <= 100
0 <= digits[i] <= 9
digits does not contain any leading 0's.
*/


import java.util.*;
class x{


	static void pluseOne(int arr[]){
	



		int l= arr.length;
		
		int ret =0;
		for(int i=0;i<l;i++){
		
			ret = arr[i] +ret*10;
		
		}
		
		ret+=1;

		int rem =0;	
		for(int i =l-1;i>=0;i--){
		
			rem = ret%10;
			arr[i] = rem;

			ret/=10;

		}

		System.out.print("[ ");
		for(int i =0;i<l;i++){
		
			
			System.out.print(arr[i] + ",");
		
		}
		System.out.println(" ]");

		

	
	}

	public static void main(String[] boss){
	
		Scanner sc = new Scanner(System.in);

		System.out.print("enter the size: ");

		int n = sc.nextInt();
		int arr[] = new int[n];
	
		for(int i=0;i<n;i++){

			System.out.println("enter the "+ i+1 + " th element ");
			arr[i] = sc.nextInt();
	

		}
		pluseOne(arr);


	
	}

}






















