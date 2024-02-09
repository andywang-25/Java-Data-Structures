//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Andy Wang 

import static java.lang.System.*;

public class ListFunHouseTwo
{
	private ListNode theList;
	
	public ListFunHouseTwo()
	{

		theList = null; //set first to null 

	}
	
	public void add(Comparable data)
	{

		theList = new ListNode(data, theList); //add another node 

	}
	
	//this method will return the number of nodes present in list
	public int nodeCount()
	{
		int count=0; //count =0
		ListNode list=theList; //create node to go through linked list 
			while(list!=null) { //while not null  
				count++;  //add to count 
				list=list.getNext();
			}
		return count;
	}
		
	//this method will create a new node with the same value as the first node and add this
	//new node at the front of the list.  Once finished, the first node will occur twice.
	public void doubleFirst()
	{
		theList = new ListNode(theList.getValue(),theList); //make new node, same value as first, and points to first 
	}

	//this method will create a new node with the same value as the last node and add this
	//new node at the end.  Once finished, the last node will occur twice.
	public void doubleLast()
	{
		ListNode list = theList;
		while(list!=null && list.getNext()!=null) { //go to end of linked list 
			list = list.getNext();
		}
		ListNode add = new ListNode(list.getValue(), null); //creating new node using current (last) value so that it points to it
		list.setNext(add); //add the next node tro the end of the list 
	}
	
	//method skipEveryOther will remove every other node
	public void skipEveryOther()
	{

		while(theList!=null && theList.getNext()!=null) { //while not null and next not null 
			theList.setNext(theList.getNext().getNext()); //set current to point to next next 
			theList = theList.getNext().getNext(); //move the current to next next 
		}



	}

	//this method will set the value of every xth node in the list
	public void setXthNode(int x, Comparable value)
	{
		int count = 1; //count = 1 
		while (theList.getNext()!=null) { //while next is not null 
			if (count%x==0) {  //if count is reached 
				theList.setValue(value); //set value of node to the specified value 
			}
			theList =theList.getNext(); //move through list 
			count++; //increase count 
		}
	}	

	//this method will remove every xth node in the list
	public void removeXthNode(int x)
	{
		int count = 1; //count = 1 
		while (theList.getNext()!=null %% theList!=null) { //while current and next are not null   
			if (count%x==0) { //if count is reached 
				theList.setNext(theList.getNext().getNext()); //set next to next next, skipping the next node, essentially removing it 
			}
			theList =theList.getNext(); //move along linked list 
			count++; //increase count 
		}
	}		
	//this method will return a String containing the entire list
   public String toString()
   {
   	String output=""; //add to output string 
	ListNode list = theList; //run through linked list 
	while(list!=null) {
		output += list.getValue() + " "; //add node's value to output string 
		list=list.getNext();
	}
   	return output;
   }			
	
}