package com.assignment;
// Program to Count occurrences of each character in a string in java?
import java.util.ArrayList;
public class Taskseven06 {
	public static void main(String[] args) {
		String name = "dljqljoijoidwhuxznczbapoqwwqrpqoq";
		System.out.println("Original String"+name);
		ArrayList<Character> name2=new ArrayList<Character>();
		// create an array list of the unique characters of the string.
		for (int i=0;i<name.length();i++) {
			if (!name2.contains(name.charAt(i))) {
			name2.add(name.charAt(i));
			}
		}
		System.out.println("String after removing duplicates: ");
		for( char w:name2) {
			System.out.print(w);
		}
		System.out.println();
		
		for ( char chx:name2) {	
			int count=0;
			for (int j=0;j<name.length();j++ ) {
				if ( chx== name.charAt(j)) {
				count+=1;
				}
			}
			System.out.println(chx+" - "+count);
		}
	}
}