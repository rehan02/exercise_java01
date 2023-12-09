package com.assignment;

public class Taskfour02 {

	public static void main(String[] args) {
		int a[] = {2,2,2,2,2,2,2,2};
		int sum=0;
		for (int i=0;i<a.length;i++ ) {
			sum+=a[i];
		}
		
		System.out.println(" Avarage of the array elements: " + sum / a.length);

	}

}
