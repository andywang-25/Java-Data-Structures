//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import java.util.List;
import java.util.ArrayList;
import static java.lang.System.*;

public class Heap
{
	private List<Integer> list;

	public Heap()
	{
		list = new ArrayList<Integer>();
	}

	public void add(int value)
	{
		list.add(value);
		System.out.println("adding: " + value); 
		swapUp(list.size()-1);
	}

   public void swapUp(int bot) //check if parent is larger than current node 
   {
		while (bot!=0) {
			int indexOfParent = ((bot - 1) / 2);  //index of bots parent 
			if (list.get(bot) > list.get(indexOfParent)) { //if child is greater than parent, swap the two 
				System.out.println(list.get(bot) + " is greater than: " + list.get(indexOfParent)); 
				swap(bot, indexOfParent); 


				//swapUp(indexOfParent); 
				bot = indexOfParent; 
				System.out.println(list.toString() +"\n"); 
			}
			else {
				break; //bot = 0. stops loop 
			}
	  }
   }

	public void remove() //removing the root node 
	{
		list.set(0,list.get(list.size()-1)); //set the root node to the last node, elimates the last node 
		list.remove(list.size()-1); //remove the last node 
		swapDown(list.size()); //swap down 
	}

	public void swapDown(int top)
	{
		int indexOfMain = 0; 
		while (indexOfMain < top) {
			int indexOfLeft = ((indexOfMain * 2) +1); //left child 
			int indexOfRight = ((indexOfMain*2) + 2); //right child 
			if(list.size() > 2) { //if the list is greater than 2, so the root has at least two children 
				if (indexOfRight < top) {
					if (list.get(indexOfRight) > list.get(indexOfLeft)) { //if the right child is greater than the left child.
						if (list.get(indexOfMain)< list.get(indexOfRight)) { //if right child is greater than root, swap the right child and current node
							System.out.println(list.get(indexOfMain) + " is less than right child: " + list.get(indexOfRight)); 
							swap(indexOfMain, indexOfRight); //swap the two nodes 
							indexOfMain = indexOfRight; //set the main index now to the previous right node index, taking its place 
							System.out.println(list.toString() + "\n"); 
						}
					} 
					else if (list.get(indexOfMain) < list.get(indexOfLeft)) { //if left child is greater than root, swap left and curret node 
						System.out.println(list.get(indexOfMain) + " is less than left child: " + list.get(indexOfLeft)); 
						swap(indexOfMain, indexOfLeft); //swap the two nodes 
						indexOfMain = indexOfLeft; //swap the main index now to the previous left node, taking its place 
						System.out.println(list.toString() +"\n"); 
					}
				}
				
				else {
					break; //bot = 0. stops loop 
				}
			}

			else { //if the heap has less than 2 elements inside 
				if (list.get(0) < list.get(1)) { //if the root is less than the other node 
					System.out.println(list.get(0) + " is less than: " + list.get(1)); 
					swap(0,1); //swap the two and thats it 
					System.out.println(list.toString()); 
					break; //break. there is nothing else to swap since it is only 2 elements 
				}		
			}
	  }
	}
	
	private void swap(int start, int finish) //swap two numbers, swap algorithm 
	{	
		int temp = list.get(start); //create temp 
		list.set(start, list.get(finish)); //set one node to the finish index 
		list.set(finish, temp); //set the finihs index node to the temp variable 
	}

	public void print()
	{
		out.println("\n\nPRINTING THE HEAP!\n\n");
		
	}

	public String toString()
	{
		return list.toString();
	}
}