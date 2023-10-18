/*
 
Que 1 : WAP to print the following pattern
Take input from user
A B C D
B C D E
C D E F
D E F G
*/

import java.util.*;
class x{

	public static void main(String[] boss){
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the no of row");

	int row=sc.nextInt();

	char va='A';
	for(int i = 1;i<=row*row;i++){
	
		if((i%4)==0){
	
			
			System.out.print(va++ + " ");
			System.out.println();
			va -= row-1;

		}
		else{

			System.out.print(va++ + " ");
		}
	}

	}
}
