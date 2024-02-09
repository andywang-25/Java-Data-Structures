//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;
import java.util.Scanner;
import static java.lang.System.*;

public class ShortestPathGraph
{
	private TreeMap<String, String> map;
	private boolean found;
	private int shortest;

	public ShortestPathGraph(String line)
	{
		map = new TreeMap<String,String>(); 
		String[] list = line.split(" "); //split each two characters 
		for (String piece : list) {
			String first = piece.substring(0,1); 
			String second = piece.substring(1,2); 

			if (map.get(first)==null)
				map.put(first, ""); 
			if (map.get(second)==null)
				map.put(second,""); 
			
			map.put(first, map.get(first)+second); 
			map.put(second, map.get(second)+first); 

		}
		found = false; 
	}

	public boolean contains(String letter)
	{
		if (map.get(letter)==null)
			return false;
		return true; 
	}

	public void check(String first, String second, String placesUsed, int steps)
	{
		if (first.equals(second)) {//direct connection. Does AB connection exist? AB is directly connected to each other 
			found = true; 
			if (shortest == 0) { //check for the first case 
				shortest = steps;  //set the first case to the first case that works 
			}
			else if (steps < shortest) //if the number of steps is smaller than the current smallest number of steps 
				shortest = steps; 
		}
		else { //if no direct connectoin exists 
			String conList = map.get(first); //create conList that contains the connections 
			for (int i = 0; i < conList.length(); i++) 
				if (placesUsed.indexOf(conList.substring(i,i+1))<0) 
					check(conList.substring(i,i+1), second, placesUsed+first, steps+1); 
				
		}
	}

	public String toString()
	{
		if (found)
			return (" CONNECTS, in: " + shortest + " steps ");
		return (" DOES NOT CONNECT"); 
	}
}