package com.assignment;

public class Taskseven08 {
	public static void main(String[] args) {
		int[] num= {11,21,99,9,14,5,15,31};
		int max=num[0];
		for(int i=1;i<num.length;i++) {
			if (num[i]>max ) {
				max=num[i];
			}
			
		}
		System.out.println("The max number in the array is : " +max);
	}
}
