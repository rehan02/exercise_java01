package com.assignment;
//Write a program to print an array populated by the user.

public class Taskfour01 {
	public static void main(String[] args) {
		int a[]=new int[5];
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		
		System.out.println(" using for loop ");
		for ( int i=0;i<a.length;i++) {
			System.out.println(a[i]);	
			}
		
		System.out.println("using foreach loop");
		for (int k:a ) {
			System.out.println(k);
		}	
	}
}
