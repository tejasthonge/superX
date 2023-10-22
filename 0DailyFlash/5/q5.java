/*

Que 5: WAP to print the occurrence of a letter in given String.
Input String: “Know the code till the core”
Alphabet : o
Output: 3
 */

import java.util.*;

class x{


	static int letterOccurrence(String str ,char e){
	
		char[] arr = str.toCharArray();

		int count =0;
		for(int i =1;i<arr.length ;i++){

			if(arr[i]==e)
				count++;
		
		
		}
		return count;
	
	}

	public static void main(String[] boss){
	
		String str = "Know the code till the core";
		Scanner sc = new Scanner(System.in);

		System.out.print("enter the element : ");
	
		String str1 =sc.next();

		char ch = str1.charAt(0);
		int ret =letterOccurrence(str,ch);
		
		System.out.println(ret);
	}

	
}



