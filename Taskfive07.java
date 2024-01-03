package com.assignment;

// Write a JAVA method to return a boolean true if the string doesn’t have repeating letters and consecutive or non-consecutive i.e. all the letters of the string be unique (isogram) else false

public class Taskfive07 {
	
	public static void main(String[] args) {
		String str="my name is james";
		
		char str1[]=str.toCharArray();
		for(int i=0;i<str1.length;i++) {
			 
			System.out.print(str1[i]+": ");
			int count=0;
			for(int j=1;j<str1.length;j++) {
				if ( str1[i]==str1[j] &&  str1[i]!=' ') {
					++count;  
					str1[j]=0;  
				} 
			}
			System.out.println(count);
			
		}
	}
}