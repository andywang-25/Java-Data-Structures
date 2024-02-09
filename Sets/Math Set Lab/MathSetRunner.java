//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class MathSetRunner
{
	public static void main(String args[]) throws IOException
	{
		Scanner data = new Scanner(new File ("mathsetdata.dat")); //create scanner for data 
		while(data.hasNextLine()) { //while there is still data 
			MathSet w = new MathSet(data.nextLine(), data.nextLine()); //create new class with the next 2 lines 
			System.out.println(w.toString()); //print out the two sets 
			System.out.println("Union" + w.union()); //print out union
			System.out.println("Intersection: " + w.intersection()); //print out intersection 
			System.out.println("difference A-B: " + w.differenceAMinusB()); //print out difference a-b
			System.out.println("difference B-A: " + w.differenceBMinusA()); //print out different b-a
			System.out.println("Symmetric difference: " + w.symmetricDifference() + "\n" + "\n"); //print out symmetric difference 
		}
	}
}
