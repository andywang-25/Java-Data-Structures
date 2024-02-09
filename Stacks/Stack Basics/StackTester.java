//(c) A+ Computer Science
//www.apluscompsci.com

//Name -Andy Wang, Algs and Data Structure 

import java.util.Stack;
import static java.lang.System.*;

public class StackTester
{
	private Stack<String> stack; //setup global variable called stack 

	public StackTester() //basic constructor 
	{
		setStack(""); 
	}

	public StackTester(String line) //passes input of a string 
	{
		setStack(line); //set the stack to the string input 
	}
	
	public void setStack(String line)
	{ //add items into the stack 
		stack = new Stack<String>(); //new stack created 
		for (String s : line.split(" ")) { //seperate each character and push onto the stack 
			stack.push(s); //add the character into the stack 
		}
	}

	public void popEmAll()
	{ //pop all items from the stack 
		out.println("popping all items from the stack"); //print statement 
		while (stack.isEmpty()!=true) { //while there are still elements inside the stack...
			out.print(stack.pop() + " "); //print out what the stack is popping 
		}
		out .println("\n\n\n"); //three line gap after finished 
	}

	public String toString()
	{  //to string method 
		return ""+stack+"\n"; //print out stack 
	}

}