/*
 Que 2 : WAP to print the following pattern
Take row input from user
1
2 1
3 2 1
4 3 2 1
   */


import java.util.*;

class x{

        static void printPattarn(int row){

                char ch= 'A';
                for(int i=1;i<=row ;i++){

			int k =i;
                        for(int j= 1;j<=i;j++){
				
				System.out.print( k-- +" ");
                                
			}
                	System.out.println();

                }

        }

        public static void main(String[] boss){

                Scanner sc = new Scanner(System.in);
                System.out.print("enter the no row :");
                int row = sc.nextInt();


                x.printPattarn(row);
        }

}

