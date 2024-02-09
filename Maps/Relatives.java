//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Scanner;
import static java.lang.System.*;

public class Relatives
{
	private Map<String,Set<String>> map;

	public Relatives()
	{
		map = new TreeMap<String, Set<String>>(); //new treemap 
	}

	public void setPersonRelative(String line)
	{
		String[] personRelative = line.split(" "); //create the next line into a array, seperate each element in array by the space  
		String person = personRelative[0]; //first word is the person
		String relative = personRelative[1]; //second word is the relative 

		if (map.containsKey(person)) { //if the person already exists in the system, just add the relative to their list 
			
			map.get(person).add(relative); //get the persons relative list, then add the relative onto that list 
		}

		else { //else, they are not in the system yet 
			Set<String> relatives = new TreeSet<String>(); //create a new treeset set
			relatives.add(relative); //add the new relative into this set
			map.put(person,relatives); //add this new relative set with one person to the person
		}

		

	}


	public String getRelatives(String person)
	{
		String output = ""; //output 
		output += (person + ", is related to: "); //the person is related to...

		for (String relatives: map.get(person)) { //for every element (relative) in the array the person has, append to output string 
			output += (relatives +", "); //
		}

		return output; //return and print 
		
	}


	public String toString()
	{
		String output  = "";
		return output;
	}
}