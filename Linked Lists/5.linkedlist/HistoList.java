//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Andy Wang 

public class HistoList
{
	private ListNode front;

	public HistoList()
	{
		front = null;
	}


	//ADDS NEW NODE TO THE FRONT OF THE LIST FOR LET IF IT DOES NOT EXIST.
	//IF IT EXISTS, IT BUMPS UP LET'S COUNT BY ONE
	public void add(Object obj)
	{
		if(indexOf(obj) == -1){ // If object is not in list 
			// create a new node with object
			front = new ListNode(new ThingCount(obj, 1), front);
		} else { //if object in list 
			ListNode current = nodeAt(indexOf(obj)); // Get the node at the index of the object
			
			((ThingCount)current.getValue()).setCount(((ThingCount)current.getValue()).getCount()+1);// Get the ThingCount object from the node and increment its count
		}
	}

	//RETURNS THE INDEX POSITION OF LET IN THE LIST
	public int indexOf(Object obj)
	{
		// Create a new node to traverse the list
		int spot=-1;
		ListNode current = front;
		// While the current node is not null
		while(current != null){
			spot++;	// Increment spot
			ThingCount temp = (ThingCount)current.getValue(); // if current node value == object 
			if(temp.compareTo(new ThingCount(obj, 0)) == 0){
				return spot;  // Return the spot
			}
			current = current.getNext(); //continue through linked list 
		}
		// If the object is not found, return -1
		return -1;
	}

	//RETURNS A REFERENCE TO THE NODE AT SPOT
	private ListNode nodeAt(int spot)
	{
		ListNode current=front; // Create a new node to traverse the list
		for(int i=0; i<spot; i++){//while not null 
			// Continue in the linked list
			current = current.getNext();
		}
		return current; 
	}


	//RETURNS THE LIST AS A BIG STRING
	public String toString()
	{
		String output = ""; //add everything to output string 
		ListNode current = front; //create node to traverse the list 
		while(current != null){ //while not null
			output += current.getValue() + " ";
			current = current.getNext();
		}
		return output;
	}
}