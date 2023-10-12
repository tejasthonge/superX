
/*
 
1) WAP to print the factorial of even numbers in a given number.
Points : 35
2 pts.
Input : 256946
Output : 2, 720, 24, 720

   */



class fact{

	static void digit(int n){
		int rem = 0;
		int count=0;
		
		for(int i =1;n!=0;i++){
			count++;
			rem = n%10;

			if(rem %2==0){
			
				System.out.print(fac(rem)+" ");
			}
			n /=10;
		
		}

		

	
	}
	static int fac(int l){
		int factNo =1;
		for(int i =l;i!=0;i--){
		factNo = factNo*i;
		}
		return factNo;
		
	}

	public static void main(String[] boss){
	
		int N = 256946;

		fact.digit(N);
	
	}


}
