/*
 Que 5 : WAP to check whether the string contains characters other than
letters.

*/

import java.util.*;
class x{


	static int checkLatter(String str){

                        char arr[] = str.toCharArray();
			int flag = 0;

			for(int i=0;i<arr.length;i++){
				if(arr[i]<65 || (arr[i]>90&&arr[i]<97) || arr[i]>122){
					flag =1;
					break;
				}
				
			}

			return flag;
                }


	public static void main(String[] boss){
	
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the string :  ");
		String str = sc.nextLine();

		int flag =checkLatter(str);
		if(flag ==1){
		
			System.out.println("it contains other than allbate latter");
		}
		else{
		
			System.out.println("it contains only alpabate ");
		}

	}

}
