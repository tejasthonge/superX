/*
 
   2. Find the Index of the First Occurrence in a String(LeetCode 28)
Given two strings needle and haystack, return the index of the first occurrence of needle
in haystack, or -1 if needle is not part of haystack.
Example 1:
Input: haystack = "sadbutsad", needle = "sad"
Output: 0
Explanation: "sad" occurs at index 0 and 6.
The first occurrence is at index 0, so we return 0.
Example 2:
Input: haystack = "leetcode", needle = "leeto"
Output: -1
Explanation: "leeto" did not occur in "leetcode", so we return -1.
Constraints:
1 <= haystack.length, needle.length <= 104
haystack and needle consist of only lowercase English characters

*/

class x{

	public static void main(String[] boss){
	
	/*	String haystack = "sadbutsad";
		String needle = "sad";
	*/
		String haystack = "leetcode";
                String needle = "leeto";


		char h[] = haystack.toCharArray();
		char n[] = needle.toCharArray();
		int nl=n.length;
		int count=0;

		int sInd =-1;
		for(int i=0;i<h.length;i++){
		
			int k= i;

			if(h[i] == n[0]){
				sInd = i;	
				for(int j=0;j<n.length;j++){

					
					if(h[k] == n[j] ){
						count++;
						
					if(count == nl){
						break;
					}	
			
				//	System.out.println(k+","+j);

					}
					
					k++;			
				}
				if(count == nl){
                                                break;
                                        }

			}
		}
		if(count >=nl)
			System.out.println(sInd);
		else{
			System.out.println(sInd);
		}
	}

}

