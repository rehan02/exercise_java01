package com.assignment;
import java.util.Scanner;

class Student2 {
	private String name;
	
	public Student2() {
		this.name="Unknown";
	}
	public Student2(String name) {
		this.name=name;
	}
	public void printName() {
		if (name!= "") 
			System.out.println("the name is :"+this.name);
		else 
			System.out.println(("Unknown"));
	}
}

public class Tasksix04 {
	public static void main(String[] args) {
		// Write a program to print the names of students by creating a Student class. If no name is passed while creating an object of Student class, 	then the name should be "Unknown", otherwise the name should be equal to the String value passed while creating an object of Student class. (Hint: Overloading concept)
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Student Name: ");
		String name_stud=sc.nextLine();
		System.out.println(name_stud);
		System.out.println("----------------------------");
		Student2 s1=new Student2(name_stud);
		s1.printName();
	}
}
