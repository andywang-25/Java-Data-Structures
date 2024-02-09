//(c) A+ Computer Science
//www.apluscompsci.com

import java.util.List;
import java.util.ArrayList;
import static java.lang.System.*;
import java.io.*; 
import java.util.*; 
public class HeapSort
{
	private List<Integer> list;

	public HeapSort()
	{
		list = new ArrayList<Integer>();
	}


   public void swapUp(int index)
   {
	while (index!=0) {
		int indexOfParent = ((index - 1) / 2);  //index of indexs parent 
		if (list.get(index) > list.get(indexOfParent)) { //if child is greater than parent, swap the two 
			System.out.println(list.get(index) + " is greater than this: " + list.get(indexOfParent)); 
			swap(index, indexOfParent); 
			index = indexOfParent; 
			System.out.println(list.toString() +"\n"); 
		}
		else 
			break; //index = 0. stops loop 
 		}
	}

	public void swapDown(int top)
		{
			// If the index has two children, swap with the larger of the two. If the index only has one child, see if you need to swap.
			int leftChild = top*2+1; 
			int rightChild = top*2+2; 
			if(rightChild<list.size()) //checks if a right child exists as it would not go outside of range 
			{
				// Check which child is larger
				if(list.get(leftChild)>list.get(rightChild)) //left child is larger, then swap with left child 
				{
					// Check if you need to swap with left child
					if(list.get(top)<list.get(leftChild)) //is the left child even smaller than the current node 
					{
						swap(top,leftChild); //swap the left child with current node 
						swapDown(leftChild); //swap down again from the left child's index 
					}
				}
				else
				{
					// Check if you need to swap with right child
					if(list.get(top)<list.get(rightChild))
					{
						swap(top,rightChild);
						swapDown(rightChild);
					}
				}
			}
			// If the index only has one child, check if you need to swap
			else if(leftChild<list.size())
			{
				if(list.get(top)<list.get(leftChild)) //check if current node is less than its only child (left child) 
				{
					swap(top,leftChild);
					swapDown(leftChild);
				}
			}
		}



   public void heapSort(int[] nums) //heapsort. adds all elements from array into list. heapsort the list 
   {
	int[] answer = new int[nums.length]; 
	for (int i = 0; i < nums.length; i++) { //populate list with nums 
		list.add(nums[i]); 
		swapUp(i);
	}

	for (int i = 0; i < nums.length; i++) { 

		answer[i] = list.get(0); //set the index of the array as the max node in the list 
		
		list.set(0,list.get(list.size()-1)); //set the root node to the last node, elimates the last node 

		list.remove(list.size()-1); //remove the last node 

		if (list.size() > 1) //if the list has more than 2 elements then swap down 
			swapDown(list.size()); //swap down 
	}

	String answerString = ""; //answer string 
	Arrays.sort(answer); //sort the answer array so instead of large to small, it becomes small to large 

	for (int i = 0; i < answer.length; i++) { //add the elements from the answer array into printable string 
		System.out.println("adding: " + answer[i]);
		answerString += answer[i] + " ";
	}
	System.out.println("this is the answer: " + answerString); //print out final sorted array 
   }


   
   
   private void swap(int first, int last)
   {
		int temp = list.get(first); //create temp 
		list.set(first, list.get(last)); //set one node to the finish index 
		list.set(last, temp); //set the finihs index node to the temp variable 
  	}

	public String toString()
	{
		return list.toString();
	}
}