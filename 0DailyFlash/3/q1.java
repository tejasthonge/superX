/*
Super - X
DailyFlash-03
Time:
Note : Write solutions in function format only
Take input from user
Solve these in java Language
Date: 19/10/2023
Points : 10 (2 marks each)
Que 1 : WAP to print the following pattern
Take input from user
A B C D
D C B A
A B C D 
D C B A

*/

import java.util.*;

class x{

	static void printPattarn(int row){
	
		char ch= 'A';
		for(int i=1;i<=row ;i++){
		
			for(int j= 1;j<=row;j++){
			
				if(i%2!=0)
					System.out.print(ch++ + " ");
				else
					System.out.print(ch-- +" ");

			
			}
			if(i%2!=0)
				ch--;
			else
				ch++;
				System.out.println();
		
		}
	
	}

	public static void main(String[] boss){
	
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the no row :");
		int row = sc.nextInt();


		x.printPattarn(row);
	}

}
