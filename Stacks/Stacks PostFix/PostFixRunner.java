//(c) A+ Computer Science
//www.apluscompsci.com
//Name -Andy Wang, Algs and Data Structure 

import java.util.Stack;
import java.util.Scanner;
import static java.lang.System.*;

public class PostFixRunner
{
	public static void main ( String[] args )
	{
		PostFix test = new PostFix("2 7 + 1 2 + +"); //create new test using new data 
		test.solve();
		System.out.println("2 7 + 1 2 + + = " + test); //print out result 

		
		test.setExpression("1 2 3 4 + + +"); //create new test using new data
		test.solve();
		System.out.println("1 2 3 4 + + + = " + test); //print out result

		test.setExpression("9 3 * 8 / 4 +"); //create new test using new data
		test.solve();
		System.out.println("9 3 * 8 / 4 + =" + test); //print out result

		test.setExpression("3 3 + 7 * 9 2 / +"); //create new test using new data
		test.solve();
		System.out.println("3 3 + 7 * 9 2 / + =" + test); //print out result

		test.setExpression("9 3 / 2 * 7 9 * + 4 -"); //create new test using new data
		test.solve();
		System.out.println("9 3 / 2 * 7 9 * + 4 - =" + test); //print out result
		
		test.setExpression("5 5 + 2 * 4 / 9 +"); //create new test using new data
		test.solve();
		System.out.println("5 5 + 2 * 4 / 9 + =" + test);		//print out result
		
	}
}