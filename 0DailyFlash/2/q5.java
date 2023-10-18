

/*
 *Que 5 : WAP to check whether the string contains vowels and retun the count of vowels.
 
 *  vowels : A, E, I, O, U
 */

import java.util.*;
class X{
	
	public static void main(String[] boss){
	
		char arr[] = new char[] {'A', 'E', 'I', 'O', 'U'};

		Scanner sc=new Scanner(System.in);
		System.out.print("enter the string : ");
		String str = sc.nextLine();
	
		char ch[] = str.toCharArray();

		int count=0;
		for(int i = 0;i<ch.length;i++){
		
			for(int j=0;j<arr.length;j++){

				if(ch[i] ==arr[j] || ch[i] ==arr[j] +32)
					count++;
			
			}
		
		}
		if(count >0){
			System.out.println(count +" is count of voweles in string : " +str);
		}
		else{
		
			System.out.println(str+" : string does not contans vowels");
		}
	}


}
