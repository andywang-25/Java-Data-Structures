//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import java.util.Map;
import java.util.TreeMap;
import java.util.Scanner;
import static java.lang.System.*;



public class SpanishToEnglish
{
	private Map<String,String> pairs;

	public SpanishToEnglish()
	{
		pairs = new TreeMap<String,String>(); //instantiate new treemap
	}


	public void putEntry(String entry)
	{
		String[] list = entry.split(" "); //takes the next input, turns into an array, one word per element 
		pairs.put(list[0],list[1]);  //first element of array is spanish, second array is english
	}

	public String translate(String sent)
	{
		Scanner chop = new Scanner(sent); //chop is new scanner of the new line that is inputted (sentence)
		String output =""; //output string 

		while(chop.hasNext()) { //while there are words left..
			output += " " + pairs.get(chop.next()); //output string adds english translation, finds the spanish word in pairs (map) and returns english value 

		}

		return output; //once none words left in chop, then return the answer 

	}

	public String toString()
	{
		return pairs.toString().replaceAll("\\,","\n");
	}
}