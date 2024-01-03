package com.assignment;
// Swap two numbers using the third variable as the result name and do the same task without using any third variable.
public class Taskone03 {

	public static void main(String[] args) {
		int num1=21;
		int num2=31;
		System.out.println("num1: " +num1);
		System.out.println("num2: " +num2);
		int temp=num1;
		num1=num2;
		num2=temp;
		System.out.println(" --- swap with a buffer ---");
		System.out.println(" After Swap num1: " +num1 );
		System.out.println(" After Swap num2: " +num2 );
		System.out.println("--- swap without a buffer ---");
		
		num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;
		System.out.println("num2: " + num2);
		System.out.println("num1: " + num1);
	}
}
