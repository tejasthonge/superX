/*
 
   Super - X
DailyFlash-05 Time:
Note: Write solutions in function format only
Take input from the user
Solve these in Java Language
Date: 21/10/2023 Points: 10 (2 marks each)
Que 1: WAP to print the factorial of digits in a given range.
Input: 1-10
   */
import java.util.*;
class x{

	static void fact(int s,int e){
	
		for(int i =s;i<=e;i++){
		int fact = 1;

		for(int j =1;j<=i;j++ ){
			
			fact *=j;

		}
		
		System.out.println(fact);
		}
	
	}

	public static void main(String[] boss){
	
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the strating no. ");
	int s = sc.nextInt();

	System.out.println("enter the endding no. ");
	int e = sc.nextInt();

	fact(s,e);



	
	}

}
