package com.assignment;

public class Taskfour07 {
	public static void main(String[] args) {
		int arr[]= {2,2,3,3,4,4,4,11,11,11,11};
		 int arr2[]=new int[arr.length];
		 int j=0;
		for(int i=0;i<arr.length-1;i++) {
			arr2[0]=arr[0];		
			if (arr[i]!=arr[i+1]) {
						arr2[j++]=arr[i];
					} 	
		}
		arr2[j++]=arr[arr.length-1];
		System.out.println();
		for ( int m:arr2) {
			System.out.print(m+" ,");
		}
	}
}
