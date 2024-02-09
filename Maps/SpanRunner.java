//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;
import java.io.*; 
import java.util.Map;
import java.util.TreeMap;

public class SpanRunner
{
	public static void main( String args[] ) throws IOException
	{
		SpanishToEnglish translator = new SpanishToEnglish(); 
		Scanner data = new Scanner(new File ("spantoeng.dat"));

		int val = data.nextInt(); //get the integer in the data file 

		data.next();

		for (int i = 0; i <val; i++) {
			translator.putEntry(data.nextLine()); //put in a new entry for the next line into the map 
		}
		while (data.hasNext()) {
			System.out.println(translator.translate(data.nextLine())); //translate the sentence 
		}
	}
}