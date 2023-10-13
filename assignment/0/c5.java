/*
 5) WAP to reverse a number, and put successive number sum into an array and print it.
4 pts.
Input : 45689
Output : 17,14,11,9,4
   */


class sum{


	static void sucSum(int n){
		int rem1 =0;
		int rem2 =0;
		int sum=0;
		for(int i=1;n!=0;i++){
			rem1 = n%10;
			n/=10;
			rem2 = n%10;
			sum =rem1+rem2 ;
		
			System.out.print(sum+ ",");
		}
	
	}

	public static void main(String[] boss){
	
		int N = 45689;
		sum.sucSum(N);
	}

}
