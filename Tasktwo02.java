package com.assignment;
// Write a program to check whether a character is an alphabet or not.
public class Tasktwo02 {
	public static void main(String[] args) {
		char c='d';
		if ( ('A' <= c && c <='Z') | ('a' <= c && c <='z') ) {
			System.out.println( c+ " is alphabet.");
		} 	else 
			System.out.println(c+ " is not alphabet");
	}
}
