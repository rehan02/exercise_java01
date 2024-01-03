package com.assignment;
//Write a program to reverse a string in such way
//input-Consultadd Pvt
//Output-ddatlusnoC tvP

public class Taskfive02 {
	public static void main(String[] args) {
		String str="Consultadd Pvt";
		
		System.out.println("input: " +str);
		
		String[] words=str.split(" ");
		System.out.print("output: ");
		for (int i=0;i<words.length;i++ ) {
		 for(int j=words[i].length()-1;j>=0;j--) {
			System.out.print(words[i].charAt(j));			 
		}
		 System.out.print(" ");
	  }	 
	}
}
