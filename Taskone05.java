package com.assignment;
// Write a program to print the area of circle, Take radius as input from  the user.(Area = 3.14*radius*radius)


import java.util.Scanner;
public class Taskone05 {
	public static void main(String[] args) {
		Scanner myObj=new Scanner(System.in);
		System.out.print("Enter the radiud of the circle: ");
		int r=myObj.nextInt();
		System.out.println( "the area of a andcircle is : " +3.14*r*r) ;
	}
}
