package com.assignment;

import java.util.HashMap;

// 10.Program to sort HashMap in java by keys and values?

public class Taskseven10 {

	public static void main(String[] args) {
		//create HashMap
		HashMap<String, Integer> people=new HashMap<String, Integer>();
		//add keys to the HashMap
		people.put("John", 32);
		people.put("Steve", 30);
		people.put("Angie", 33);
		people.put("Liza", 35);
		
		int max=people.get(0);
		for (String i:people.keySet()) {		
			if (max<people.get(i)) {
				max=people.get(i);
			}
			System.out.println(max);
		}
	}
}
