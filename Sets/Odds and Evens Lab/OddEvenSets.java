//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import java.util.Set;
import java.util.TreeSet;
import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;

public class OddEvenSets
{
	private Set<Integer> odds;
	private Set<Integer> evens;

	public OddEvenSets()
	{
		odds = new TreeSet<Integer>();
		evens = new TreeSet<Integer>();
	}

	public void GetEvenOdds(String input)
	{
		String[] list = input.split(" "); //takes the inputted string, adds each word/character that is seperated by a space 
		for (String s : list) { //for every word/character in the list...
			int i = Integer.parseInt(s); //turn the character into a integer
			if (i%2==1) { //if mod 2 == 1, it is an odd number. 
				odds.add(i); //add the odd number to the odd set 
			}
			else {
				evens.add(i); //else the number is even, add it to even set 
			}
		}
	}

	public String toString()
	{
		return "ODDS : " + odds + "\nEVENS : " + evens + "\n\n"; //to string method 
	}
}