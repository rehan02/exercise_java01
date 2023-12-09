package com.assignment;
// //Write a program to print the area and perimeter of a triangle having sides of 3, 4 and 5 units by creating a class named 'Triangle' without any parameter in its constructor.
class Triangle{
	private double side1, side2, side3;
	public Triangle()	{
	side1=3.0;
	side2=4.0;
	side3=5.0;
}
	public double calculatePerimeter() {
		return side1+side2+side3;
	}
}

public class Tasksix02 {

	public static void main(String[] args) {
		Triangle perim1=new Triangle();
		System.out.println(perim1.calculatePerimeter());
	}
}
