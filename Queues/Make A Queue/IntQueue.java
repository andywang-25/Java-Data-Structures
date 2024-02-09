//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Andy Wang, Algs and Data Structures, Fall 

//ArrayList of ints
//or
//array of ints

import java.util.ArrayList;
import static java.lang.System.*;

public class IntQueue
{
	//pick your storage for the queue
	//you can use the an array or an ArrayList

	//option 1
	private int[] rayOfInts;
	private int numInts;

	//option 2
	private ArrayList<Integer> listOfInts;

	public IntQueue()
	{
		listOfInts = new ArrayList<>(); //new arraylist 
	}

	public void add(int item)
	{
		listOfInts.add(item); //add to arraylist the inputed item
	}

	public int remove()
	{
		return listOfInts.remove(0); //remove the first index 
	}

	public boolean isEmpty()
	{
		if (listOfInts.size()==0) return true; //if size is 0, then return true 
		return false; //else return false 
	}

	public int peek()
	{
		return listOfInts.get(0); //return the first item 
	}

	public String toString()
	{
		return ""+listOfInts; //toString print the listOfInts arraylist 
	}
}