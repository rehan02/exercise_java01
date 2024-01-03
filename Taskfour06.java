package com.assignment;
/* Write a Java program to find the sum of the two elements of a given array which is equal to a given integer.
a. Sample array: [1,2,4,5,6]
b. Target value: 6   */
public class Taskfour06 {
		public static void main (String[] args) {
			int arr[]= {1,2,4,5,6};
			int val=6,sum=0;
			for(int i=0;i<arr.length;i++) {
				for(int j=i+1;j<arr.length;j++) {
					sum= arr[i]+arr[j];
					if ( sum==val) { 
					 System.out.println(i+" "+j);
					}
		}
	}
}
}
