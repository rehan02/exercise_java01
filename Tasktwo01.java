package com.assignment;
// Write a program to check whether a number is positive or negative.

import java.util.Scanner;

public class Tasktwo01 {
	public static void main(String[] args) {
		Scanner myObj=new Scanner(System.in);
		System.out.print("Enter the mumber: ");
		int num=myObj.nextInt();
		if ( num>0 ) {
		System.out.print("the number is positive");
		} else {
			System.out.println("number is negative");
		} 	
	}
}
