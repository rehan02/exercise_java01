package com.assignment;
//Write a program to sum first n even numbers using a while loop.

public class Taskthree05 {

	public static void main(String[] args) {
		int n=12,i,sum=0;
		if (n%2==0) {
		for (i=2;i<=n;i+=2) {
			sum=sum+i;
			System.out.println(i+" - "+sum);
		}
	}
}
}
