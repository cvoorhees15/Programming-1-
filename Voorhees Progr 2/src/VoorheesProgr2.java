import java.util.Scanner;

public class VoorheesProgr2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Project: 						Program 2
				// Author: 							Caleb Voorhees
				// Github:							cvoorhees15
				// Description:						Working with If Else & Switch 
				// Date:							Sept 17, 2019
				// Version							1.0
				
				// Opening Keyboard
				Scanner keyboard = new Scanner(System.in);
				int firstNumber;
				int secondNumber;
				int thirdNumber;
				int Operation;
				
				// Number input
				System.out.println("What is your first number?");
				firstNumber = keyboard.nextInt();
				System.out.println("What is your second number?");
				secondNumber = keyboard.nextInt();
				System.out.println("What is your third number?");
				thirdNumber = keyboard.nextInt();
				
				int answer = 0;
				
				//Calculator Menu
				System.out.println("Calculator Menu");
				System.out.println("===============\n");
				System.out.println("\t1.) Addition ");
				System.out.println("\t2.) Subtraction ");
				System.out.println("\t3.) Multiplication ");
				System.out.println("\t4.) Division ");
				System.out.println("\nChoose an operation (1-4)");
				Operation = keyboard.nextInt();
				
				// Results for each operation
				switch (Operation)
				{
				case 1:
					answer = (firstNumber + secondNumber);
					System.out.println("Your first and second number added together equals: " + (answer));
					break;
				case 2:
					answer = (firstNumber - secondNumber);
					System.out.println("Your first number subtracted from your second number equals: " + (answer));
					break;
				case 3:
					answer = (firstNumber * secondNumber);
					System.out.println("Your first number multiplied by your second number equals: " + (answer));
					break;
				case 4:
					answer = (firstNumber / secondNumber);
					System.out.println("Your first number divided by your second number equals: " + (answer));
					break;
				default: System.out.println("Your choice was invalid.");
				}
				
				// Comparing users answer to their third number
				if (answer > thirdNumber)
				{
					System.out.println(answer + " is greater than " + thirdNumber);
				}
				else
				{
					System.out.println(answer + " is less than " + thirdNumber);
				}
			
				// Closing keyboard	
				keyboard.close();


	}

}
