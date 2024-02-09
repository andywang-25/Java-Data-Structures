//(c) A+ Computer Science
//www.apluscompsci.com

//Name -Andy Wang, Algs and Data Structures, Winter 

import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;
import java.util.Set;
import java.util.TreeSet;
import java.util.Scanner;
import static java.lang.System.*;

public class BiDirectionalGraph
{
	private TreeMap<String, TreeSet<String>> map;
	private boolean found;

	public BiDirectionalGraph(String line)
	{
		map = new TreeMap<String,TreeSet<String>>(); 
		Scanner chopper = new Scanner(line); //chops every word 
		
		while (chopper.hasNext()) {

			String first = chopper.next(); //string first is chopper's next word 
			String second = chopper.next(); //string second is chopper's next next word 

			if (map.get(first)==null) { //first does not exist, add it to the map with a new treeset associated with it 
				map.put(first, new TreeSet<String>()); 
			}
			map.get(first).add(second); 

			if (map.get(second)==null) {
				map.put(second, new TreeSet<String>());
			}
			map.get(second).add(first); 
		}
		found = false; 
	}

	public boolean contains(String name)
	{
		if (map.get(name)!=null) //if the map has name in it return true 
			return true;
		return false; //else return false 
	}

	public void check(String first, String second, TreeSet<String> placedUsed) //check if two names are connected to each other 
	{
		//base case: check for direct connection 
		if (first.equals(second)) 
			found = true; 
		else {
			TreeSet<String> conSet = map.get(first); //create new treeset of every name related to the first name 
			for (String name : conSet) { //for every name in the treeset that contains connected names to first 
				if (placedUsed.contains(name)==false) { //placedUsed keeps track of names already used 
					placedUsed.add(name); 
					check(name, second, placedUsed); 
					//placedUsed.remove(name); 
				}
			}
		}



	}

	public String toString()
	{
		if (found)
			return ("CONNECETD");
		return ("NOT CONNECTED"); 
	}
}