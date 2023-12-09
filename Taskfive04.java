package com.assignment;

public class Taskfive04 {
	/* Write a program to count the
	occurrence of a given character in a
	string.
	*/
	public static void main(String[] args) {
		String str="chaowqahdiugw aqiua dcwa dkwdahacawajdwj " ;
		char chr='a';
		int count=0;
		for ( int i=0;i<str.length();i++) {
			
			if ( str.charAt(i)==chr) {
				count+=1;
			}
		}
		System.out.println("Count of char "+chr+" is "+count);
	}
}
