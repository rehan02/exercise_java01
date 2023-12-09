package com.assignment;

class Student {
	String name;
	int EnrollmentNo;
}


public class Tasksix01 {

	public static void main(String[] args) {
		Student student=new Student();
		student.name="Amay";
		student.EnrollmentNo=132;
		System.out.println("Name: "+student.name);
		System.out.println("Enrollment number: "+student.EnrollmentNo);
	}

}
