//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Andy Wang, Algs and Data Structure 

import static java.lang.System.*;

public class StackTestRunner
{
	public static void main ( String[] args )
	{
		StackTester test = new StackTester("a b c d e f g h i"); //new test 
		out.print(test); //prnt out the test stack 
		test.popEmAll(); //print out all popped values 

		test.setStack("1 2 3 4 5 6 7 8 9 10"); //new test 
		out.println(test);//prnt out the test stack 
		test.popEmAll();//print out all popped values

		test.setStack("# $ % ^ * ( ) ) _"); //new test 
		out.println(test);//prnt out the test stack 
		test.popEmAll();//print out all popped values
	}
}
