

/*
Que 3 : WAP to check whether the given no is prime or composite
*/

import java.util.*;
class X{

	public static void main(String[] boss){
	
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the integer : ");
	
		int N= sc.nextInt();
		int fact=0;
		for(int i =1 ;i<=(N);i++){
		
			if( N % i == 0){
			fact++;
			}

		}
		if(N==1){
			System.out.println("not prime not composite");
		}
		else if(fact ==2){
			System.out.println(N+" is prime");
		}
		else if(fact >2 ){
			System.out.println(N+" is composite");

		}
	}
	



}
