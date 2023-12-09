package com.assignment;
import java.util.Scanner;

public class Taskthree03 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//System.out.println("Enter the number: ");
		//int num=sc.nextInt();
		int rnum=0,rem=0,temp;
		int num=19291;
		System.out.println("The number you entered is :"+num);
		temp=num;
		while(num>0) {
			rem=num%10;
			rnum=rnum*10+rem;
			num=num/10;
		}
		
		if (rnum==temp)
			System.out.print("num is paindrone. ");
		else 
			System.out.print("number is not a paindrone. ");
		
	}
}
