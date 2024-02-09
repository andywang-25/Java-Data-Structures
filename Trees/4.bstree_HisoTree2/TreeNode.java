//(c) A+ Computer Science
//www.apluscompsci.com

//Name -Andy Wang, Algs and Data E block

public class TreeNode implements Treeable
{
	private ThingCount treeNodeValue; //changed treenodes value to a ThingCount. ThingCount stores its own value and count 
	private TreeNode leftTreeNode;
	private TreeNode rightTreeNode;

	public TreeNode( ) //basic constructor 
	{
		treeNodeValue = new ThingCount();
		treeNodeValue = null;
		leftTreeNode = null;
		rightTreeNode = null;
	}

	public TreeNode(Comparable value) //constructor 
	{
		treeNodeValue = new ThingCount();
		treeNodeValue.setThing(value);
		leftTreeNode = null;
		rightTreeNode = null;
	}

	public TreeNode(Comparable value, TreeNode left, TreeNode right) //constructor 
	{
		treeNodeValue = new ThingCount();
		treeNodeValue.setThing(value);
		leftTreeNode = left;
		rightTreeNode = right;
	}

	public ThingCount getValue() //return value, in this case return ThingCount (ThingCount has its own value and count) 
	{
		return treeNodeValue;
	}

	public TreeNode getLeft() //get left node 
	{
		return leftTreeNode;
	}

	public TreeNode getRight() //get right node 
	{
		return rightTreeNode;
	}

	public void setValue(Comparable value) //set a new value 
	{
		treeNodeValue.setThing(value);
	}

	public void setLeft(Treeable left) //set left treenode 
	{
		leftTreeNode = (TreeNode)left;
	}

	public void setRight(Treeable right) //set right treenode 
	{
		rightTreeNode = (TreeNode)right;
	}
}