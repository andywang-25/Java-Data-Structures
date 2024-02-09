//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Andy Wang, Algs and Data E block 

public class HistoTree
{
   private TreeNode root;

	public HistoTree( )
	{
		root = null; 
	}
	//add 
	public void addData(Comparable data)
	{
		root = add(data, root); //add data 
	}

	//add a tree node 
	private TreeNode add(Comparable data, TreeNode tree)
	{
		//check if the data being added is already in the tree. 
		TreeNode node = search(data);
		if (node!=null) { //if there exists a node (it has the data that wants to be added), increment its thingcount by one 
			node.getValue().setCount(node.getValue().getCount()+1);
		}
		//if there is no existing node, create a new one 
		else if (tree==null) { 
			tree = new TreeNode(data); 
		}
		//if the data is less than the current tree nodes value, add to the left 
		else if (data.compareTo(tree.getValue().getThing()) < 1) {
			tree.setLeft(add(data, tree.getLeft())); 
		}
		//if the data is greater than the current tree nodes value, add to the right 
		else if (data.compareTo(tree.getValue().getThing()) >1) {
			tree.setRight(add(data, tree.getRight())); 
		}
		return tree;
	}

	public TreeNode search(Comparable data)
	{
		return search(data, root); //search for treenode that contains existing data 
	}

	//search for a tree node with the value of "data". If the tree has "data", return the tree node. 
	private TreeNode search(Comparable data, TreeNode tree)
	{
		if (tree==null) return null; 
		//if the data is smaller than the current tree node value, search the left 
		else if (data.compareTo(tree.getValue().getThing()) < 0) 
			return search(data, tree.getLeft());
		//if the data is larger than the current tree node value, search the right 
		else if (data.compareTo(tree.getValue().getThing()) > 0)
			return search(data, tree.getRight());
		//else, compareTo = 0, indicating it has reached the tree node. Return the tree node that has the same data 
		else 
			return tree; 
	}

	public String toString() //tostring 
	{
		return toString(root); 
	}

	private String toString(TreeNode tree) //in order print. left, data, right. 
	{
		if (tree != null) {
			return toString(tree.getLeft()) + " " + tree.getValue().toString() + " " + toString(tree.getRight()) + " "; 
		}
		return "";
	}
}