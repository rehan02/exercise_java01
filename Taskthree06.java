package com.assignment;
import java.util.Scanner;

public class Taskthree06 {

	public static void main(String[] args) {
		
			int condition = 0;
			Scanner scan = new Scanner(System.in);
			do {
				int firstNumber = 0;
				int secondNumber = 0;
				int sumOfNumbers = 0;
				System.out.println("Please provide first numbler and press Enter: ");
				firstNumber = scan.nextInt();
				System.out.println("Please provide second numbler and press Enter: ");
				secondNumber = scan.nextInt();
				sumOfNumbers = firstNumber + secondNumber;
				System.out.println("Sum of entered numbers: " + sumOfNumbers);
				System.out.println("Wont try again?Yes- press 1 or no-press 2 and press Enter: ");
				condition = scan.nextInt();
			} while (condition != 2);
			scan.close();
		}
}
