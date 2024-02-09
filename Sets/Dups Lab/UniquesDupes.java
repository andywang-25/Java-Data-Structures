//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import java.util.Set;
import java.util.TreeSet;
import java.util.Arrays;
import java.util.ArrayList;
import static java.lang.System.*;

public class UniquesDupes
{
	public static Set<String> getUniques(String input)
	{
		Set<String> uniques = new TreeSet<String>();
		
		String[] list = input.split(" "); //takes the inputted string, adds each word/character that is seperated by a space 
		for (String s : list) { //for every word/character in the list...
			uniques.add(s); //add it to the set 
		}

		return uniques; //return uniques 
	}

	public static Set<String> getDupes(String input)
	{
		Set<String> dupes = new TreeSet<String>();
		Set<String> uniques = new TreeSet<String>();

		
		String[] list = input.split(" "); //takes the inputted string, adds each word/character that is seperated by a space 
		for (String s : list) { //for every word/character in the list...
			if (!(uniques.add(s))) {
				dupes.add(s);
			} //add it to the set 
		}



		return dupes; //return dupes 
	}
}