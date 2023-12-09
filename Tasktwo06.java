package com.assignment;
import java.util.Scanner;

public class Tasktwo06 {

	public static void main(String[] args) {
		 int num1=15,num2=12;
		 
		 Scanner myObj=new Scanner(System.in);
			System.out.print("What do u want to do 1- Add, 2- Substract, 3-Multiply, 4- divide:");
			int oper=myObj.nextInt();
		    //Switch expression
		    switch(oper){  
		    //Case statements  
		    case (1): System.out.println("Sum of both numbers are: "+ (num1+num2));  
		    break;
		    case (2): System.out.println("Substracted result: "+ ( num1-num2));  
		    break;
		    case (3): System.out.println("Multiplication result: "+ ( num1*num2));  
		    break;
		    case (4): System.out.println("Division result: "+ (num1/num2));  
		    break;
		    default:System.out.println("No calclation");  
		    }  

	}

}
