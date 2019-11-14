// Import Packages 
import java.util.Scanner;
import java.io.*;

public class VoorheesProg8 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		// Project: 		Program 8+9
		// Author:			Caleb Voorhees
		// Github:			cvoorhees15
		// Description		File input/output
		// Date				Nov 14, 2019
		// version			1.0

		try
		{
			// Open output file 
			FileWriter fw = new FileWriter("/Users/c.voorhees/Desktop/gradeStats.txt", true);
			PrintWriter outputFile = new PrintWriter(fw);

			// Open input file 
			File fr = new File("/Users/c.voorhees/Desktop/grades.txt");
			Scanner inputFile = new Scanner (fr);

			// Total variables
			int totalGrades = 0;
			int gradeCounter = 0;


			while (inputFile.hasNext())
			{
				int grade = inputFile.nextInt();
				totalGrades += grade;
				gradeCounter++;

			}


			// Output data to file
			outputFile.println("Grade statistics");
			outputFile.println("================");
			outputFile.println("Total Points: " + totalGrades);	
			outputFile.println("Total Assignments: " +gradeCounter);
			outputFile.println("Average Score: " + (totalGrades/gradeCounter));


			// Close files
			outputFile.close();
			inputFile.close();
		}
		catch (EOFException error)
		{
			System.out.println("Sorry, I seem to have reached the end of the file, ");
			System.out.println("Error Message: " + error.getMessage());
		}
		catch (FileNotFoundException error) 
		{
			System.out.println("Sorry, I cannot seem to find that file");
			System.out.println("Error Message: " + error.getMessage());  
		}

	}

}
