import java.util.Scanner;
public class Account {
	
	Scanner keyboard = new Scanner(System.in); 
	
	
	// Menu displaying method
		public void mainMenu()
		{
			System.out.println("Main Menu");
			System.out.println("=========");
			System.out.println("1.) Make Deposit");
			System.out.println("2.) Withdrawal Funds");
			System.out.println("3.) Check Balance");
			System.out.println("4.) Exit");
			System.out.println("What would you like to do? ");
		}
	
	// Depositing method
	double deposit(double amount, double balance)
	{
		System.out.println("How much would you like to deposit? ");	
		amount = keyboard.nextDouble();
		System.out.println("Your balance is now ");
		return amount + balance;
		
	}
	
	// Withdrawing method
	double withdrawal(double amount, double balance)
	{
		System.out.println("How much would you like to withdrawal? ");
		amount = keyboard.nextDouble();
		if (balance < amount)
		{
			System.out.println("You have insufficient funds. Balance is");
			return balance;
		}
		
		else
		{	
			System.out.println("Your new balance is ");
			return balance - amount;
		}
		
		
		
	}
	
	
	// Balance displaying method
	 double displayBalance(double balance)
	{

		System.out.println("Your balance is: ");
		return balance;
	}
	
	

}
