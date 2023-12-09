package com.assignment;

import java.util.Arrays;

public class Taskfive03 {
// Write a program to check if two strings are anagrams of each other.
	public static void main(String[] args) {
		String str1="acer";
		String str2="care";
		
		if (str1.length()!=str2.length()) {
			System.out.println("The Stings are not anagram.");
			}
		char[] a1=str1.toCharArray();
		char[] a2=str2.toCharArray();
		Arrays.sort(a1);
		Arrays.sort(a2);
		
		
		System.out.println( Arrays.equals(a1,a2) );
	}	
}

