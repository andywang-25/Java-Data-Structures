//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class ShortestPathGraphRunner
{
	public static void main( String[] args ) throws IOException
	{
		Scanner file = new Scanner(new File("graph2.dat"));
		int howManyTimes = file.nextInt();
		file.nextLine(); //get rid of return at end of int 
		for(int x=0; x<howManyTimes; x++)
		{
			String input = file.nextLine(); //takes in the list of numbers 
			ShortestPathGraph test = new ShortestPathGraph(input); //create graph out of all those numbers 

			input = file.nextLine(); //the two characters 
			String start = input.substring(0,1); //first character 
			String stop = input.substring(1,2);  //second character 

			if (test.contains(start) && test.contains(stop)) //check if test even contains both of the numbers 
				test.check(input.substring(0,1), input.substring(1,2), "", 0);  //then check if they are CONNECTED to each other 
			
			out.println(start + " connects to: " + stop + " == " + test);  //print if they are or not connected 
		}
	}
}