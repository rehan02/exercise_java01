package com.assignment;
//Write a program to reverse a string. input-Consultadd , output-ddatlusnoC


public class Taskfive01 {

	public static void main(String[] args) {
		String str1="Consultadd";
		System.out.println("Original: "+str1);
		System.out.print("Reverse: ");
		for( int i=str1.length()-1;i>=0;i--) {
			System.out.print(str1.charAt(i));
		}
	}
}
