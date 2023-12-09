package com.assignment;

public class Taskfour03 {

	public static void main(String[] args) {
		int a[] = {1,3,4,5,7,8,9,11};
		int num=7,flag=0;
		for (int i=0;i<a.length;i++) {
			if (a[i]==num)
					flag=1;
			} 
		
		 if (flag==1)
		    System.out.println("The number found in the array.");
		 else 
			System.out.println("The number not found in the array.");
	}
}
