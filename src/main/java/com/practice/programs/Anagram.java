package com.practice.programs;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = "listen";
		String str2 = "silent";
		
		//Convert strings to lowercase
		
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		
		// convert strings into charcter arrayas
		
		char[] arr1 = str1.toCharArray();
		char[] arr2 = str2.toCharArray();
		
		//Sort charcter arrays
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		//Compare sorted arrays
		
		if(Arrays.equals(arr1, arr2)) {
			System.out.println("Strings are Anagrams");
		}else {
			System.out.println("Strings are not Anagrams");
		}

	}

}
