package com.assignment;
// Write a Java program to add two matrices of the same size.

public class Taskfour05 {
	public static void main(String[] args) {
		int mat1[][] = {{2,3,4},{5,2,3},{1,4,2}};
		int mat2[][] = {{1,1,1},{1,1,1},{1,1,1}};
		int mat3[][] = new int[3][3];
		for(int i=0;i<mat1.length;i++) {
			for( int j=0;j<mat1[i].length ;j++) {
				mat3[i][j] = mat1[i][j]+mat2[i][j];
			}
		}
		for(int[] p:mat3) {
			for( int q:p) {
				System.out.print(q+"   ");
			}
			System.out.println();
		}
	}
}
