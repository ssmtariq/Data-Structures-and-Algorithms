package com.tariq.dsnal;

import java.util.Scanner;

public class LongestWord {

	/**
	 * CoderByte LongestWord problem link
	 * 
	 * @see <a href=
	 *      "https://coderbyte.com/editor/Longest%20Word:Java">LongestWord</a>
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// "I love dogs"
		Scanner s = new Scanner(System.in);
		System.out.print(longestWord(s.nextLine()));
		s.close();
	}

	public static String longestWord(String sen) {
		// code goes here
		int index=0, size=0;
		String[] array = sen.split(" ");
		for (int i = 0; i < array.length; i++) {
			array[i] = array[i].replaceAll("[^a-zA-Z0-9]", "");
			if(array[i].length()>size) {
				size = array[i].length();
				index = i;
			}
		}
		return array[index];
	}
}
