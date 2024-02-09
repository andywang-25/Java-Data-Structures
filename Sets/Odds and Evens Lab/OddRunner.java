//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class OddRunner
{
	public static void main( String args[] ) throws IOException
	{

		OddEvenSets r = new OddEvenSets(); //create new oddevensets called r 
		Scanner data = new Scanner(new File ("oddevent.dat")); //create scanner to input data 
		while(data.hasNextLine()) { //while there is still data left 
			r.GetEvenOdds(data.nextLine()); //call getevenodds using the next line 
			System.out.println(r.toString()); //print out the result 
		}
				
	}
}