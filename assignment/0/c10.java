
/*
 cheet whether string is polindrum or not

Input malayalam
op it is palindrom

Input = stnte 
op it is palindrom

Input 3 nayan

dip it is palindrom
   */

class Strings{

	public static void main(String[] boss){
	
		String str = "malyaylam";
//		String str = "nayan";

		char arr[] = str.toCharArray();
		
		StringBuffer str1 = new StringBuffer();

		for(int i = arr.length-1 ;i>=0;i--){
			
			str1.append(arr[i]);
		}
		System.out.println("reverse string :"+str1);

		if(str.contentEquals(str1))
			System.out.println("it is palindrom string");
		
		else
			System.out.println("it is not palindrom string");
	}
}
