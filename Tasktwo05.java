package com.assignment;
/*
Write a program to assign the grade
on the basis of percentage
if the percentage is above 90,
assign grade A
if the percentage is above 75,
assign grade B
if the percentage is above 65,
assign grade C
*/

public class Tasktwo05 {

	public static void main(String[] args) {
		int p;
		p=75;
		if ( p>=90)
			System.out.println("the grade is: A");
		else if (p<90 && p>=75)
			System.out.println("the grade is: B");
		else if (p<75 && p>=65)
			System.out.println("the grade is: C");
		else {
			System.out.println("enter the grade in the range");
		}

	}

}
