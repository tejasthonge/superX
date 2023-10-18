

/*
Que 3 : WAP to check whether the given no is prime or composite
*/

import java.util.*;
class X{

	public static void main(String[] boss){
	
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the integer : ");
	
		int N= sc.nextInt();
		
		for(int j =1 ;j<=N;j++){
			int fact=0;
			for(int i =1;i<=N;i++){
			if( j % i == 0){
			fact++;

			
			}
			}
		
			if(fact >2 ){
			System.out.print(j+",");

		}
		}
	}
	



}
