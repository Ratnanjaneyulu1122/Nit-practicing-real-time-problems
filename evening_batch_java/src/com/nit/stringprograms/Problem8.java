package com.nit.stringprograms;

public class Problem8 {

	public static void isUniquesubString(String s) {
		String sub = "";
	//	String uniqueString = "";
		
		
		for (int i = 0; i < s.length()-1; i++) {
			
			
			
			for(int j=i+1;j<s.length()-1;j++) {
				if(s.charAt(i)==s.charAt(j)) {
					
					sub+=s.charAt(j);
				}
			}
			
			
			
		}
		System.out.println(sub.toString());
		// return false;
		 
	}
	public static void main(String []args) {
		
		String s="abcbabab";
		isUniquesubString(s);
//		if(isUniquesubString(s)!=true) {
//			
//			System.err.println("No Maximum Unique SubString");
//			
//		}
	}
}
/*
Question.1)
--------------------
write a java program for findining MaximumuniquesubString and its length in the given String.
you have to take on method that will find in a String cointains only unique character or not.
mathod like public static boolean isUniqueString(String s); after that in main method take one
String value and call this isUniqueString(String s) method in the logical way for finding maximum
length and maximum subString and print that.
-------------------------------------
Note:if you know another way like through collection or other things you can do.
-------------------------
Example: String s="abcbabab"
Output: Maximum Unique SubString ="abc";
        length=3;
        ==============================
 */