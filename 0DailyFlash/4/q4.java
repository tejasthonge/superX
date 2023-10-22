/*
 
   Que 4: WAP to print the sum of digits in a given range.
Input: 1 to 10
Input: 21 to 30
   */
import java.util.*;
class x{

	static int sumOfDigit(int s ,int e){
	
		int sum=0;
		for(int i=s;i<=e;i++){
		
			sum +=i;
		
		}
		return sum;
			
	}


	public static void main(String[] boss){
	
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the starting : ");
		int s = sc.nextInt();

		System.out.print("enter the ending : ");
		int e = sc.nextInt();
		int ret = sumOfDigit(s,e);
		System.out.println("sum of digit bettewen "+ s +" to " + e +"is : " + ret);
	
	}

}
