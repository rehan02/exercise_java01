package com.assignment;

public class Taskfour01 {
	public static void main(String[] args) {
		int a[]=new int[5];
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		for ( int i=0;i<a.length;i++) {
			System.out.println(a[i]);	
			}		
		System.out.println("###2nd Array###");
		
	int b[]= {11,22,33,44,55};
		for (int j=0;j<b.length;j++) {
			System.out.println(b[j]);
			
		System.out.println("## foreach");
		for (int k:a ) {
			System.out.println(k);
		}
			
		}
}
}
