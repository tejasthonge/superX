/*
  Day-4
Multiply Strings (LeetCode - 43)
Given two non-negative integers num1 and num2 represented as strings,
return the product of num1 and num2, also represented as a string.
Note: You must not use any built-in BigInteger library or convert the inputs
to integers directly.
Example 1:
Input: num1 = "2", num2 = "3"
Output: "6"
Example 2:
Input: num1 = "123", num2 = "456"
Output: "56088"
Constraints:
1 <= num1.length, num2.length <= 200
num1 and num2 consist of digits only.
Both num1 and num2 do not contain any leading zero, except the number 0
itself.
   */

class Solution {
    public void reverseString(char[] s) {
     int n = s.length;
     char temp=0;
     for(int i=0;i<n/2;i++){
        temp= s[i];
        s[i] =s[n-i-1];
        s[n-i-1] =temp;
     }
   	for(int i=0;i<n;i++){
	
		System.out.print("'"+s[i] +"',");
	
	}
    }
    public static void main(String[] boss){
    
	    String str = "Amar";
	    char[] arr = str.toCharArray();

	    Solution obj = new Solution();
	    obj.reverseString(arr);
	
   	 
    }
}


