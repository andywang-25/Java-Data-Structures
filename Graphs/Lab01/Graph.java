//(c) A+ Computer Science
//www.apluscompsci.com

//Name -Andy Wang, Algs and Data Structures, Winter Term 

import java.util.Map;
import java.util.TreeMap;

public class Graph
{
	private TreeMap<String, String> map;
	private boolean found;

	public Graph(String line)
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

	public boolean contains(String letter) //check if letter is in map 
	{
	   if (map.get(letter)==null)
	       return false;
		return true; 
	}

	public void check(String first, String second, String placesUsed)
	{
		if (first.equals(second)) //direct connection. Does AB connection exist? AB is directly connected to each other 
			found = true; 

		else {
			String conList = map.get(first); 
			for (int i = 0; i < conList.length(); i++) 
				if (placesUsed.indexOf(conList.substring(i,i+1))<0)
					check(conList.substring(i,i+1), second, placesUsed+first); 
		}
	}

	public String toString()
	{
		if (found)
			return "CONNECTS";
		return "DOES NOT CONNECT"; 
	}
}