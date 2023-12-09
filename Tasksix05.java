package com.assignment;
class Rectangle {
	private int length;
	private int breadth;
	
	public Rectangle(int length,int breadth){
		this.length=length;
		this.breadth=breadth;
	}
	public Rectangle(int side){
		this.length=side;
		this.breadth=side;
	}
	public Rectangle(){
		this.length=0;
		this.breadth=0;
	}
	
	
	public void getArea() {
		System.out.println( length*breadth);
	}	
}

public class Tasksix05 {
	public static void main(String[] args) {
		Rectangle rect1=new Rectangle();
				
		rect1.getArea();
	}
}
