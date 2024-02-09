//(c) A+ Computer Science
//www.apluscompsci.com

//Name -Andy Wang 

import java.util.LinkedList;
import java.util.Scanner;
import java.io.File;
import static java.lang.System.*;
import java.io.*;
public class HashTableRunner

{
  public static void main ( String[] args )
  {
		try{

			HashTable table = new HashTable(); //new hashtable 
			Scanner file = new Scanner(new File("numbers.dat")); //read from numbers.dat 

			file.nextLine(); //skip the first number 

			while (file.hasNextLine()) { //if next line 
				Number num = new Number(file.nextInt()); //create number 
				System.out.println("value of num is: " + num.getValue()); //print statement 
				table.add(num); //add it 
			}
			System.out.println("done");
	
			System.out.println(table.toString()); //print out the table 
			}


		catch(Exception e)
		{
			System.out.println(e);
		}
  }
}