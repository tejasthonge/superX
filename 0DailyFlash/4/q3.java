/*
 
   Que 3: WAP to find the factorial of a given number
 
   */


import java.util.*;
class x{


	static int printFact(int num){
	
		int fact =1;
		for(int i =1;i<=num;i++){
		
			fact = fact*i;
		}
		return fact;
	
	}
	public static void main(String[] boss){
	
	
		Scanner sc =new  Scanner(System.in);
		System.out.println("enter the no : ");
		int n=sc.nextInt();
		int fact = printFact(n);

		System.out.println("the factorial of "+n+" is : "+ fact);
	}

}
