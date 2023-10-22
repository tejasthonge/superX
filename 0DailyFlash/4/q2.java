/*
 
   Que 2: WAP to print the following pattern
Take row input from the user
A
B A
C B A
D C B A
 
   */

import java.util.*;
class x{

        static void printPattarn(int row){

		char ch ='A';
                for(int i =1;i<=row;i++){
                        
                        for(int j=1;j<=i;j++){

                           
                                System.out.print(ch--  + " ");
                           
                        }
			ch+=i+1;
                        System.out.println();

                }

        }

        public static void main(String[] boss){

                Scanner sc = new Scanner(System.in);

                System.out.println("enter the no row :");
                int row = sc.nextInt();
                printPattarn(row);
        }
	

}
