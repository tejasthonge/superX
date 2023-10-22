/*
 Que 5: WAP to toggle the String to uppercase or lowercase
Input: Java output: jAVA
Input: data output: DATA

*/

import java.util.*;

class x{

	static void toggle(String str){
	
		char arr[] = str.toCharArray();

		int l= arr.length;

		for(int i =0;i<l;i++){
			if(arr[i]<=90 )
				arr[i]	+=32;	
			
			else if(arr[i]>=97)
				arr[i] -=32;
	
		
		}


		System.out.println(arr);

		
	
	}
	
	public static void main(String[] boss){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("entr the String :");

		String str = sc.next();

		
		toggle(str);


	
	
	}

}
