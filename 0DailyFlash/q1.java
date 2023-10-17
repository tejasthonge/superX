/*
 Super - X

Day-01 Time:
Note : Write solutions in function format only
Take input from user
Date: 17/10/2023 Points : 10 (2 marks each)

Que 1 : WAP to print the following pattern
Take input from user
1 2 3 4
2 3 4 5
3 4 5 6
4 5 6 7

*/


import java.util.*;
class x{

	public static void main(String[] boss){
	
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the no of row :");
		int row = sc.nextInt();

		for(int i =1;i<=row;i++){
		
			int k=i;
			for(int j= 1; j<=row;j++){
			
				System.out.print(k++ + " ");
				
			}
			System.out.println();
		}
	
	}

}
