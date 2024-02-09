//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import java.util.Set;
import java.util.TreeSet;
import java.util.Arrays;
import static java.lang.System.*;

public class MathSet
{
	private Set<Integer> one;
	private Set<Integer> two;

	public MathSet()
	{ //basic constructor 
		one = new TreeSet<Integer>();
		two = new TreeSet<Integer>();
	}

	public MathSet(String o, String t)
	{ //constructor with arguments, which should be the next two lines in the data set 
		one = new TreeSet<Integer>(); //first set
		two = new TreeSet<Integer>(); //second set 
		String[] list = o.split(" "); //takes the inputted string, adds each word/character that is seperated by a space 
		for (String s : list) { //for every word/character in the list...
			int i = Integer.parseInt(s); //transform from string into an integer 
			one.add(i); //add to the first set 
		}
		String[] list2 = t.split(" "); //takes the inputted string, adds each word/character that is seperated by a space 
		for (String s : list2) { //for every word/character in the list...
			int i = Integer.parseInt(s); //transform from string into an integer 
			two.add(i); //add to second set 
		}


	}

	public Set<Integer> union()
	{ //add set one and two together 
		Set<Integer> union = new TreeSet<Integer>(one); //create temp copy of set one 
		union.addAll(two); //add all elements from set two into temp copy of set one 
		return union; //return the end result 
		
	}

	public Set<Integer> intersection()
	{ //check for intersection between the two sets 
		Set<Integer> intersection = new TreeSet<Integer>(one); //create temp copy of set one 
		intersection.retainAll(two); //retain all elements from set two 
		return intersection; //return end result 
		
	}

	public Set<Integer> differenceAMinusB()
	{ //difference of elements from a to b, subtract b elements from a 
		Set<Integer> difference = new TreeSet<Integer>(one); //create temp copy of set one 
		difference.removeAll(two); //remove all elements of set two from set one 
		return difference; //return end result 
	}

	public Set<Integer> differenceBMinusA()
	{ //very similar to method above, just reverse 
		Set<Integer> difference = new TreeSet<Integer>(two); //create temp copy of set one 
		difference.removeAll(one); //remove all elements of set one from set two 
		return difference; //return end result 

	}
	
	public Set<Integer> symmetricDifference()
	{ //its just the difference from a-b and the difference from b-a combined together, so basically combine the two methods above
		Set<Integer> difference1 = new TreeSet<Integer>(two); //temp copy of 2 
		difference1.removeAll(one);
		Set<Integer> difference2 = new TreeSet<Integer>(one); //temp copy of 1 
		difference2.removeAll(two); //remove all elements from set 2 from set 1
		difference1.addAll(difference2); //then add all elements from set 1 to set 2 
		return difference1; //return final result 
	}	
	
	public String toString()
	{ //to string method, prints out the sets 
		return "Set one " + one + "\n" +	"Set two " + two +  "\n";
	}
}