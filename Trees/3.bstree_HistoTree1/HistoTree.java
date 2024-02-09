//(c) A+ Computer Science
//www.apluscompsci.com

//Name -Andy Wang, Algs and Data E block

import static java.lang.System.*;

public class HistoTree
{
   private HistoNode root;

	public HistoTree( )
	{
		root = null; //constructer 
	}

	public void addData(Comparable data)
	{
		if (search(data)!=null) { //checks if a node containing this data already exists (search(data) return treenode)
			(search(data)).setDataCount(search(data).getDataCount() + 1); //set the nodes data count to itself + 1 (increment 1)
		} //search(data) will return treenode containing data

		else { //if there is no existing node that contains data, then create new node that contains data
			root = add(data,root);
		}
	}

	private HistoNode add(Comparable data, HistoNode tree)
	{
		if (tree==null)  //create new node 
			tree = new HistoNode(data,1, null, null); 
		int dirTest = data.compareTo(tree.getData());
		if (dirTest>0) { //greater than root node, then go on right side 
			tree.setRight(add(data, tree.getRight())); //recursively call
		}
		else if (dirTest<0) {
			tree.setLeft(add(data,tree.getLeft()));  //if its less, recursively call to the left 
		}
		return tree; 
	}

	public HistoNode search(Comparable data) {
		return search(data, root);
	}

	private HistoNode search(Comparable data, HistoNode tree) //return the node if it is found 
	{
		if (tree==null) //if not found, return null 
			return null; 

		int dirTest = data.compareTo(tree.getData()); 

		if (dirTest>0) { //if the data is larger than the treenode's data, search right 
			return search(data, tree.getRight());
		}
		else if (dirTest<0) //if the data is smaller than the treenode's data, search left 
			return search(data,tree.getLeft());
		else 
			return tree; 
	
	}

	public String toString() //to string 
	{
		return toString(root); 
	}

	private String toString(HistoNode tree)
	{
		if (tree != null) {
			return toString(tree.getLeft()) + " " + tree.getData() + " - " + tree.getDataCount() + " " //print out histotree in order 
					+ toString(tree.getRight());
		}
		return "";	

	}
}