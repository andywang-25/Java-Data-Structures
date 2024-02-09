//(c) A+ Computer Science
//www.apluscompsci.com

//Name -Andy Wang, Algs and Data Structure 

//ArrayList of ints
//or
//array of ints

import java.util.ArrayList;
import static java.lang.System.*;

public class IntStack
{
	//pick your storage for the stack
	//you can use the an array or an ArrayList

	//option 1
	private int[] rayOfInts;
	private int numInts;

	//option 2
	private ArrayList<Integer> listOfInts; //atrray list 

	public IntStack()
	{
		listOfInts = new ArrayList<Integer>(); //new array list, listOfInts

	}

	public void push(int item)
	{
		listOfInts.add(item); //add int input item to the array list 

	}

	public int pop()
	{
		return listOfInts.remove(listOfInts.size()-1); //return the removal of the last item from the array list 
	}

	public boolean isEmpty()
	{
		if (listOfInts.size()==0) return true; //if the size of array is 0, it is empty so return true 
		return false; //return false, it is not empty 
	}

	public int peek()
	{
		return listOfInts.get(listOfInts.size()-1); //return the item at the last index 
	}

	public String toString()
	{
		return ""+listOfInts; //to string, print the array list 
	}
}