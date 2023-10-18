/*
 Que 2 : WAP to print the following pattern
Take row input from user
1
2 4
3 6 9
4 8 12 16
*/

import java.util.*;
class x{

	public static void main(String[] boss){
	
	
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the row");
		int row =sc.nextInt();

		for(int i = 1;i<=row;i++){
		
			int k=i;
			for(int j=1;j<=i;j++){
				
				System.out.print(k  + " ");
				k = k+i;
			}
			System.out.println();
		}
	
	}

}
