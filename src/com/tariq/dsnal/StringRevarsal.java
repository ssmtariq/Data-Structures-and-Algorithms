package com.tariq.dsnal;

public class StringRevarsal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reverse("Hi My Name Is Tariq"));
		System.out.println(reverseOptimized("Hi My Name Is Tariq"));
	}
	
	private static String reverse(String text) {
		char [] textChars = text.toCharArray();
		int totalChars = textChars.length;
		String alteredString = "";
		for(int i=0; i<textChars.length; i++) {
			alteredString += textChars[totalChars-1];
			totalChars--;
		}
		return alteredString;
	}

	private static String reverseOptimized(String text) {
		char [] textChars = text.toCharArray();
		int totalChars = textChars.length;
		int start, threshold=0;
		if(totalChars %2 == 0) {
			start = (totalChars/2)-2;
		}else {
			start = (totalChars/2)-1;
			threshold = start+1;
		}
		int end = totalChars-1;
		String alteredString1 = "", alteredString2 = "";
		while(start>=0) {
			char temp = textChars[end];
			alteredString2 += textChars[start];
			alteredString1 += temp;
			start--;
			end--;
		}
		if(threshold>0) {
			return alteredString1+text.charAt(threshold)+alteredString2;
		}
		return alteredString1+alteredString2;
	}

}
