package com.assignment;

public class Taskfour04 {

	public static void main(String[] args) {
		int arr[] = {2,5,8,12,16,23,38,56,72,91,94};
		int x =12,lo=0,hi=arr.length-1,mid=(lo+hi)/2;
		
		while( lo<=hi) {
			if (arr[mid]==x) {
				System.out.println("match found at "+mid);
				break;
			} else if(arr[mid]<x) {
				lo=mid+1;
			} else {
						hi=mid-1;
					}
			mid=(lo+hi)/2;
		}
	}
}
