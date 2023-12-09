package com.assignment;

public class Taskthree07 {

	public static void main(String[] args) {
		final int maxS=5;
		for (int row=1;row<=maxS;row++) {
			for (int space=1;space<=maxS-row;space++) {
				System.out.print(" " );
			}
			for ( int star=1;star<=row;star++) {
				System.out.print("*");
			}
		System.out.println();
		}
	}

}
