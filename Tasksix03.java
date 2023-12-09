package com.assignment;

//Write a program that would print the information (name, year of joining, salary, address) of three employees by creating a class named 'Employee'. The output should be as follows:
class Employees {
	String name;
	int yearOfJoining;
	String address;
	void insert (String n,int y,String a) {
		name=n;
		yearOfJoining=y;
		address=a;
	}
}

public class Tasksix03 {
	public static void main(String[] args) {
		Employees e1=new Employees();
		Employees e2=new Employees();
		Employees e3=new Employees();
		
		e1.insert("Robert",1994,"64C- Walls Street");
		e2.insert("Sam",2000,"68D- Walls Street");
		e3.insert("John",1999,"26B- Walls Street");
		System.out.format("%15s %15s %15s ","Name", "Year Of Joining","Address");
		System.out.println();
		System.out.format("%15s %15s %15s",e1.name,e1.yearOfJoining,e1.address);
		System.out.println();
		System.out.format("%15s %15s %15s",e2.name,e2.yearOfJoining,e2.address);
		System.out.println();
		System.out.format("%15s %15s %15s",e3.name,e3.yearOfJoining,e3.address);
	}
	

}
