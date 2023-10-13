/*
 
   1 2 3 4
   4 5 6 7
   6 7 8 9 
   7 8 9 10

   */

import java.util.*;

class Patt{

	public static void main(String[] boss){
	
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the no of row : ");
		int row =  sc.nextInt();
		int k=1;
		for(int i =1;i<=row;i++){
			
			for(int j= 1;j<=row;j++){
			
				System.out.print(k++ + " ");
			
			}
		System.out.println();
		k -=i;
		}
	
	}

}
