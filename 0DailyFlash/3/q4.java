/*
Que 4 : WAP to print each reverse numbers in the given range
Input: start:25435
end: 25449
   */

import java.util.*;
class x{

	static  void  cheackPalindrome(int s,int e){
	
	

		for(int j =s ;j<=e;j++){
	        int temp =j;
                int rem =0;
                int ret=0;
		int k = j;
		for(int i= 1;k!=0;i++){
		
			rem = k%10;
			ret = rem +ret*10;
			k/=10;
		}

		System.out.println(ret);
		}
	}

	public static void main(String[] boss){
		
		Scanner sc =new Scanner(System.in);
		System.out.print("enter the Strting no :");
		int s = sc.nextInt();
		System.out.print("enter the ending no :");
		int e = sc.nextInt();
		x.cheackPalindrome(s,e);
		

	
	
	}

}
