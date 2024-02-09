//(c) A+ Computer Science
//www.apluscompsci.com

//Name -Andy Wang 

import java.util.LinkedList;
import java.util.Scanner;
import static java.lang.System.*;

public class HashTable
{
	private LinkedList[] table;

	public HashTable() //hashtable class 
	{ 
		table = new LinkedList[10]; //new table, size of 10 
		for (int i = 0; i < table.length; i++) {
			table[i] = new LinkedList<>(); //populate each array 

		}
	}

	public void add(Number obj)
	{
		int i = obj.hashCode(); //create hash code
		System.out.println("numbers hashcode is: " + i);
		System.out.println("adding: " + obj + ". to: " + i);
		if (table[i].contains(obj.getValue())) {  //check if table contains the obj 
			System.out.println("duplicate: " + obj);
			return;
		}
		else {
			System.out.println("adding");
			table[i].add(obj.getValue());//add the value to table 
		}
	}

	public String toString() //toString, prints out table 
	{
		String output="HASHTABLE\n";
		for (int i = 0; i < table.length; i++) {
			output += i + " " + table[i] + "\n";

		}

		return output; 

	}
}