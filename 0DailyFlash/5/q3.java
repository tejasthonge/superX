/*

   Que 3: WAP to check whether the given number is a strong number or not.

   */


import java.util.*;

class x{

	static void checkStrong(int num){
	
		
		int k = num;
		//int fact =1;
		
		int sum=0;
		while(num!=0){
			
			int rem = num%10;				
			
			int fact =1;
			for(int j =1;j<=rem;j++ ){
				fact*=j;	
			}
			num/=10;
			sum+=fact;
		
		}
		
		if(sum == k){
		System.out.println(sum +" is strong num");
		}
		else
			System.out.println(sum +" is not Stronge ");

	}

	public static void main(String[] boss){
	
		Scanner sc = new Scanner(System.in);

		System.out.println("enter the num");

		int num = sc.nextInt();

		checkStrong(num);



	}

}
