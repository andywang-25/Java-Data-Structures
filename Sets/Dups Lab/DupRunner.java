//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import static java.lang.System.*;
import java.util.*;

public class DupRunner
{
	public static void main( String args[] )
	{

		UniquesDupes r = new UniquesDupes(); //create new uniqutesdupes r 

		String data1 = "a b c d e f g h a b c d e f g h i j k"; //first string of data, called data1
		String data2 = "one two three one two three six seven one two"; //second string of data, called data2
		String data3 = "1 2 3 4 5 1 2 3 4 5 1 2 3 4 5 6"; //third string of data, called data3 

		System.out.println(r.getUniques(data1)); //print out uniques from data1
		System.out.println(r.getDupes(data1)); //print out dupes from data1 

		System.out.println(r.getUniques(data2));//print out uniques from data2
		System.out.println(r.getDupes(data2));//print out dupes from data2

		System.out.println(r.getUniques(data3));//print out uniques from data3
		System.out.println(r.getDupes(data3));//print out dupes from data3 


	}
}