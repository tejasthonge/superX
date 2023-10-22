/*
 
   Que 2: WAP to print the following pattern
Take row input from the user
a
A B
a b c
A B C D
*/

import java.util.*;
class x{

	static void printPat(int row){
	
		for(int i=1;i<=row;i++){
		
			
			char ch='a';

			if(i%2==0){
			 ch -= 32;

				
			}

			for(int j=1;j<=i;j++){				
				
					System.out.print(ch++ + " ");
		
				
			}
		System.out.println();
		}

	
	}


	public static void main(String[] boss){
	
		Scanner sc = new Scanner(System.in);
		System.out.print("enter row ");
		int row = sc.nextInt();

		printPat(row);

	
	}


}
