/*
 
           1
         2 4
       3 6 9 
    4 8 12 16

   */

import java.util.*;

class Patt{

	public static void main(String[] boss){
		
		Scanner sc = new Scanner(System.in);
		System.out.print("eneter the no of row  : ");
		int row = sc.nextInt();
		
			
		int r =row-1;
		for(int i =1;i<=row;i++){
			int k= i;
			
			
			for(int j =1;j<=row ;j++){
			
				if(j<=r){
					System.out.print("  ");
				
				}
				else{
					System.out.print(k +" ");
					k+=i;
				}
			}
		
			System.out.println();
			r--;
		}
	}

}
