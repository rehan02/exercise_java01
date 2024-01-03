package com.assignment;
// Write a program to Calculate Average Using Arrays.

public class Taskfour02 {

	public static void main(String[] args) {
		int a[] = {11,2,21,4,19,12,23,42};
		int sum=0;
		for (int i=0;i<a.length;i++ ) {
			sum+=a[i];
		}
		System.out.println(" Avarage of the array elements : " + sum / a.length);

	}

}
