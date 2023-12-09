package com.assignment;

import java.util.ArrayList;

// Program to find the intersection of two arrays in java?
public class Taskseven02 {
	public static void main(String[] args) {
		int[] arr1= {1,2,3,4,5,6,7,8,9};
		int[] arr2= {2,10,4,11,5,12,8};
		//int[] arr2= {1,2,3,4,5,6,7,8,9};
		ArrayList<Integer> temp=new ArrayList<Integer>();
		for (int i=0;i<arr1.length;i++ ) {
			for (int j=0;j<arr2.length;j++ ) {
				if( arr1[i]==arr2[j]) {
					temp.add(arr1[i]);
				}
			}
		}
		for ( int x:temp) {
			System.out.println(x);
		}
		
	}
}
