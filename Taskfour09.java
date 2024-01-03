package com.assignment;
//Given an array of integers, return indices of the two numbers such that they add up to a specific target. Input: nums = [1,4,10,-3], target =14, Output: [1,2] or [2,1] # 4 + 10 = 14

public class Taskfour09 {

	public static void main(String[] args) {
		int nums[] = {1,4,10,-3};
		for (int i=0;i<=nums.length-1;i++) {
			for (int j=0;j<i;j++) {
				 if (nums[i]+nums[j] == 14) {
					 System.out.println(i+" , "+j);
					 break;
				 }
			 }
			}
		System.out.println();
	}
}
 