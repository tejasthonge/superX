/*Que 2 : WAP to print the following pattern
Take row input from user
1
1 2
2 3 4
4 5 6 7
*/

import java.util.*;
class x{

	public static void main(String[] boss){
	
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the no of row :");
		
		int row = sc.nextInt();

		for(int i= 1;i<=row;i++){
		
			int k = i;
			for(int j=1;j<=i;j++){
			
				System.out.print(k++ +" ");
			
			}
			System.out.println();
		}
	
	}
}

