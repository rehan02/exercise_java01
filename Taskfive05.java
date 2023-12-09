package com.assignment;

public class Taskfive05 {

	public static void main(String[] args) {
		String str="Write a program to count a number of vowels and consonants in a String";
		int vow=0,conso=0; 
		for ( int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if (ch=='a' || ch=='e'|| ch=='i' || ch=='o' || ch=='u' ) {
			++vow;
		}	else if ( ch>='a' && ch<='z') {
				++conso;
		}
	}
		System.out.println("Vowel count: "+ vow+ ", Consonant count: "+ conso);
}
}