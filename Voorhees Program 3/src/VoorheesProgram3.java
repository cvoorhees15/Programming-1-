// Import Scanner
import java.util.Scanner;

public class VoorheesProgram3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Project:		Program 3
		// Author:		Caleb Voorhees
		// Github:		cvoorhees15
		// Description	Working with loops.
		// Date 		Sep 24, 2019
		// Version		1.0
		
		// Declare variables
		String name;
		int number;
		
		// Ask user for name and age
		Scanner keyboard = new Scanner(System.in);
		System.out.print("What is your name?");
		name = keyboard.next();
		System.out.print("Hello " + name + "," + " Choose a number 0-100.");
		number = keyboard.nextInt();
		
		// Give output based on users chosen number
		while (number >= 100 || number <= 0)
		{
			System.out.println("Your answer was invalid. Choose a number 0-100");
			number = keyboard.nextInt();
		}
			System.out.println("Thank you for your input, " + name + ".");
		
		// Count down from users number to zero
		for(int i = number;i<=100 && i>0 ;i--)
		{
			if (i <= 100)
			{
				System.out.println(i + " is droppin like its hot down to " + (i-1) + ".");
			}
		}
		
		// Closing keyboard
		keyboard.close();
		
		
		
		
		

	}

}
