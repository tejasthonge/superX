/*
 

   3) Print the following pattern
     3 pts.

 	 D C B A
	 e f g h
	 F E D C
	 g h i j
   */


import java.util.*;
class Patt{


	
	static void printPat(int r){
		
		char a='A';
		int b = a + r-1;
		char al = (char)b;

		for(int j = 1;j<=r;j++){
			char temp = al;

			if(j%2!=0){
				char temp1 = temp;
				for(int i =1;i<=r;i++){
			
					System.out.print(temp1-- + " ");
				}

				temp--;
				al++;
				System.out.println();
			}
			else{	
				
				char temp2 = Character.toLowerCase(temp);
				
				for(int i=1;i<=r;i++){
					
					System.out.print(temp2++ + " ");
				}
				temp2++;
				System.out.println();
			}
		}
	
	}

	public static void main(String boss[]){
	
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the no of row : " );

		int row = sc.nextInt();
		Patt.printPat(row);

	
	}

}
