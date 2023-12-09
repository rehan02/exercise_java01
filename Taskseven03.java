package com.assignment;
//Program to find if String has all Unique Characters?

public class Taskseven03 {

	public static void main(String[] args) {
		String str="what";
		for (char i:str.toCharArray()) {
			if (str.indexOf(i) == str.lastIndexOf(i) ) {
				System.out.println(i);
				break;
			}
		}
	}
}
