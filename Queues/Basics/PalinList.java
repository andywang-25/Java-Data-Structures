//(c) A+ Computer Science
//www.apluscompsci.com

//Name -Andy Wang, Algs and Data Structures, Fall Term 

import java.util.Queue;
import java.util.Stack;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.LinkedList;

public class PalinList
{
	private Queue<String> queue;
	private Stack<String> stack;
	private Stack<String> stack2;


	public PalinList()
	{
		setList(""); //basic constructer 
	}

	public PalinList(String list)
	{
		setList(list); //constructer with string input 
	}

	public void setList(String list) //set list
	{
		stack2 = new Stack<String>();
		stack = new Stack<String>();
		queue = new LinkedList<String>();
		for (String s : list.split(" ")) { //populate the stack and queue
			stack.add(s); //add to stack 
			queue.add(s); //add to queue
			stack2.add(s); //add to stack2
		}
	}

	public boolean isPalin()
	{ //check if palin 
		if (stack.pop().equals(queue.remove())) return true; //check if they are palin by removing first 
		return false;						//element of queue and last element of stack, where stack and queue have the same values 
	}

	public String toString() { //tostring method 
		if (isPalin()) return (stack2 + " is a palinlist \n"); //print it is palinlist 
		return (stack2 + " is not a palinlist \n"); //print it is not palinlist 

	}


	//write a toString method
}