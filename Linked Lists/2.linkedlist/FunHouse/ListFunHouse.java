//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Andy Wang 

import static java.lang.System.*;

public class ListFunHouse
{
	//this method will print the entire list on the screen
   public static void print(ListNode list)
   {
	String output = "";
	while (list !=null) { //while not null 
		output += list.getValue() + " "; //add to oytput string 
		list = list.getNext();
	}
	System.out.println(output);
   }		
	
	//this method will return the number of nodes present in list
	public static int nodeCount(ListNode list)
	{
   	int count=0;
	   while (list !=null) { //while not null 
		   count++; //add to count 
		   list = list.getNext(); //move along 
	   }
	   return count;
	}
		
	//this method will create a new node with the same value as the first node and add this
	//new node to the list.  Once finished, the first node will occur twice.
	public static void doubleFirst(ListNode list)
	{
		list.setNext(new ListNode(list.getValue(),list.getNext())); //adds another to front of same value 
	}

	//this method will create a new node with the same value as the last node and add this
	//new node at the end.  Once finished, the last node will occur twice.
	public static void doubleLast(ListNode list)
	{
		while (list.getNext() !=null) { //while the next pointer is not null (it still points at something, not the last one)	
			list = list.getNext(); //set the next list as the next list value 
		}

		list.setNext(new ListNode(list.getValue(),null)); //exit while loop, set the las tone with value of previous node, point at nothing
		
	}
		
	//method skipEveryOther will remove every other node
	public static void skipEveryOther(ListNode list)
	{

		while (list!=null && list.getNext()!=null) {  //while current and next are not null 
			list.setNext(list.getNext().getNext()); //set pointer to next next 
			list = list.getNext(); //iterate to next 
		}

	}

	//this method will set the value of every xth node in the list
	public static void setXthNode(ListNode list, int x, Comparable value)
	{
		int count=1;
		while (list!=null) {
		if (count%x==0) { //if is every x...
			list.setValue(value); //set the current node to value 
		}
		list = list.getNext(); //else, set current to next node 
		count++; //incresase counter 
		}
	}
	

		

	//this method will remove every xth node in the list
	public static void removeXthNode(ListNode list, int x)
	{
		int counter = 1;
		ListNode temp = list; //create new node temp, value is current node 
		ListNode prev = null; //create new node prev, value null

		while(temp.getNext() != null){
			if(counter%x == 0){ //if at counter 
				prev.setNext(temp.getNext()); //set the previous node to point at current nodes get next 
			}
			
			//moves code forwards 
			prev = temp; //set previous to current node 
			temp = temp.getNext(); //set current node advance 1 forwards 
			counter++; //increase counter 
		}
		
		temp = null;
	}		
}