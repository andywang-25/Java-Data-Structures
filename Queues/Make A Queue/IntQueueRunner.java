//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Andy Wang, Algs and Data Structures, Fall 

//ArrayList of ints
//or
//array of ints  

import java.util.ArrayList;
import static java.lang.System.*;

public class IntQueueRunner
{
	public static void main ( String[] args )
	{
		IntQueue test = new IntQueue();
		test.add(5); //add item 
		test.add(7); //add item 
		test.add(9); //add item 
		System.out.println(test); //print the arraylist 
		System.out.println(test.isEmpty()); //print if empty 
		System.out.println(test.remove());//print removed item
		System.out.println(test.peek()); //print the first item  
		System.out.println(test.remove());//print removed item
		System.out.println(test.remove()); //print removed item
		System.out.println(test.isEmpty()); //print if empty 
		System.out.println(test); //print the arraylist 
	}
}