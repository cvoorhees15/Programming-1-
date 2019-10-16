import java.util.Scanner;
public class Program5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Open keyboard
		Scanner keyboard = new Scanner(System.in);
		
		// User inputs age
		System.out.println("How old are you?");
		int age = keyboard.nextInt();
		
		// User chooses 1 or 2
		System.out.println("Would you like to find out if you can... \n\n\t1. drink \n\n\t2. drive");
		int drinkDrive = keyboard.nextInt();
		switch (drinkDrive)
		{
		case 1:
			System.out.println(canYouDrink(age));
			break;
		case 2:
			System.out.println(canYouDrive(age));
			break;
		default:
			System.out.println("Your choice was invalid. Please choose 1 or 2");
		}
		
		// User inputs max lift amounts for each type of lift
		System.out.println("\nEnter your maximum weight for each lift");
		System.out.println("\n\n\tDead Lift:");
		int deadLift = keyboard.nextInt();
		System.out.println("\n\n\tBench Press:");
		int benchPress = keyboard.nextInt();
		System.out.println("\n\n\tSquat");
		int squat = keyboard.nextInt();
		weightLifted(deadLift, benchPress, squat);
		
		
		
		keyboard.close();	

	}
	
	// Three Methods
	
	//  Receives and returns 
	public static String canYouDrink(int age)
	{
	 String yes = "Yes, you may have a drink.";
	 String no = "No, you cannot have a drink.";
		if (age > 21)
			{
			return yes;
			}
		else
			{
			return no;
			}
	}
	
	// Receives and returns	
	public static String canYouDrive(int age)
	{
	String yes = "Yes, you may go for a drive.";
	String no = "No, you cannot drive.";
		if (age > 16)
			{
			return yes;
			}
		else
			{
			return no;
			}
	}
	
	// Receives only
	public static void weightLifted(int deadLift, int benchPress, int squat)
	{
		int total = deadLift + benchPress + squat;
	}
	
	






}


