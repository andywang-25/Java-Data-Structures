//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.TreeSet;
import static java.lang.System.*;

public class BiDirectionalGraphRunner
{
	public static void main( String[] args ) throws IOException
	{
		Scanner file = new Scanner(new File("bidgraph.dat"));
		int howManyTimes = file.nextInt();
		file.nextLine(); //get rid of return at end of int 
		for(int x=0; x<howManyTimes; x++)
		{
			String input = file.nextLine(); //takes in the list of numbers 
			BiDirectionalGraph test = new BiDirectionalGraph(input); //create graph out of all those numbers 

			String[] names = file.nextLine().split(" "); 
			String start = names[0];
			String stop = names[1]; 

			if (test.contains(start) && test.contains(stop)) //check if test even contains both of the numbers 
				test.check(start, stop, new TreeSet<String>());  //then check if they are CONNECTED to each other 
			
			out.println(start + " connects to: " + stop + " == " + test);  //print if they are or not connected 
		}
	}
}