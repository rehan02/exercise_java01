package com.assignment;
public class Taskthree04 {
	public static void main(String[] args) {
		int num=29,i,flag=0;
		for (i=2;i<num/2; i++ ) {
			//System.out.println(i+" - "+num/i+" - "+num%i);
			if (num%i==0) {
			System.out.println(num+" is not a prime number.");
			flag=1;
			break;
				}
			}
		if (flag==0)
			 System.out.println(num+ " is a prime number");
	}
}