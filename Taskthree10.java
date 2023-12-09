package com.assignment;

public class Taskthree10 {

	public static void main(String[] args) {
		for(int row=5;row>=1;row--) {
			for (int col1=6;col1>=row+1;col1--) {
				System.out.print("!");
			}
			for(int col2=1;col2<=row-1;col2++) {
					System.out.print(" ");
				}
			for(int col3=1;col3<=row-1;col3++) {
				System.out.print(" ");
			}
			for(int col4=6;col4>=row+1;col4--) {
				System.out.print("%");
			}
		System.out.println("");
		}
	}
}
