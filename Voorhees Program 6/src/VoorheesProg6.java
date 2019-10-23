import java.util.Scanner;
public class VoorheesProg6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Project:			Program 6
		// Author:			Caleb Voorhees
		// Github:          cvoorhees15
		// Description:		Checking account using classes
		// Date:			Oct 23, 2019
		// Version			1.0

	// Adding new class
	Account account1 = new Account();
	
	//Bringing in keyboard
	Scanner keyboard = new Scanner(System.in);
	
	// Declaring variables
	double balance = 0.00;
	int menuChoice = 0;
	double depositAmount = 0.00;
	double withdrawalAmount = 0.00;
	
	// Menu enclosed in loop
	do
	{
		account1.mainMenu();
		menuChoice = keyboard.nextInt();
		
		switch (menuChoice)
		{
			case 1:
				System.out.println(balance = account1.deposit(depositAmount, balance));
				break;
			case 2:
				System.out.println(balance = account1.withdrawal(withdrawalAmount, balance));
				break;
				
			case 3:
				System.out.println(balance = account1.displayBalance(balance));
				break;
			case 4:
				System.out.println("Thank you! Have a nice day.");	
				break;
			default:
				System.out.println("Please enter a valid choice.");	
		}
		
	}while (menuChoice != 4);
	
	// Close keyboard
	keyboard.close();

}
	
		
		
	}

