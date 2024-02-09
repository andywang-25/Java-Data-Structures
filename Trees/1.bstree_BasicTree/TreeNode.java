//(c) A+ Computer Science
//www.apluscompsci.com

//Name -Andy Wang, Algs and Data E block

public class TreeNode
{
	private Comparable treeNodeValue;
	private TreeNode leftTreeNode;
	private TreeNode rightTreeNode;

	public TreeNode( ) //basic constructor 
	{
		treeNodeValue = null;
		leftTreeNode = null;
		rightTreeNode = null;
	}

	public TreeNode(Comparable value) //constructor 
	{
		treeNodeValue = value;
		leftTreeNode = null;
		rightTreeNode = null;
	}

	public TreeNode(Comparable value, TreeNode left, TreeNode right) //constructor 
	{
		treeNodeValue = value;
		leftTreeNode = left;
		rightTreeNode = right;
	}

	public Comparable getValue()
	{
		return treeNodeValue; //return value of current node 
	}

	public TreeNode getLeft()
	{
		return leftTreeNode; //return value of left node 
	}

	public TreeNode getRight()
	{
		return rightTreeNode; //return value of right node
	}

	public void setValue(Comparable
	 value)
	{
		treeNodeValue = value;
	}

	public void setLeft(TreeNode left) //change back to Treeable 
	{
		leftTreeNode = (TreeNode)left;
	}

	public void setRight(TreeNode right)
	{
		rightTreeNode = (TreeNode)right;
	}
}