/*
 
 Super - X
DailyFlash-04 Time:
Note: Write solutions in function format only
Take input from the user
Solve these in Java Language
Date: 20/10/2023 Points: 10 (2 marks each)
Que 1: WAP to print the following pattern
Take input from the user
A B C D
# # # #
A B C D
# # # #
A B C D
*/
import java.util.*;

class x{

	static void printPattarn(int row){
	
		for(int i =1;i<=row;i++){
			char ch ='A';
			for(int j=1;j<=row;j++){
			
				if(i%2!=0)
					System.out.print(ch++  + " ");
				else
					System.out.print("# ");

			}
			System.out.println();
		
		}
	
	}

	public static void main(String[] boss){
	
		Scanner sc = new Scanner(System.in);

		System.out.println("enter the no row :");
		int row = sc.nextInt();
		printPattarn(row);	
	}

}
