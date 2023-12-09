package com.assignment;

public class Taskfour06 {
		public static void main (String[] args) {
			int arr[]= {1,2,4,5,6};
			int val=6;
			for(int i=0;i<arr.length-1;i++) {
				for (int j=i+1;j<arr.length-1;j++)
					if (arr[i]+arr[i+1] ==val) {
						System.out.println(i+" & "+j);
						break;
				}
		}
	}
}