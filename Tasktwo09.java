package com.assignment;
import java.util.Scanner;

public class Tasktwo09 {

	public static void main(String[] args) {
		Scanner myObj=new Scanner(System.in);
		System.out.print("Enter the number of units: " );
		int units=myObj.nextInt();
		double billpay=0;
		 if (units<=60 )
			billpay=60*0.30;
		  else if ( units <=150)
			billpay=60*0.30+(units-60)*0.75;
		  else if ( units <=150)
			billpay=60*0.30+90*0.75+(units-60-90)*1.10;
		  else if ( units <=270)
			billpay=60*0.30+90*0.75+120*1.10+(units-60-90-120)*2.5;
		  else if ( units >=300)
				billpay=60*0.30+90*0.75+120*1.10+(300-60-90-120)*2.5+(units-300)*2.5;
		System.out.println(billpay*120/100);
	}
}
