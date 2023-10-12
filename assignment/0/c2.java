/*
 2) WAP to find whether the number is an armstrong number or not.
3 pts.
Input 1 : 153
Output : It is an armstrong number
Input 2 : 376
Output : It is not a armstrong number

   */

import java.lang.Math;
class Armstrong{

	static String isArmstrong(int N){
		double temp = N;
		double arm =0;
		int count = Armstrong.dCount(N);
		int rem=0;
		for(int i = 1 ;N!=0;i++){
			rem = N%10;
			double poww = Math.pow(rem,count);
			arm = arm + poww;
			N /=10;
		}
		if(temp==arm)
			return temp +"is armstrong no";
		else
			return temp+"is not armstrong no";
	
	}
	static int dCount(int n){
		
		int count =0;
		for(int i =1;n!=0;i++){
			n/=10;
			count++;
		}
		return count;
	
	}
	public static void main(String[] boss){
	
		//int N =153;
		int N =376;

		System.out.println(Armstrong.isArmstrong(N));
	
	}

}
