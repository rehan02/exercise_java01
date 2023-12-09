package com.assignment;
//Program to find the first non-repeated character in the String
public class Taskseven01 {
	public static void main(String[] args) {
		String str="once in a moonlight";
		for ( char i :str.toCharArray()) {
			if (str.indexOf(i) == str.lastIndexOf(i) ) {
				System.out.println(i);
				break;
			}
		}
	}
}
