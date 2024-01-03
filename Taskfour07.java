package com.assignment;
import java.util.Arrays;
// 7.Write a program to remove the duplicates from a sorted array,change them into 0 and add 0 in the end.
//input: [2,2,3,3,4,4,4,11,11,11,11]
//output:[2,3,4,11,0,0,0,0,0,0,0]

public class Taskfour07 {
	public static void main(String[] args) {
		int arr[]={2,2,3,3,4,4,4,11,11,11,11};
		
		System.out.println(Arrays.toString(arr));
		System.out.println("----------");
		
		int arr2[]=new int[arr.length];
		 int j=0;
		for(int i=0;i<arr.length-1;i++) {
			arr2[0]=arr[0];		
			if (arr[i]!=arr[i+1]) {
						arr2[j++]=arr[i];
					} 	
		}
		arr2[j++]=arr[arr.length-1];
		System.out.println(Arrays.toString(arr2));
		
	}
}
