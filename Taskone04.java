package com.assignment;
import java.util.Scanner;
// Write a program to add two numbers.

public class Taskone04 {

	public static void main(String[] args) {
		Scanner myObj=new Scanner(System.in);
		System.out.print("Enter a number: ");
		int a=myObj.nextInt();
		System.out.print("Enter another number: ");
		int b=myObj.nextInt();
		System.out.println( "the sum of a and b is : " +(a+b) );		
	}
}
