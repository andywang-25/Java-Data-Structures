//(c) A+ Computer Science
//www.apluscompsci.com

//Name -Andy Wang, Algs and Data Structure 

//ArrayList of ints
//or
//array of ints

import java.util.ArrayList;
import static java.lang.System.*;

public class IntStackRunner
{
	public static void main ( String[] args )
	{
		IntStack test = new IntStack(); //make new stack 
		test.push(5); //add item 
		test.push(7); //add item
		test.push(9);//add item
		System.out.println(test); //print out stack
		System.out.println(test.isEmpty()); //print out if empty 
		System.out.println(test.pop()); //print out pop 
		System.out.println(test.peek()); //print out peek 
		System.out.println(test.pop()); //print out pop
		System.out.println(test.pop());//print out pop
		System.out.println(test.isEmpty()); //print out if empty 
		System.out.println(test); //print out stack 

		//expand the test cases to test the class more thoroughly

	}
}