import java.util.Scanner;
import java.util.Random;
public class Program7 {

	public static void main(String[] args) {
		// Project:				Program 7
		// Author:				Caleb Voorhees
		// Github:				cvoorhees15
		// Description:			Use of a 2d array 
		// Date:				Nov 1, 2019
		// Version: 			1.0
		
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		Random randomScore = new Random();
		
		// Declare variables
		int homeTotal = 0;
		int awayTotal = 0;
		String homeTeam = "";
		String awayTeam = "";
		int periods = 0;
		// Initial output 
		System.out.println("Welcome to tech ball - Score as much as you can but no team can score more than 50 points in a period.");
		System.out.println("======================================================================================================");
		System.out.println("\nHow many periods will you run?");
		periods = keyboard.nextInt();
		
		// 2d Array 
		int[][] scores = new int [2][periods];
		
		// Column loop
		for (int col = 0; col < scores[0].length; col++)
		{
			for(int row = 0; row < scores.length; row++)
			{
				// Collect info for home team 
				if (row == 0)
				{
					scores[row][col] = randomScore.nextInt(50 - 1);
					homeTotal+= scores[row][col];
					homeTeam = homeTeam + scores[row][col] + "\t";
				}
				
				// Collect info for away team
				if (row==1)
				{
					scores[row][col] = randomScore.nextInt(50 - 1);
					awayTotal += scores[row][col];
					awayTeam = awayTeam + scores[row][col] + "\t";				}
			}
		}
	System.out.println("Home Team: " + homeTeam + "---> " + homeTotal);
	System.out.println("Away Team: " + awayTeam + "---> " + awayTotal);
	
	if (homeTotal > awayTotal)
	
		System.out.println("\nHome team wins!");
	
	else
	
		System.out.println("\nAway team wins!");
		
	
		
	}

}
