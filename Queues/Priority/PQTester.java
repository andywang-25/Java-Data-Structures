//(c) A+ Computer Science
//www.apluscompsci.com

//Name -  Andy Wang, Algs and Data Structures, Fall

import java.util.Queue;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class PQTester
{
	private Queue<String> pQueue;

	public PQTester()
	{
		setPQ(""); //basic constructer 
	}

	public PQTester(String list)
	{
		setPQ(list); //constructer with list input 
	}

	public void setPQ(String list)
	{
		pQueue = new PriorityQueue<>(); //new priority queue
		for (String s : list.split(" ")) { //populate the queue
			pQueue.add(s);	//add string to pQueue
		}
	}
	
	public Object getMin()
	{
		return "getMin- " + pQueue.peek(); //get the min value from pQueue
	}
	
	public String getNaturalOrder()
	{
		String output="getNaturalOrder - "; //get the natural order 
		while(!pQueue.isEmpty()) { //while its not empty 
			output += " " + pQueue.remove(); //add the min value from pQueue
		}
		return output;	//return the natural order 
	}

	public String toString() {
		return "toString() - " + pQueue; //toString method returns pQueue
	}

}