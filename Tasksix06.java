package com.assignment;
import java.util.Scanner;

class Complex {
	double real;
	double img;
	public Complex(double real, double img){
		this.real=real;
		this.img=img;
	}	
	public double getreal() {
		return real;
	}
	public double getimg() {
		return img;
	}
	
	public Complex sum(Complex num) {
		return new Complex(this.real+num.real, this.img+this.img);
	}
}

public class Tasksix06 {
	public static void main(String[] args) {
		Complex com1=new Complex();
		Complex com2=new Complex();
		com1.set(2,3);
		com2.set(4,6);
		System.out.println("The first complex number is  : "+com1.getreal()+"+"+com1.getimg() +"i");
		System.out.println("The second complex number is : "+com2.getreal()+"+"+com2.getimg() +"i");	
	}

	
}
