package com.assignment;
//Program to check the Armstrong number?
//1, 2, 3, 4, 5, 6, 7, 8, 9, 153, 370, 371, 407, 1634
public class Taskseven05 {
	public static void main(String[] args) {
		int onum =407,num,remainder,result=0;
		num=onum;
		System.out.println(num);
		System.out.println("-----------------");
		while(num!=0) {
		remainder=num%10;
		System.out.print(remainder );
		System.out.print(" - "+Math.pow(remainder, 3) );
		System.out.println( );
		result+= Math.pow(remainder, 3);
		num/=10;
		}
		System.out.println("-----------------");
		if ( onum-result==0) {
			System.out.println(onum +" is an Armstrong number" );
		} else {
			System.out.println(onum +" is not an Armstrong number" );
		}
	}

}
