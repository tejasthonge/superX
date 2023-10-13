/*
 
   5.WAP to prime No.in range
   take range from user

   */

import java.util.*;

class Prime{

	public static void main(String[] boss){
	
		Scanner sc =new Scanner(System.in);
		System.out.println("enter range");
		int range = sc.nextInt();

		
		for(int i=1;i<=range;i++){
			int count =0;	
			for(int j= 1;j<=i ;j++){
			if(i%j==0){
			count++;
			
			if(count > 2){
			
				break;
			}

			}
			}
			if(count == 2){
				System.out.println(i);
			
			
			}
		}
	}
}
