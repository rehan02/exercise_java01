package com.assignment;

public class Taskfive07 {
//Write a JAVA method to return a boolean true if the string doesn’t have repeating letters and consecutive or non-consecutive i.e. all the letters of the string be unique (isogram) else false
	
	public static void main(String[] args) {
		String str="my name is james";
		for(int i=0;i<str.length();i++) { 
			for(int j=0;j<str.length();j++) {
								
				if ( j<str.length()  ) {
				 System.out.print(str.charAt(j) +" " );
				  if (str.charAt(j) == str.charAt(j+1)) {
					  System.out.println(str.charAt(j));
				  }
				}
			}
			System.out.println();
		}
	}
}
