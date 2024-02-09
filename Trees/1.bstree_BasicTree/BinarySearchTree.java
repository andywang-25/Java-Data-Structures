//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Andy Wang, Algs and Data E block

import static java.lang.System.*;
import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree
{
	private TreeNode root;

	public BinarySearchTree()
	{
		root = null;
	}

	public void add(Comparable val)
	{
		root = add(val, root); //add tree node 
	}


	//add tree node 
	private TreeNode add(Comparable val, TreeNode tree)
	{
	   if(tree == null) //root case, no nodes exist yet 
			tree = new TreeNode(val);
		
		Comparable treeValue = tree.getValue();
		int dirTest = val.compareTo(treeValue);
		
		//check if the node being added is greater than or less than parent node 
		if(dirTest < 0)
			tree.setLeft(add(val, tree.getLeft()));
		else if(dirTest > 0)
			tree.setRight(add(val, tree.getRight()));
		
		return tree;
	}

   public void inOrder()
	{
		inOrder(root);
		System.out.println("\n\n");
	}

	//in order tree 
	private void inOrder(TreeNode tree)
	{
		if (tree != null){
			inOrder(tree.getLeft()); //get left node 
			System.out.print(tree.getValue() + " "); //get node value 
			inOrder(tree.getRight()); //get right node 
		}
	}

	//pre order 
	public void preOrder() {
		preOrder(root);
		System.out.println("\n\n");
	}

	private void preOrder(TreeNode tree) {
		if (tree!=null) {
			System.out.println(tree.getValue() + " "); //get value 
			preOrder(tree.getLeft()); //get left node 
			preOrder(tree.getRight()); //get right node 
		}

	}
	
	//post order 
	public void postOrder() {
		postOrder(root);
		System.out.println("post order");
	}

	private void postOrder(TreeNode tree) {
		if (tree!=null) {
			postOrder(tree.getLeft()); //get left node 
			postOrder(tree.getRight()); //get right node 
			System.out.println(tree.getValue() + " "); //get data 
		}
	}

	public void revOrder() {
		revOrder(root);
		System.out.println("\n\n");
	}


	//get reverse order 
	private void revOrder(TreeNode tree) { 
		if (tree!=null) {
			revOrder(tree.getRight()); //get right node 
			System.out.println(tree.getValue() + " "); //get value 
			revOrder(tree.getLeft()); //get left node 
		}
	}

	
	

	public void deleteNode(Comparable number) {
		deleteNode(root, number);
	}

	private void deleteNode(TreeNode tree, Comparable number) {
		if (tree!=null) {
			int dirTest = number.compareTo(tree.getValue());

			if (search(tree, number)==false) //check if the node wanting to be deleted is within the tree 
				System.out.println("number is not inside the tree");

			else if (tree.getLeft()!=null && (tree.getLeft()).getValue().equals(number)) { //if the want-to-be-removed node is the left child 
				if (isLeaf(tree.getLeft())) {//leaf case 
					System.out.println("deleting left node (leaf): " + tree.getLeft().getValue());
					tree.setLeft(null); //simply just break connection. it is gone 
				}
				else if (tree.getLeft().getLeft()!=null && tree.getLeft().getRight()!=null) { //if node has two children, then find successor (smallest value on the right)
					TreeNode temp = tree.getLeft().getLeft(); //create temp node 
					System.out.println("deleting left node: " + tree.getLeft().getValue()); //print out 
					tree.setLeft(getSmallest((tree.getLeft()).getRight())); //get the successor 
					tree.getLeft().setLeft(temp); //set the new nodes left as the temp
				}
				else if (tree.getLeft().getLeft()!=null) {//check if it has a left child
					System.out.println("deleting left node: " + tree.getLeft().getValue());
					tree.setLeft(tree.getLeft().getLeft()); //set the link to the left nodes left child 
				}
				else if (tree.getLeft().getRight()!=null) { //if it has a right child 
					System.out.println("deleting left node: " + tree.getLeft().getValue());
					tree.setLeft(tree.getLeft().getRight());
				}
			}  
			
			else if (tree.getRight()!=null && (tree.getRight()).getValue().equals(number)) {//check if the right node is the removed node 
				if (isLeaf(tree.getRight())) {//leaf case 
					System.out.println("deleting right node (leaf) : " + tree.getRight().getValue());
					tree.setRight(null); //simply just break connection. it is gone 
				}
				else if (tree.getRight().getLeft()!=null && tree.getRight().getRight()!=null) { //if node has two children, then find successor (smallest value on the right)
					TreeNode temp = tree.getRight().getLeft(); //create temp node 
					System.out.println("deleting left node: " + tree.getRight().getValue()); //print out 
					tree.setRight(getSmallest((tree.getRight()).getRight())); //get the successor 
					tree.getRight().setLeft(temp); //set the new nodes left as the temp
				}
				else if (tree.getRight().getLeft()!=null) {//check if it has a left child
					System.out.println("deleting right node: " + tree.getLeft().getValue());
					tree.setRight(tree.getRight().getLeft()); //set the link to the left nodes left child
				} 
				else if (tree.getRight().getRight()!=null) {
					System.out.println("deleting right node: " + tree.getLeft().getValue());
					tree.setRight(tree.getRight().getRight());
				}
			}

			else {
				if (dirTest<0) //if the removed node is less than current node 
					deleteNode(tree.getLeft(), number); //go left 
				else //else search the right 
					deleteNode(tree.getRight(), number);
				} 
		}
	}

	//get smallest node 
	public TreeNode getSmallest() {
		return getSmallest(root);
	}
				
	private TreeNode getSmallest(TreeNode tree) {
		if (tree.getLeft()==null) return tree; //if you have no left child and you are furthest left, return yourself (smallest) 

		else
			return getSmallest(tree.getLeft()); //recursively call 
	}

	//get largest node 
	public Comparable getLargest() {
		return getLargest(root);
	}

	public Comparable getLargest(TreeNode tree) {
		if (tree == null) { //if no node then return null 
			return null;
		}
		else if (tree.getRight() == null){ //if right child is null, then return right node value (furthest right) 
			return tree.getValue();
		} else {
			return getLargest(tree.getRight()); //keep searching right 
		}
	}

	
	//get levels 
	public int getNumLevels()
	{
		return getNumLevels(root);
	}

	private int getNumLevels(TreeNode tree)
	{
		if(tree==null) //if there are no nodes return 0 
			return 0;
		else if(getNumLevels(tree.getLeft())>getNumLevels(tree.getRight())) //if the left side has more levels 
			return 1+getNumLevels(tree.getLeft()); //return 1 plus count left side levels 
		else
			return 1+getNumLevels(tree.getRight());
	}



	//get number of leaves 
	public int getNumLeaves() 
	{
		return getNumLeaves(root);
	}

	private int getNumLeaves(TreeNode tree) {

		if (tree==null) return 0; //if tree doesn't have any nodes return 0 

		else if (isLeaf(tree)) return 1; //if you are a leaf return one 

		else 
			return getNumLeaves(tree.getRight()) + getNumLeaves(tree.getLeft()); //add all leaves from the right and left side 
	}


	public boolean isLeaf(TreeNode tree) {
		if (tree.getRight()==null && tree.getLeft()==null) return true; //return true if both children are null 
		return false;
	}

	
	//get width of tree 
	public int getWidth() {
		return getWidth(root);
	}

	private int getWidth(TreeNode tree) {
		return 1 + getNumLevels(tree.getLeft()) + getNumLevels(tree.getRight()); //return 1 plus left and right levels 
	}


	//get height of tree 
	public int getHeight() {
		return getHeight(root);
	}

	private int getHeight(TreeNode tree) {
		if(tree==null)
			return 0;

		int height = 0; 

		if(getNumLevels(tree.getLeft())>getNumLevels(tree.getRight())) //if left side has more levels 
			height = 1+getNumLevels(tree.getLeft()); //return left number of levels plus one 
		else
			height = 1+getNumLevels(tree.getRight()); //else return right number of levels plus one 

		return height-1;

	}


	//check if full tree 
	public boolean isFull() {
		return isFull(root);
	}

	private boolean isFull(TreeNode tree) {
		if (tree==null) return true;

		if (isLeaf(tree)) //if the node is a leaf return true 
			return true;

		//if the doesn't have children, return recursive isFull checking if the left and right side are all leaves 
		else if (!(((tree.getLeft()!=null && tree.getRight()==null)) || ((tree.getLeft()==null && tree.getRight()!=null)))) {
			return (isFull(tree.getLeft()) && isFull(tree.getRight()));
		}
		
		return false;
	}


	//get number of nodes 
	public int getNumNodes() {
		return getNumNodes(root);
	}

	private int getNumNodes(TreeNode tree) {
		if (tree==null) return 0; //if no nodes exist return 0 
		return 1 + getNumNodes(tree.getLeft()) + getNumNodes(tree.getRight()); //recursively call 
	}


//search for a node 
	public boolean search(int number) {
		return search(root, number);
	}

	private boolean search(TreeNode tree, Comparable number) {

		if (tree!=null) {
			int dirTest = number.compareTo(tree.getValue()); //direction test 
			if (tree.getValue().equals(number)) return true;
			else if (dirTest<0) {
				return search(tree.getLeft(), number); //resursively call to the left 
			} 
			else if (dirTest>0) {
				return search(tree.getRight(), number); //recursively call to the right 
			}
		}
		return false;
	}


	//display nodes in each level 
	private void displayLevels(TreeNode tree, int levels) {
		if (tree==null) //if there is no tree just break 
			return; 
		if (levels > 1) {
			displayLevels(tree.getLeft(), levels-1);//iterate to the left 
			displayLevels(tree.getRight(), levels-1); //iterate to the right 
		}
		if (levels == 1) {
			System.out.print(tree.getValue() + " "); //upon reaching the specified level, print out the value
		}
	}


	//display like a tree 
	public void display() {
		for (int i = 0; i < getNumLevels(); i++) { 
			displayLevels(root, i);
			System.out.println();
		}
	}
	

	//to string 
	public String toString()
	{
		return toString(root);
	}

	private String toString(TreeNode tree)
	{
		String treeString = ""; 

		if (tree!=null) {
			toString(tree.getLeft()); 
			toString(tree.getRight());
			treeString += tree.getValue();
		}

		return treeString;



	}
}