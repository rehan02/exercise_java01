package com.assignment;
import java.util.Scanner;

//Take the user's name as input and print it to the console.

public class Taskone02 {

	public static void main(String[] args) {
		// instant of the Scanner class 
		Scanner myObj=new Scanner(System.in);
		// Interactive msg to enter the username
		System.out.print("Enter username: ");
		String userName=myObj.nextLine();
		System.out.println( "Username is : " +userName );
	}
}
