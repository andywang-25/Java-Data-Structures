//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Andy Wang 

import java.util.LinkedList;
import java.util.Scanner;
import static java.lang.System.*;
import java.util.*;

public class HashTable
{
	private LinkedList[] table; 

	public HashTable() //constructer 
	{
		table = new LinkedList[10]; //linkedlist size of ten 
		for (int i = 0; i < table.length; i++) { 
			table[i] = new LinkedList<>(); //populate each array within 

		}
	}

	public void add(Object obj) //add word to table method 
	{
		int i = obj.hashCode();	//take the objects hashcode (other algorithm)
		System.out.println("adding: " + obj + ". to: " + i); //print statement 

		if (!(table[i].contains(obj))) { //check if the table contains the word 
			table[i].add(obj); //adds word
		}
	}
		

	public String toString() //toString, prints out the table 
	{
		String output="HASHTABLE\n";
		for (int i = 0; i < table.length; i++) { //for loop iterating through each array 
			output += i + " " + table[i] + "\n"; 

		}

		return output; 

	}
}