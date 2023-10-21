/*
 Que 3 : WAP to check whether the given no is a palindrome number or not.
   */

import java.util.*;
class x{

	static String cheackPalindrome(int n){
	
		int temp =n;
		int rem =0;
		int ret=0;

		for(int i= 1;n!=0;i++){
		
			rem = n%10;
			ret = rem +ret*10;
			n/=10;
		}
		if(ret == temp){
			return temp + " is palindrom";
		}
		else{
			return temp + " is not palindrom";	 
		}
	}

	public static void main(String[] boss){
		
		Scanner sc =new Scanner(System.in);
		System.out.print("enter the no :");
		int n = sc.nextInt();

		String ret = x.cheackPalindrome(n);
		System.out.println(ret);

	
	
	}

}
