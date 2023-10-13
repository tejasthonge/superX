/*
 5
 6 8
 7 10 13
 8 12 16 20
 9 14 19 24 29
   */
import java.util.*;

class Patt{

	public static void main(String[] boss){
	
		Scanner sc = new Scanner(System.in);
		System.out.print("eneter the no of rows : ");
		int row = sc.nextInt();
		int k=row;
		for(int i=0;i<row ;i++){
			int l=k;
			for(int j=0;j<=i;j++){
			
				System.out.print(l++ + " "); 
				l+=i;

			}
			k++;

			System.out.println();
		}
	}

}
