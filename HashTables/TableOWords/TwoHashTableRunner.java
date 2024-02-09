//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Andy Wang 

import java.util.LinkedList;
import java.util.Scanner;
import java.io.File;
import static java.lang.System.*;
import java.io.*;
public class TwoHashTableRunner

{
  public static void main ( String[] args )
  {
		try{

			HashTable table = new HashTable(); //create new hashtable 
			Scanner file = new Scanner(new File("words.dat")); //read from words.dat file 

			file.nextLine(); //skip the first number as i am using while loop

			while (file.hasNextLine()) { //while there is still next line 
				Word word = new Word(file.nextLine().trim()); //create new word class using the trimmed word 
				table.add(word); //add the word to table (creates hashcode first, then the table sorts it to proper location)
			}
			System.out.println("done");
		
			System.out.println(table.toString()); //print out final table
			}


		catch(Exception e)
		{
			System.out.println(e);
		}
  }
}