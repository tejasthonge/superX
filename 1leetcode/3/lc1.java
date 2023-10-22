/*
 
   Day-3
1. To Lower Case (Leetcode-709)
Given a string s, return the string after replacing every uppercase
letter with the same lowercase letter.
Example 1:
Input: s = "Hello"
Output: "hello"
Example 2:
Input: s = "here"
Output: "here"
Example 3:
Input: s = "LOVELY"
Output: "lovely"
Constraints:
1 <= s.length <= 100
s consists of printable ASCII characters

*/

import java.util.*;

class x{

	static void toggaleString(String str){

		char arr[] =str.toCharArray();

		for(int i =0;i<arr.length;i++){
		
			if(arr[i] <=122 && arr[i]>=97){
			
				arr[i] -=32;

			}
			else{
			
				arr[i] +=32;
			}
		
		}
		System.out.println(arr);	
	
	}

	public static void main(String[] boss){
	
		Scanner sc= new Scanner(System.in);
		System.out.print("enter the String: ");			
		String str = sc.nextLine();

		toggaleString(str);
	
	
	}

}














